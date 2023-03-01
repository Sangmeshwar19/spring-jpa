package com.example.springjpa.Controller;

import com.example.springjpa.Service.CartoonService;
import com.example.springjpa.model.Cartoons;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CartoonController {
    @Autowired
    CartoonService cartoonService;
    @GetMapping("/get_Cartoon")
    public List<Cartoons> getAllCartoons(){
        return cartoonService.getAllCartoon();
    }
    @PostMapping("/add_Cartoon")
    public void addCartoons(@RequestBody Cartoons cartoon){
       cartoonService.addCartoon(cartoon);
    }
}
