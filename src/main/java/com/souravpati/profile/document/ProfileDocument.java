package com.souravpati.profile.document;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.List;
import java.util.Map;

@Document(indexName = "profile",type = "profile")
@Data
public class ProfileDocument {
    @Id
    private String id;
    private String name;
    private List<String> technologies;
    private Map<String,String> companiesWithLocations;
}
