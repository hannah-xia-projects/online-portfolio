/**
 * This file will hand business logic, using spring framework's @Service tag
 * methods to include:
 * - getProjects
 */

package com.hannah.backend.service;

import com.hannah.backend.model.Project;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProjectService {

    /**
     * method that retrieves all projects and puts them in an array list to be sent to frontend.
     * @return an ArrayList of all project objects
     */
    public List<Project> getProjects() {
        List<Project> projects = new ArrayList<>();
        projects.add(new Project(1L, "Portfolio", "Full stack app, an online portfolio built with Java Spring and React.", "https://github.com/hannah-xia-projects/online-portfolio"));
        projects.add(new Project(2L, "Project ARDS", "Airline Reservation Database System — A simplified flight booking web app built with React, Node.js, Express, and MySQL.", "https://github.com/hannah-xia-projects/Project-ARDS"));
        projects.add(new Project(3L, "Coding Challenges", "A bunch of fun coding challenges in java, javascript, CSS, and c++ (later).", "https://github.com/hannah-xia-projects/Coding-Challenges"));
        projects.add(new Project(4L, "SENG300 f24 Project", "Online Multiplayer Board Game Platform built with JavaFX.", "https://github.com/hannah-xia-projects/seng300-f24-project"));
        projects.add(new Project(5L, "Password Manager", "A password manager built with file database and UI design.", "https://github.com/hannah-xia-projects/Password-Manager-Project-329"));
        return projects;
    };
}
