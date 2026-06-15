package com.hannah.backend.service;

import com.hannah.backend.model.Skill;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SkillService {

    public List<Skill> getAllSkills() {
        List<Skill> skills = new ArrayList<>();
        skills.add(new Skill("Java", "Advanced"));
        skills.add(new Skill("React", "Intermediate"));
        skills.add(new Skill("Spring Boot", "Intermediate"));
        skills.add(new Skill("Python", "Advanced"));
        skills.add(new Skill("C/C++", "Advanced"));
        skills.add(new Skill("Database", "Advanced"));
        skills.add(new Skill("Computer Graphics", "Intermediate"));
        skills.add(new Skill("Organization", "Advanced"));
        skills.add(new Skill("Teamwork", "Advanced"));
        skills.add(new Skill("Problem Solving", "Advanced"));

        return skills;
    }
}
