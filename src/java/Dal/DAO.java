/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dal;

import Context.DBContext;
import Model.Product;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pham Minh Giang
 */
public class DAO extends DBContext {

    public List<String> BestShopping(int top) {
        List<String> list = new ArrayList<>();
        String sql = "select top " + top + "username from Orders group by username "
                + "order by COUNT(username) desc";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                list.add(rs.getString("username"));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Product> BestSelling(int top) {
        List<Product> list = new ArrayList<>();
        DAOProduct d = new DAOProduct();
        String sql = "select top " + top + " product_id from OrderDetails group by product_id "
                + "order by SUM(quantity) desc";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Product p = d.getProById(rs.getString("product_id"));
                list.add(p);
            }
        } catch (Exception e) {
        }
        return list;
    }

    public Double Sales(String month, String year) {

        double sale = 0;
        String sql = " Select SUM(totalmoney) from Orders where MONTH(order_date) = ? and YEAR(order_date) = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, month);
            st.setString(2, year);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                sale = rs.getDouble(1);
            }
        } catch (Exception e) {
        }
        return sale;
    }

    public static void main(String[] args) {
        DAO d = new DAO();
        System.out.println(d.BestShopping(2));
    }
}
