package com.example.sem44.model;

import com.example.sem44.entity.Category;

import java.util.List;
public interface CategoryModel {

    boolean save(Category category);
    boolean update(int id ,Category category);
    boolean delete(int id);
    List<Category> findByAll();
    static Category findById(int id);
}
