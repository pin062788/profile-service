package com.souravpati.profile.repository;

import com.souravpati.profile.document.ProfileDocument;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

@Component
public interface ProfileRepository  extends ElasticsearchRepository<ProfileDocument, String> {

}
