package com.example.demo.Repository;

import com.example.demo.Entity.Product_Entity;
import com.example.demo.Tien_Ich.Computer_DTO;

import java.util.ArrayList;

public interface Computer_interface {
    public ArrayList<Product_Entity> FindComrepo(Computer_DTO Computer, String Cate_name);
    public Product_Entity timtheoid(Long id);
}
