package com.example.demo.Entity;

import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;

    @Enumerated(EnumType.STRING)
    private Status status;

    private String priority;
    private LocalDate dueDate;

    @ManyToOne
    private User assignedUser;

    @ManyToOne
    private Project project;
}