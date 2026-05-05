package com.example.demo.DTO;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class TaskRequest {
	
    @NotBlank
    private String title;
    private String description;
    private String priority;
    private LocalDate dueDate;
    private Long userId;
    private Long projectId;
  
}
