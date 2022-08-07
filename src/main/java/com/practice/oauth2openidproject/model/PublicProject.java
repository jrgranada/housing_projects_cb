package com.practice.oauth2openidproject.model;

import java.util.List;

public class PublicProject {

    private String title;

    private List<HousingProject> housingProjects;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<HousingProject> getHousingProjects() {
        return housingProjects;
    }

    public void setHousingProjects(List<HousingProject> housingProjects) {
        this.housingProjects = housingProjects;
    }
}
