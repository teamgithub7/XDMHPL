/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Springweb.repository;

import Springweb.entity.Orders;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Nguyen
 */
public interface OrderRepository extends CrudRepository<Orders, Integer> {
    
}
