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

    public List<Project> getProjects() {
        List<Project> projects = new ArrayList<>();
        projects.add(new Project(1L, "Portfolio", "Full stack app", "https://github.com/hannah-xia-projects/online-portfolio"));
        return projects;
    };
}
