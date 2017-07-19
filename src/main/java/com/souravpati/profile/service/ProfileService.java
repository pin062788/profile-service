package com.souravpati.profile.service;


import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.souravpati.profile.model.Result;
import org.apache.http.HttpEntity;
import org.apache.http.nio.entity.NStringEntity;
import org.apache.http.util.EntityUtils;
import org.elasticsearch.client.Response;
import org.elasticsearch.client.RestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.Collections;
import static com.souravpati.profile.util.SearchUtil.MATCH_ALL;
import static com.souravpati.profile.util.SearchUtil.POST;
import static com.souravpati.profile.util.SearchUtil.SEACRH_ENDPOINT;
import static org.apache.http.entity.ContentType.APPLICATION_JSON;

@Component
public class ProfileService {

    RestClient restClient;

    @Autowired
    public ProfileService(RestClient restClient) {
        this.restClient = restClient;
    }

    public String testEs() throws Exception{

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
    }

}
