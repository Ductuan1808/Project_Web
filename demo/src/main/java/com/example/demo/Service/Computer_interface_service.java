package com.example.demo.Service;

import com.example.demo.Entity.Product_Entity;
import com.example.demo.Tien_Ich.Computer_DTO;

import java.util.ArrayList;

public interface Computer_interface_service {
    public ArrayList<Product_Entity> findCom(Computer_DTO Computer,String Cate_name);
    public  Product_Entity chitiet(Long id);
}
