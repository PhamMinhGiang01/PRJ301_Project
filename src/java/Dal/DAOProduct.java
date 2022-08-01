/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dal;

import Context.DBContext;
import Model.Brand;
import Model.Category;
import Model.Product;
import Model.Technology;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pham Minh Giang
 */
public class DAOProduct extends DBContext {

//    private String id;
//    private String name;
//    private String image;
//    private Brand brand;
//    private Technology tech;
//    private Category cate;
//    private int size;
//    private double price;
//    private String des;
    public List<Product> getAll() {
        List<Product> list = new ArrayList<>();
        String sql = "select * from Product";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getString("product_id"), rs.getString("product_name"), rs.getString("product_image"),
                        rs.getString("brand_id"), rs.getString("tech_id"), rs.getString("cate_id"),
                        rs.getInt("product_size"), rs.getDouble("product_price"),
                        rs.getString("product_description")));

            }
        } catch (Exception e) {
        }
        return list;
    }

    public void delete(String id) {
        String sql = "delete from Product where product_id =?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, id);
            int rs = st.executeUpdate();
        } catch (Exception e) {
        }
    }

    public Product getProById(String id) {

        String sql = "select * from Product where product_id = ? ";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Product p = new Product();
                p.setId(rs.getString("product_id"));
                p.setName(rs.getString("product_name"));
                p.setImage(rs.getString("product_image"));
                p.setBrand_id(rs.getString("brand_id"));
                p.setCate_id(rs.getString("cate_id"));
                p.setTech_id(rs.getString("tech_id"));
                p.setSize(rs.getInt("product_size"));
                p.setPrice(rs.getDouble("product_price"));
                p.setDes(rs.getString("product_description"));
                return p;
            }
        } catch (Exception e) {
        }
        return null;
    }

    public void insert(Product p) {
        String sql = "insert into Product values(?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, p.getId());
            st.setString(2, p.getName());
            st.setString(3, p.getImage());
            st.setString(4, p.getBrand_id());
            st.setInt(5, p.getSize());
            st.setDouble(6, p.getPrice());
            st.setString(7, p.getDes());
            st.setString(8, p.getTech_id());
            st.setString(9, p.getCate_id());
            st.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void update(Product p) {
        String sql = "  update Product set product_name =?, product_image =?, tech_id =?,"
                + "  cate_id=?, brand_id=?, product_size=?, product_price=?, product_description=?"
                + "   where product_id =? ";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, p.getName());
            st.setString(2, p.getImage());
            st.setString(3, p.getTech_id());
            st.setString(4, p.getCate_id());
            st.setString(5, p.getBrand_id());
            st.setInt(6, p.getSize());
            st.setDouble(7, p.getPrice());
            st.setString(8, p.getDes());
            st.setString(9, p.getId());
            st.executeUpdate();
        } catch (Exception e) {
        }
    }

    public List<Integer> getSize() {
        List<Integer> list = new ArrayList<>();
        String sql = "SELECT DISTINCT product_size FROM Product";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                list.add(rs.getInt("product_size"));
            }
            return list;
        } catch (Exception e) {
        }
        return null;

    }

    public List<Product> search(String key, int choice) {
        List<Product> list = new ArrayList<>();
        String sql = "select * from Product "
                + "where (product_name like '%" + key + "%' or tech_id like '%" + key + "%'"
                + "or brand_id like '%" + key + "%' or product_description like '%" + key + "%') ";
        if (choice == 0) {
            sql = sql + "";
        }
        if (choice == 1) {
            sql = sql + "and cate_id = 'game'";
        }
        if (choice == 2) {
            sql = sql + "and cate_id = 'design'";
        }
        if (choice == 3) {
            sql = sql + "and cate_id = 'program'";
        }
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getString("product_id"), rs.getString("product_name"), rs.getString("product_image"),
                        rs.getString("brand_id"), rs.getString("tech_id"), rs.getString("cate_id"),
                        rs.getInt("product_size"), rs.getDouble("product_price"),
                        rs.getString("product_description")));

            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Product> filter(String cate, String brand, String tech,
            int size) {
        List<Product> list = new ArrayList<>();
        String sql = "select * from Product ";
        int count = 0;
        if (cate != null) {
            if (count == 0) {
                sql = sql + " where cate_id = '" + cate + "' ";
            } else {
                sql = sql + " and cate_id = '" + cate + "' ";
            }
            count++;
        }
        if (brand != null) {
            if (count == 0) {
                sql = sql + " where brand_id = '" + brand + "' ";
            } else {
                sql = sql + " and brand_id = '" + brand + "' ";
            }
            count++;
        }
        if (tech != null) {
            if (count == 0) {
                sql = sql + " where tech_id = '" + tech + "' ";
            } else {
                sql = sql + " and tech_id = '" + tech + "' ";
            }
            count++;
        }
        if (size != 0) {
            if (count == 0) {
                sql = sql + " where product_size = '" + size + "' ";
            } else {
                sql = sql + " and product_size = '" + size + "' ";
            }
            count++;
        }
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getString("product_id"), rs.getString("product_name"), rs.getString("product_image"),
                        rs.getString("brand_id"), rs.getString("tech_id"), rs.getString("cate_id"),
                        rs.getInt("product_size"), rs.getDouble("product_price"),
                        rs.getString("product_description")));

            }
        } catch (Exception e) {
        }
        return list;
    }
    public List<Product> fullTextSearch(String search){
        List<Product> list = new ArrayList<>();
        String sql = "";
        return list;
    }

    public static void main(String[] args) {
        DAOProduct d = new DAOProduct();
//        d.insert(new Product("aa", "aa", "aa", "lg", "tn", "game", 0, 0, "aa"));
//        d.update(new Product("mra", "giang", "giang", "lg", "tn", "game", 0, 0, "giang"));
        System.out.println(d.filter("design", null, null, 0));

    }

}
