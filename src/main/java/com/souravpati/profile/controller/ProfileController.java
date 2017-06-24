package com.souravpati.profile.controller;


import com.souravpati.profile.service.ProfileService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {

    @RequestMapping("/")
    public String home() throws Exception {

        ProfileService service = new ProfileService();

        return service.testEs();
    }


}
