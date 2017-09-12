package com.souravpati.profile.controller;

import com.souravpati.profile.document.ProfileDocument;
import com.souravpati.profile.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static com.souravpati.profile.util.Constants.*;
import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.http.MediaType.MULTIPART_FORM_DATA_VALUE;

@RestController
public class ProfileController {

    ProfileService service;

    @Autowired
    public ProfileController(ProfileService profileService) {
        this.service = profileService;
    }

    @CrossOrigin(origins = {URL1, URL2,URL3,URL4})
    @GetMapping("/profile")
    public ProfileDocument getProfile() throws Exception {
        return service.getProfile();
    }

    @CrossOrigin(origins = {URL1, URL2,URL3,URL4})
    @PostMapping(value = "/profile", consumes = APPLICATION_JSON_VALUE , produces = APPLICATION_JSON_VALUE )
    @ResponseStatus(CREATED)
    @ResponseBody
    public String createProfile(@RequestBody  ProfileDocument document) throws Exception {
        return service.createProfile(document);
    }

}
