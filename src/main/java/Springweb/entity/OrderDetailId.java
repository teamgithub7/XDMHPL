/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Springweb.entity;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author Nguyen
 */

@Embeddable

public class OrderDetailId implements Serializable {
    
    private Integer OrderId;
    private Integer vegetableId;

    public Integer getOrderId() {
        return OrderId;
    }

    public void setOrderId(Integer OrderId) {
        this.OrderId = OrderId;
    }

    public Integer getVegetableId() {
        return vegetableId;
    }

    public void setVegetableId(Integer vegetableId) {
        this.vegetableId = vegetableId;
    }
    
}
