package com.practice.oauth2openidproject.controller;

import com.practice.oauth2openidproject.model.PrivateProject;
import com.practice.oauth2openidproject.model.PublicProject;
import com.practice.oauth2openidproject.service.HousingProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/housing-projects")
public class HousingProjectController {

    private final HousingProjectService housingProjectService ;

    @Autowired
    public HousingProjectController(HousingProjectService housingProjectService){
        this.housingProjectService = housingProjectService;
    }

    @GetMapping("/")
    public PublicProject publicOffering(){

        PublicProject publicProject = this.housingProjectService.getPublicOffering();
        return publicProject;
    }

    @GetMapping("/private-offering")
    public PrivateProject privateOffering(@AuthenticationPrincipal OidcUser principal){

        PrivateProject privateProject = this.housingProjectService.getPrivateOffering(principal);

        return privateProject;
    }
}
