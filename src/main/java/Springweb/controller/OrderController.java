/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Springweb.controller;

import Springweb.entity.Orders;
import Springweb.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Nguyen
 */
@Controller
public class OrderController {

    @Autowired
    private OrderRepository OrderRepository;

    @GetMapping("/Order")
    public String getAll(Model m) {
        Iterable<Orders> list = OrderRepository.findAll();
        m.addAttribute("data", list);
        return "Order";

    }

}
