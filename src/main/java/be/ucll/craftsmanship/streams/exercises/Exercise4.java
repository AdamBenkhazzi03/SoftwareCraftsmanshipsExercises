package be.ucll.craftsmanship.streams.exercises;

import be.ucll.craftsmanship.streams.domain.Employee;
import be.ucll.craftsmanship.streams.domain.Department;

import java.util.List;

public class Exercise4 {
    /**
     * Goal: Pair every "Developer" from "Tech" with every "Manager" from "HR".
     * meaning: first of developers with first of managers,
     * second of developers with second of managers, etc.
     * Returns strings in format: "DevName is mentored by MgrName"
     */
    public static List<String> createMentorshipPairs(List<Department> departments) {

        // 2 intermediate lists
        List<Employee> techDevs = departments.stream()
            .filter(d -> d.name().equals("Tech"))
            .flatMap(d -> d.employees().stream())
            .filter(e -> e.role().equals("Developer"))
            .toList();

        List<Employee> hrManagers = departments.stream()
            .filter(d -> d.name().equals("HR"))
            .flatMap(d -> d.employees().stream())
            .filter(e -> e.role().equals("Manager"))
            .toList();

        // TODO Implement the pairing logic here
        return techDevs.stream()
            .flatMap(dev -> hrManagers.stream()
                    .map(hr -> 
                        dev.name() + "is mentored by" + hr.name()))
            .toList();
    }
}

