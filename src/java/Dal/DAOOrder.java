/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dal;

import Context.DBContext;
import Model.Account;
import Model.Cart;
import Model.Customer;
import Model.Item;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;

/**
 *
 * @author Pham Minh Giang
 */
public class DAOOrder extends DBContext {

    public void addOrder(Customer u, Cart cart) {
        LocalDate curdate = java.time.LocalDate.now();
        String date = curdate.toString();
        try {
            String sql = "insert into Orders values(?,?,?)";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, u.getId());
            st.setString(2, date);
            st.setDouble(1, cart.getTotalMoney());
            st.executeUpdate();

            // lấy ra id của order vừa add
            String sql1 = "select top 1 order_id from Orders order by order_id desc";
            PreparedStatement st1 = connection.prepareStatement(sql1);
            ResultSet rs = st1.executeQuery();

            //  add vào bảng Order detail
            if (rs.next()) {
                int oid = rs.getInt(1);
                for (Item i : cart.getItems()) {
                    String sql2 = "insert into OrderDetails values(?,?,?,?)";
                    PreparedStatement st2 = connection.prepareStatement(sql2);
                    st2.setInt(1, oid);
                    st2.setString(2, i.getProduct().getId());
                    st2.setInt(3, i.getQuantity());
                    st2.setDouble(4, i.getPrice());
                    st2.executeUpdate();
                }
            }
        } catch (Exception e) {
        }
    }

//    public void addOrder1(Account a, Cart cart) {
    public void addOrder1(Account a, Cart cart) {
        LocalDate curdate = java.time.LocalDate.now();
        String date = curdate.toString();
        try {
            String sql = "insert into Orders values(?,?,?)";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, a.getUsername());
            st.setString(2, date);
            st.setDouble(3, cart.getTotalMoney());
            st.executeUpdate();

            // lấy ra id của order vừa add
            String sql1 = "select top 1 order_id from Orders order by order_id desc";
            PreparedStatement st1 = connection.prepareStatement(sql1);
            ResultSet rs = st1.executeQuery();

            //  add vào bảng Order detail
            if (rs.next()) {
                int oid = rs.getInt(1);
                for (Item i : cart.getItems()) {
                    String sql2 = "insert into OrderDetails values(?,?,?,?)";
                    PreparedStatement st2 = connection.prepareStatement(sql2);
                    st2.setInt(1, oid);
                    st2.setString(2, i.getProduct().getId());
                    st2.setInt(3, i.getQuantity());
                    st2.setDouble(4, i.getPrice());
                    st2.executeUpdate();
                }
            }
        } catch (Exception e) {
        }
    }
}
