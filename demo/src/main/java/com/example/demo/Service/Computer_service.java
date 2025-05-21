package com.example.demo.Service;

import com.example.demo.Entity.Product_Entity;
import com.example.demo.Repository.Computer_Repo;
import com.example.demo.Tien_Ich.Computer_DTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class Computer_service implements Computer_interface_service{
    @Autowired
    Computer_Repo computer_repo;

    @Override
    public ArrayList<Product_Entity> findCom(Computer_DTO Computer, String Cate_name) {
      ArrayList<Product_Entity> list=  computer_repo.FindComrepo(Computer,Cate_name);
        return list;
    }

    @Override
    public Product_Entity chitiet(Long id) {
        Product_Entity productEntity = computer_repo.timtheoid(id);

        return productEntity;
    }
}
