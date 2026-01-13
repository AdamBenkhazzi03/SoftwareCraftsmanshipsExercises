package be.ucll.craftsmanship.streams.domain;

import java.util.List;

public record Employee(
        String name,
        int age,
        String role,
        List<String> skills,
        List<Project> projects
) {}
