package com.example.springjpa.Service;

import com.example.springjpa.Repository.CartoonRepository;
import com.example.springjpa.model.Cartoons;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class CartoonService {
    @Autowired
    CartoonRepository cartoonRepository;

    public void addCartoon(Cartoons cartoon){
        cartoonRepository.save(cartoon);
    }
    public List<Cartoons> getAllCartoon (){
       return cartoonRepository.findAll();
    }
}
