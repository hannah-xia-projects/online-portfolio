/**
 * The model layer will contain the data for projects, etc.
 * This is just plain Java classes.
 * The Project class will hold the project object
 */

package com.hannah.backend.model;

import java.util.List;

public class Project {
    //project variables
    private Long id;
    private String title;
    private String description;
    private String githubURL;

    //variables for filtering feature
    //allow the user to filter projects in project page
    private boolean hasFrontend;
    private boolean hasBackend;
    private List<String> techStack; //a list that contains the tech stack used
    private List<String> languages; //a list that contains the languages used for each project

    //constructor
    public Project(Long id, String title, String description, String githubURL, boolean hasFrontend, boolean hasBackend, List<String> techStack, List<String> languages) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.githubURL = githubURL;

        this.hasFrontend = hasFrontend;
        this.hasBackend = hasBackend;
        this.techStack = techStack;
        this.languages = languages;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getGithubURL() {
        return githubURL;
    }

    public boolean isHasFrontend() {
        return hasFrontend;
    }

    public boolean isHasBackend() {
        return hasBackend;
    }

    public List<String> getTechStack() {
        return techStack;
    }

    public List<String> getLanguages() {
        return languages;
    }
}
