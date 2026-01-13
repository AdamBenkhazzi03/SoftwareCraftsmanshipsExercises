package be.ucll.craftsmanship.streams.exercises;

import be.ucll.craftsmanship.streams.domain.Department;
import be.ucll.craftsmanship.streams.domain.Employee;

import java.util.List;

public class Exercise1 {
    public static List<String> getNamesOfEmpoyeesOlderThan30(List<Department> departments) {
        return departments.stream()
            .flatMap(dept -> dept.employees().stream())
            .filter(emp-> emp.age() > 30)
            .map(Employee::name)
            .toList();
    }
}
