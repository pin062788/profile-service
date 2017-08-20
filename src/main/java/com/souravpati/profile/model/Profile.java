package com.souravpati.profile.model;

import lombok.Data;

import java.util.List;

@Data
public class Profile {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    private List<String> languages;
}
