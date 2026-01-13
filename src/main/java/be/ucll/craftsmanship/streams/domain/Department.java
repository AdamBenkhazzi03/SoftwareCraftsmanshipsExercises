package be.ucll.craftsmanship.streams.domain;

import java.util.List;

public record Department(String name, List<Employee> employees) {}
