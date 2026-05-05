package com.example.demo.Entity;

import java.util.*;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    private User admin;
    @ManyToMany
    private List<User> members = new ArrayList<>();
}