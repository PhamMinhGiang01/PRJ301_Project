/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dal;

import Context.DBContext;
import Model.Brand;
import Model.Category;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pham Minh Giang
 */
public class DAOCategory extends DBContext {

    public List<Category> getAll() {
        List<Category> list = new ArrayList<>();
        String sql = "select * from Category";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                list.add(new Category(rs.getString("cate_id"), rs.getString("cate_name"), 
                        rs.getString("cate_description")));
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    public Category getCateById(String id) {
        String sql = "select * from Category where cate_id = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Category c = new Category();
                c.setId(rs.getString(1));
                c.setName(rs.getString(2));
                c.setDes(rs.getString(3));
                return c;
            }
        } catch (Exception e) {
        }
        return null;
    }

    public void insert(Category c) {
        String sql = "insert into Category values(?,?,?)";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, c.getId());
            st.setString(2, c.getName());
            st.setString(3, c.getDes());
            st.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void update(Category c) {
        String sql = "update Category set cate_name =?, cate_description =? where cate_id=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, c.getName());
            st.setString(2, c.getDes());
            st.setString(3, c.getId());
            st.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void delete(String id) {
        String sql = "delete from Category where cate_id =?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, id);
            int rs = st.executeUpdate();
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        DAOCategory d = new DAOCategory();
        List<Category> list = d.getAll() ; 
        for (Category category : list) {
            System.out.println(category.toString());
        }
//        System.out.println(d.getAll().get(0).getName());
        
    }
}
