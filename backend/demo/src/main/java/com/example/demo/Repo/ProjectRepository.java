package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
