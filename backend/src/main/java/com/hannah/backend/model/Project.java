/**
 * The model layer will contain the data for projects, etc.
 * This is just plain Java classes.
 * The Project class will hold the project object
 */

package com.hannah.backend.model;

public class Project {
    //project variables
    private Long id;
    private String title;
    private String description;
    private String githubURL;

    //constructor
    public Project(Long id, String title, String description, String githubURL) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.githubURL = githubURL;
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
}
