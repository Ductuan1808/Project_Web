package com.example.demo.Controler;

import com.example.demo.Entity.Product_Entity;
import com.example.demo.Service.Computer_service;
import com.example.demo.Tien_Ich.Computer_DTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class HelloController {
    @Autowired
    Computer_service computerService;
    @GetMapping("/web_PC" )
    public ArrayList<Product_Entity> Timpc(@ModelAttribute Computer_DTO Computer,
                                           @RequestParam(value = "Cate_name",required = false) String Cate_name) {
        ArrayList<Product_Entity> list = computerService.findCom(Computer,Cate_name);
        return list;
    }

    @GetMapping("/web_PC/{id}")
    public Product_Entity chitietsanpham(@RequestParam Long id){
        return computerService.chitiet(id);
    }
}