package com.souravpati.profile.model;

import lombok.Data;

import java.util.List;
@Data
public class Project {
    private String name ;
    private String  description;
    private List<Technologies> technologies;
}
