package com.example.demo.Repo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Status;
import com.example.demo.Entity.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

    List<Task> findByAssignedUserId(Long userId);

    long countByStatus(Status status);
}
