package com.hannah.backend.service;

import com.hannah.backend.model.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {

    private List<Task> tasks = new ArrayList<>();

    public TaskService() {
        tasks.add(new Task(1L, "Learn Spring Boot"));
        tasks.add(new Task(2L, "Connect React frontend"));
    }

    public List<Task> getTasks() {
        return tasks;
    }
}