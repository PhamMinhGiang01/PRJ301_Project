/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dal;

import Context.DBContext;
import Model.Brand;
import Model.Technology;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pham Minh Giang
 */
public class DAOTechnology extends DBContext {

    public List<Technology> getAll() {
        List<Technology> list = new ArrayList<>();
        String sql = "select * from Technology";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                list.add(new Technology(rs.getString("tech_id"), rs.getString("tech_name"), rs.getString("tech_description")));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public Technology getTechById(String id) {
        String sql = "select * from Technology where tech_id = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Technology t = new Technology();
                t.setId(rs.getString(1));
                t.setName(rs.getString(2));
                t.setDes(rs.getString(3));
                return t;
            }
        } catch (Exception e) {
        }
        return null;
    }

    public void insert(Technology t) {
        String sql = "insert into Technology values(?,?,?)";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, t.getId());
            st.setString(2, t.getName());
            st.setString(3, t.getDes());
            st.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void update(Technology t) {
        String sql = "update Technology set tech_name =?, tech_description =? where tech_id=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, t.getName());
            st.setString(2, t.getDes());
            st.setString(3, t.getId());
            st.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void delete(String id) {
        String sql = "delete from Technology where tech_id =?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, id);
            int rs = st.executeUpdate();
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        DAOTechnology d = new DAOTechnology();
        System.out.println(d.getAll().get(0).getName());
    }
}
