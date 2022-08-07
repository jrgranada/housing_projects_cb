package com.practice.oauth2openidproject.service;

import com.practice.oauth2openidproject.model.*;
import com.practice.oauth2openidproject.repository.HousingProjectRepository;
import com.practice.oauth2openidproject.repository.TownRepository;
import com.practice.oauth2openidproject.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HousingProjectService {

    private final HousingProjectRepository housingProjectRepository;

    @Autowired
    public HousingProjectService(HousingProjectRepository housingProjectRepository){
        this.housingProjectRepository = housingProjectRepository;
    }
    public PublicProject getPublicOffering(){

        // Se obtienes los proyectos de acceso público
        Visibility visibility = new Visibility();
        visibility.setId(Constants.PUBLIC_VISIBILITY_ID);
        List<HousingProject> housingProjects = housingProjectRepository.findByVisibilityEquals(visibility);

        PublicProject publicProject = new PublicProject();

        publicProject.setTitle(Constants.PUBLIC_PROJECT_TITLE);
        publicProject.setHousingProjects(housingProjects);

        return publicProject;
    }

    public PrivateProject getPrivateOffering(@AuthenticationPrincipal OidcUser principal) {

        // Se obtienes los proyectos de acceso privado
        Visibility visibility = new Visibility();
        visibility.setId(Constants.PRIVATE_VISIBILITY_ID);
        List<HousingProject> housingProjects = housingProjectRepository.findByVisibilityEquals(visibility);

        PrivateProject privateProject = new PrivateProject();

        privateProject.setTitle(Constants.PRIVATE_PROJECT_TITLE);
        privateProject.setFullName(principal.getFullName());
        privateProject.setEmail(principal.getEmail());
        privateProject.setHousingProjects(housingProjects);

        return privateProject;
    }

}
