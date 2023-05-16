/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Springweb.controller;

import Springweb.entity.Vegetable;
import Springweb.repository.VegetableRepository;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Nguyen
 */
@Controller
public class homeController {

    @Autowired
    private VegetableRepository vegtableRepository;

    @GetMapping("/")
    public String getProducts(Model m) {
        List<Vegetable> list = (List<Vegetable>) vegtableRepository.findAll();
        Collections.sort(list, Comparator.comparing(Vegetable::getAmount).reversed());
        
        m.addAttribute("data", list);
        return "home";
    }

}
