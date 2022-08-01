/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dal;

import Context.DBContext;
import Model.Brand;
import Model.Product;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pham Minh Giang
 */
public class DAOBrand extends DBContext {

    public List<Brand> getAll() {
        List<Brand> list = new ArrayList<>();
        String sql = "select * from Brand";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                list.add(new Brand(rs.getString("brand_id"), rs.getString("brand_name"), rs.getString("brand_description")));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public Brand getBrandById(String id) {
        String sql = "select * from Brand where brand_id = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Brand b = new Brand();
                b.setId(rs.getString(1));
                b.setName(rs.getString(2));
                b.setDes(rs.getString(3));
                return b;
            }
        } catch (Exception e) {
        }
        return null;
    }

    public void insert(Brand b) {
        String sql = "insert into Brand values(?,?,?)";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, b.getId());
            st.setString(2, b.getName());
            st.setString(3, b.getDes());
            st.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void update(Brand b) {
        String sql = "update Brand set brand_name =?, brand_description =? where brand_id=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, b.getName());
            st.setString(2, b.getDes());
            st.setString(3, b.getId());
            st.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void delete(String id) {
        String sql = "delete from Brand where brand_id =?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, id);
            int rs = st.executeUpdate();
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        DAOBrand d = new DAOBrand();
//        System.out.println(d.getAll().get(0).getName());
        System.out.println(d.getBrandById("lg"));
    }

}
