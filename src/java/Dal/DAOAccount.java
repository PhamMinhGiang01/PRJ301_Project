/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dal;

import Context.DBContext;
import Model.Account;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Pham Minh Giang
 */
public class DAOAccount extends DBContext {

    public Account login(String username, String password) {
        String sql = "select * from Account where username = ? and password = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, username);
            st.setString(2, password);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Account a = new Account(username, password);
                return a;
            }
        } catch (Exception e) {
        }
        return null;
    }

    public Account regist(String user) {
        String sql = "select * from Account where username = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, user);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Account a = new Account(rs.getString("username"), rs.getString("password"));
                return a;
            }
        } catch (Exception e) {
        }
        return null;
    }
    public void insert(String user, String pass){
        String sql = "insert into Account values(?,?)";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, user);
            st.setString(2, pass);
            st.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public static void main(String[] args) {
        DAOAccount d = new DAOAccount();
        d.insert("hanh", "123");
        System.out.println(d.login("hanh", "123").toString());
    }
}
