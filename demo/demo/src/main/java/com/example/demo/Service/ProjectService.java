package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.Project;
import com.example.demo.Entity.User;
import com.example.demo.Repo.ProjectRepository;
import com.example.demo.Repo.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProjectService {

    private final ProjectRepository projectRepository;
    private final UserRepository userRepository;

    public Project createProject(String name, String email) {

        User user = userRepository.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("User not found"));

        Project project = new Project();
        project.setName(name);
        project.setAdmin(user);

        return projectRepository.save(project);
    }

    public List<Project> getProjects() {
        return projectRepository.findAll();
    }

    public Project addMember(Long projectId, Long userId) {

        Project project = projectRepository.findById(projectId)
                .orElseThrow(() -> new RuntimeException("Project not found"));

        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));

        project.getMembers().add(user);

        return projectRepository.save(project);
    }
}