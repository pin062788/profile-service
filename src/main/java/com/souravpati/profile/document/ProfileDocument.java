package com.souravpati.profile.document;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.List;

@Document(indexName = "profile",type = "profile")
@Data
public class ProfileDocument {
    @Id
    private String id;
    private String name;
    private List<String> languages;
}
