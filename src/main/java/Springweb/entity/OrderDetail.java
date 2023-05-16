/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Springweb.entity;

import javax.persistence.*;
import lombok.Data;

/**
 *
 * @author Nguyen
 */
@Data
@Entity(name = "OrderDetail")
@Table(name = "OrderDetail")
public class OrderDetail {

    @EmbeddedId
    private OrderDetailId Id;

    private Integer Quanity;
    private Double Price;

    public OrderDetailId getId() {
        return Id;
    }

    public void setId(OrderDetailId id) {
        this.Id = id;
    }

    public Integer getQuanity() {
        return Quanity;
    }

    public void setQuanity(Integer Quanity) {
        this.Quanity = Quanity;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double Price) {
        this.Price = Price;
    }

}
