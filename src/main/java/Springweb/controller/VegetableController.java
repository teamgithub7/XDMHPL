package Springweb.controller;




import Springweb.*;
import Springweb.entity.Vegetable;
import Springweb.repository.VegetableRepository;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author caothanh
 */
@Controller
public class VegetableController {

    @Autowired
    private VegetableRepository vegtableRepository;
    
    @GetMapping("/index")
    public @ResponseBody Iterable<Vegetable> index(Model m)
    {
        return  vegtableRepository.findAll();
        //m.addAttribute("data", list);
        //return "home";
        
    }
    @GetMapping("/all")
    public String getAll(Model m)
    {
        Iterable<Vegetable> list = vegtableRepository.findAll();
        m.addAttribute("data", list);
        return "home";
        
    }
    
}
