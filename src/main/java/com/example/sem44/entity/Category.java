package com.example.sem44.entity;

import com.example.sem44.entity.statusenum.CategoryStatus;
import com.example.sem44.entity.base.BaseEntity;

import java.time.LocalDateTime;

import java.time.LocalDateTime;

public class Category extends BaseEntity {
    private int id;
    private String name;
    private CategoryStatus status;
    public LocalDateTime createdAt;
    public LocalDateTime updatedAt;
    public LocalDateTime deletedAt;
    public int createdBy;
    public int updatedBy;
    public int deletedBy;


    public Category(int id, String name, LocalDateTime createdAt, LocalDateTime updatedAt, LocalDateTime deletedAt, int createdBy, int updatedBy, int deletedBy, CategoryStatus status) {
    }

    public Category() {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CategoryStatus getStatus() {
        return status;
    }

    public void setStatus(CategoryStatus status) {
        this.status = status;
    }



}