package com.souravpati.profile.controller;

import com.souravpati.profile.document.ProfileDocument;
import com.souravpati.profile.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.souravpati.profile.util.Constants.URL1;
import static com.souravpati.profile.util.Constants.URL2;

@RestController
public class ProfileController {

    ProfileService service;

    @Autowired
    public ProfileController(ProfileService profileService) {
        this.service = profileService;
    }

    @CrossOrigin(origins = {URL1, URL2})
    @RequestMapping("/profile")
    public ProfileDocument getProfile() throws Exception {
        return service.getProfile();
    }


}
