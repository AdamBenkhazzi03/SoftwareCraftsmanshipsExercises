package be.ucll.craftsmanship.streams.exercises;

import be.ucll.craftsmanship.streams.domain.Department;
import be.ucll.craftsmanship.streams.domain.Project;

import java.util.List;

public class Exercise2 {
    public static double getTotalBudgetOfActiveProjectsInDepartment(List<Department> departments, String departmentName) {
        // TODO Implement this method
        return departments.stream()
            .filter(dept -> dept.name() == departmentName)
            .flatMap(dept -> dept.employees().stream())
            .flatMap(emp -> emp.projects().stream())
            .distinct()
            .filter(Project::active)
            .mapToDouble(Project::budget)
            .sum();
    }
}
