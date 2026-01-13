package be.ucll.craftsmanship.streams.exercises;

import be.ucll.craftsmanship.streams.domain.Employee;
import be.ucll.craftsmanship.streams.domain.Department;

import java.util.List;
import java.util.Optional;

public class Exercise6 {
    // Goal:
    // 1. Check if ANY department has an employee younger than 25.
    public static boolean hasEmployeeYoungerThan25(List<Department> departments) {

        return departments.stream()
            .flatMap(dept -> dept.employees().stream())
            .anyMatch(e -> e.age() < 25);
    }

    // 2. Find ANY employee who knows "Cloud" (return Optional).
    public static String findCloudSpecialist(List<Department> departments) {

        Optional<Employee> cloudExpert = departments.stream()
            .flatMap(dept -> dept.employees().stream())
            .filter(e -> e.role().contains("Cloud"))
            .findAny();

        // TODO Implement the stream to find the employee with "Cloud" skill
        // return "Found Cloud Expert:  + name()" or "No Cloud Expert Found"
        return cloudExpert
            .map(e -> "Found Cloud Expert:  + name()" + e.name())
            .orElse("No Cloud Expert Found");
    }

}
