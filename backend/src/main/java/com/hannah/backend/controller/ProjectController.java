/**
 * This file will handle http requests regarding projects.
 * We will use spring's RestController to handle http requests
 *
 * The @RestController annotation in Spring is a specialized version of the @Controller annotation.
 * It is primarily used to create RESTful web services by combining two key annotations:
 * @Controller: This annotation marks a class as a Spring-managed component that handles HTTP requests.
 * It is typically used in MVC-based applications to return views (e.g., HTML pages).
 * @ResponseBody: This annotation ensures that the return value of a method is serialized directly into the
 * HTTP response body (e.g., JSON or XML). It eliminates the need to annotate each method individually with @ResponseBody.
 *
 * RestController simplifies APIs by automatically making responses into JSON or XML, since we are using React, we want JSON
 */

package com.hannah.backend.controller;

import com.hannah.backend.model.Project;
import com.hannah.backend.service.ProjectService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/projects") //this is the url after local host to display all projects
@CrossOrigin(origins = "http://localhost:5173") //to put the contents into the frontend local host
public class ProjectController {
    //the project service object for project controller
    private final ProjectService projectService;

    //constructor for projectController
    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    //all http calls --> getMapping from spring
    @GetMapping
    public List<Project> getProjects() {
        return projectService.getProjects();
    }
}
