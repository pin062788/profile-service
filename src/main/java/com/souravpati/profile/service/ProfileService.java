package com.souravpati.profile.service;



import com.souravpati.profile.document.ProfileDocument;

import com.souravpati.profile.repository.ProfileRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

import java.util.List;

@Component
public class ProfileService {

    // private RestClient restClient;
    private ProfileRepository repository;

    @Autowired
    public ProfileService( ProfileRepository repository) {
        this.repository = repository;

    }


    public ProfileDocument getProfile() {
        Iterable<ProfileDocument> documents = repository.findAll();
        List<ProfileDocument> documentList = new ArrayList<>();
        documents.forEach(documentList::add);
        return documentList.get(0);
    }

    /**Todo eventually need to use Elasticsearch http port on a different aws container ; for now the embedded ES will do */
   /*
   public String testEs() throws Exception {

        //index a document
        HttpEntity entity = new NStringEntity(
                MATCH_ALL, APPLICATION_JSON);

        Response indexResponse = restClient.performRequest(
                POST,
                SEACRH_ENDPOINT,
                Collections.<String, String>emptyMap(),
                entity);

        restClient.close();

        Gson gosn = new Gson();
        //Result result = gosn.fromJson(EntityUtils.toString(indexResponse.getEntity()),Result.class);

        JsonObject jobj = new Gson().fromJson(EntityUtils.toString(indexResponse.getEntity()), JsonObject.class);

        String result = jobj.get("hits").toString();
        return result;
    }*/

}
