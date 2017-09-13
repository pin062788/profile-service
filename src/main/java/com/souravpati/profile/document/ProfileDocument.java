package com.souravpati.profile.document;


import com.souravpati.profile.model.Company;
import com.souravpati.profile.model.Technologies;
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
    private String firstName;
    private String lastName;
    private List<Technologies> technologies;
    private List<Company> companies;
}
