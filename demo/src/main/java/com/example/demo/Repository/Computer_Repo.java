package com.example.demo.Repository;

import com.example.demo.Connector.Connect;
import com.example.demo.Entity.Categories_Entity;
import com.example.demo.Entity.Product_Entity;
import com.example.demo.Tien_Ich.Computer_DTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

@Repository
public class Computer_Repo implements Computer_interface{
@Autowired
    ModelMapper mapper;

    @Override
    public ArrayList<Product_Entity> FindComrepo(Computer_DTO Computer, String Cate_name) {
        Connection c = Connect.connect();
        StringBuilder sql = new StringBuilder();
        ArrayList<Product_Entity>list = new ArrayList<>();

        sql.append(" Select * from products as c ");
        if ( Cate_name != null && ! Cate_name.isEmpty()) {
            sql.append("Inner Join categories on c.category_id = categories.id ");
        }
        sql.append(" where 1=1 ");
        if(Computer.getPrice_from()!=null){
            sql.append(" And c.price > "+Computer.getPrice_from()+" ");
        }
        if(Computer.getPrice_to()!=null){
            sql.append(" And c.price < "+Computer.getPrice_to()+" ");
        }
        try {
            Statement st = c.createStatement();
            ResultSet rs =st.executeQuery(sql.toString());

            while (rs.next()){
                Product_Entity productEntity=new Product_Entity();
                productEntity.setName(rs.getNString("name"));
                productEntity.setDescription(rs.getNString("description"));
                productEntity.setPrice(rs.getLong("price"));
                productEntity.setQuantity(rs.getInt("quantity"));
                productEntity.setImage_url(rs.getNString("image_url"));
                productEntity.setCreate_at(rs.getTimestamp("created_at"));
                Categories_Entity categoriesEntity= new Categories_Entity();
                categoriesEntity.setId(rs.getInt("category_id"));
                productEntity.setCate_id(categoriesEntity);
                list.add(productEntity);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return list;
    }


    @Override
    public Product_Entity timtheoid(Long id) {
        Product_Entity productEntity = new Product_Entity();

        if (id!=null){
            Connection c =Connect.connect();
            StringBuilder sql = new StringBuilder("Select * from products as p where id = "+id+" ");
            try {
                Statement st= c.createStatement();
                ResultSet rs =st.executeQuery(sql.toString());
                productEntity.setId(rs.getInt("id"));
                productEntity.setCreate_at(rs.getTimestamp("created_at"));
                productEntity.setQuantity(rs.getInt("quantity"));
                productEntity.setPrice(rs.getLong("price"));
                Categories_Entity categoriesEntity = new Categories_Entity();
                categoriesEntity.setId(rs.getInt("category_id"));
                productEntity.setCate_id(categoriesEntity);
                productEntity.setName(rs.getNString("name"));
                productEntity.setImage_url(rs.getNString("image_url"));
                productEntity.setDescription(rs.getNString("description"));
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }
        return productEntity;
    }


}
