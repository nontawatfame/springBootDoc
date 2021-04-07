package com.example.demo.dto;

import java.util.List;

public class OrderResponseCustomer {
    private int id;
    private String name;
    private List<String> projectName;
    
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
    public List<String> getProjectName() {
        return projectName;
    }
    public void setProjectName(List<String> projectName) {
        this.projectName = projectName;
    }
    
    public OrderResponseCustomer(int id, String name, List<String> projectName) {
        this.id = id;
        this.name = name;
        this.projectName = projectName;
    }
}
