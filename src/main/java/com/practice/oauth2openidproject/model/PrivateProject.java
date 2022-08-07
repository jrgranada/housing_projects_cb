package com.practice.oauth2openidproject.model;

import java.util.List;

public class PrivateProject {

    private String title;

    private String fullName;

    private String email;

    private List<HousingProject> housingProjects;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<HousingProject> getHousingProjects() {
        return housingProjects;
    }

    public void setHousingProjects(List<HousingProject> housingProjects) {
        this.housingProjects = housingProjects;
    }
}
