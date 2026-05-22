/**
 * This file will hand business logic, using spring framework's @Service tag
 * methods to include:
 * - getProjects
 */

package com.hannah.backend.service;

import com.hannah.backend.model.Project;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

    public List<Project> getProjects() {
        return null;
    };
}
