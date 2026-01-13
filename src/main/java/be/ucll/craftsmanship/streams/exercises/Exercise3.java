package be.ucll.craftsmanship.streams.exercises;

import be.ucll.craftsmanship.streams.domain.Department;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Exercise3 {

    // Goal: Find the list of unique skills possessed by employees,
    // grouped by the Department name.
    // Structure needed: Map<String, List<String>>
    // where Key = Dept Name, Value = Set of unique Skills
    public static Map<String, Set<String>> getUniqueSkillsByDepartment(List<Department> departments) {
        return departments.stream()
            .collect(Collectors.toMap(
                        Department::name, 
                        dept -> dept.employees().stream()
                                .flatMap(emp -> emp.skills().stream())
                                .collect(Collectors.toSet())));
    }
}
