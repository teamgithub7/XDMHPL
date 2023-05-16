/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Springweb.controller;

import Springweb.entity.OrderDetail;
import Springweb.repository.OrderDetailRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Nguyen
 */
@Controller
public class OrderDetailController {
    @Autowired OrderDetailRepository orderDetailRepository;
    
    @GetMapping (value = "/OrderDetail")
    public String getAll(Model model){
        Iterable<OrderDetail> list = orderDetailRepository.findAll();
        model.addAttribute("list",list);
        return "OrderDetail";
    }
}
