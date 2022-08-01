/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Date;

/**
 *
 * @author Pham Minh Giang
 */
public class Order {
    private String id;
    private String date;
    private String cusid;
    private double totalmoney;

    public Order() {
    }

    public Order(String id, String date, String cusid, double totalmoney) {
        this.id = id;
        this.date = date;
        this.cusid = cusid;
        this.totalmoney = totalmoney;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCusid() {
        return cusid;
    }

    public void setCusid(String cusid) {
        this.cusid = cusid;
    }

    public double getTotalmoney() {
        return totalmoney;
    }

    public void setTotalmoney(double totalmoney) {
        this.totalmoney = totalmoney;
    }
    
    
}
