/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Springweb.entity;

import java.sql.Date;
import javax.persistence.*;

/**
 *
 * @author Nguyen
 */

@Entity
@Table(name = "`Order`")

public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer OrderId;

    private Date date;

    private String Note;

    private Integer Total;

    private Integer CustomerID;
    
    public Integer getTotal() {
        return Total;
    }

    public void setTotal(Integer Total) {
        this.Total = Total;
    }



    public Integer getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(Integer CustomerID) {
        this.CustomerID = CustomerID;
    }


    public Integer getOrderId() {
        return OrderId;
    }

    public void setOrderId(Integer OrderId) {
        this.OrderId = OrderId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getNote() {
        return Note;
    }
    public void setNote(String Note){
        this.Note = Note;
    }
    
}
