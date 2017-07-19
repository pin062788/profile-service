package com.souravpati.profile.controller;



import com.souravpati.profile.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {

    ProfileService service;
    @Autowired
    public ProfileController(ProfileService profileService) {
        this.service = profileService;
    }

    @RequestMapping("/")
    public String home() throws Exception {
        return "Eureka!!";

    }


}
