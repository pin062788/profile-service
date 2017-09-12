package com.souravpati.profile.model;

import lombok.Data;

import java.util.List;
@Data
public class Company {
    private String name;
    private Address address;
    private List<Project> projects;
}
