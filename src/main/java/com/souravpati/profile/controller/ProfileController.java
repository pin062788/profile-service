package com.souravpati.profile.controller;



import com.souravpati.profile.model.Profile;
import com.souravpati.profile.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProfileController {

    ProfileService service;
    @Autowired
    public ProfileController(ProfileService profileService) {
        this.service = profileService;
    }

    @CrossOrigin(origins = {"http://52.27.241.180","http://ec2-52-27-241-180.us-west-2.compute.amazonaws.com"})
    @RequestMapping("/")
    public List<Profile> home() throws Exception {
        Profile profile = new Profile();
        List<Profile> profiles = new ArrayList<>();
        profile.setName("Sourav");
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("J2EE");
        list.add("Elasticsearch");
        list.add("Docker");
        profiles.add(profile);
        profile.setLanguages(list);


        return  profiles;
    }




}
