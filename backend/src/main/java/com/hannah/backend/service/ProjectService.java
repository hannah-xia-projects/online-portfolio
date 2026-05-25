/**
 * This file will hand business logic, using spring framework's @Service tag
 * methods to include:
 * - getProjects
 * - getFilteredProjects
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
        projects.add(new Project(1L, "Portfolio", "Full stack app, an online portfolio built with Java Spring and React.", "https://github.com/hannah-xia-projects/online-portfolio", true, true, List.of("Spring Boot", "React"), List.of("Java", "CSS", "JavaScript", "HTML")));
        projects.add(new Project(2L, "Project ARDS", "Airline Reservation Database System — A simplified flight booking web app built with React, Node.js, Express, and MySQL.", "https://github.com/hannah-xia-projects/Project-ARDS", true, true, List.of("React", "Tailwind CSS", "Node.js", "Express", "MySQL"), List.of("JavaScript", "CSS", "HTML")));
        projects.add(new Project(3L, "Coding Challenges", "A bunch of fun coding challenges in java, javascript, CSS, and c++ (later).", "https://github.com/hannah-xia-projects/Coding-Challenges", true, true, List.of("LeetCode, HackerRank"), List.of("Java", "JavaScript", "HTML", "CSS")));
        projects.add(new Project(4L, "SENG300 f24 Project", "Online Multiplayer Board Game Platform built with JavaFX.", "https://github.com/hannah-xia-projects/seng300-f24-project", true, true, List.of("JavaFX", "JSON", "File I/O"), List.of("Java")));
        projects.add(new Project(5L, "Password Manager", "A password manager built with file database and UI design.", "https://github.com/hannah-xia-projects/Password-Manager-Project-329", false, true, List.of("File I/O", "Encryption", "Authentication"), List.of("Java")));
        return projects;
    };

    /**
     * method that retrieves all filtered projects
     *
     * @param language the language filtered to
     * @param frontend if the project has a frontend or not
     * @param backend if the project has a backend or not
     * @param tech what tech stack is being filtered to
     * @return the list of filtered projects
     */
    public List<Project> getFilteredProjects(String language, Boolean frontend, Boolean backend, String tech) {
        List<Project> projects = getProjects(); //get all projects and filter the ones that are inputed in parameters

        //use .stream and filter to filter out the projects that apply to the condition parameters
        return projects.stream().filter(p -> language == null || p.getLanguages().contains(language)) //if the language of this project p contains it in its list of languages
                .filter(p -> frontend == null || p.isHasFrontend()== frontend)
                .filter(p -> backend == null || p.isHasBackend() == backend)
                .filter(p -> tech == null || p.getTechStack().contains(tech)).toList();
    };
}
