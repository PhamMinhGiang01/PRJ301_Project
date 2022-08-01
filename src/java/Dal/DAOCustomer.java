/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dal;

import Context.DBContext;
import Model.Customer;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Pham Minh Giang
 */
public class DAOCustomer extends DBContext{
    public Customer getAccount(String user, String pass){
        String sql = "select * from Customer where customer_username=? and customer_password=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, user);
            st.setString(2, pass);
            ResultSet rs = st.executeQuery();
            if(rs.next()){
                return new Customer(   );
            }
        } catch (Exception e) {
        }
        return null;
    }
}
