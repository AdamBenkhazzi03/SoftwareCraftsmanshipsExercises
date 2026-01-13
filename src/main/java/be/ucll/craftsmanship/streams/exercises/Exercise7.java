package be.ucll.craftsmanship.streams.exercises;

import be.ucll.craftsmanship.streams.domain.Department;
import be.ucll.craftsmanship.streams.domain.Project;

import java.util.List;

public class Exercise7 {

    public static double calculateMegaBudget(List<Department> departments) {

        // Goal: Calculate the "Mega Budget" (Sum of all budgets, including inactive)
        // using reduce()
        // without using sum(), starting with 0.0

        return departments.stream()
            .flatMap(dept -> dept.employees().stream())
            .flatMap(emp -> emp.projects().stream())
            .distinct()
            .map(Project::budget)
            .reduce(0.0, Double::sum);
    }
}
