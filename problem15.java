import java.util.*;
import java.util.stream.*;

class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " : " + name;
    }
}

class Problem15 {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(103, "Ram"),
                new Employee(101, "Krishna"),
                new Employee(102, "Arjun"),
                new Employee(101, "Ravi")
        );

        Map<Integer, Employee> result = employees.stream()
                .collect(Collectors.toMap(
                        e -> e.id,
                        e -> e,
                        (oldValue, newValue) -> oldValue,
                        TreeMap::new
                ));

        System.out.println(result);
    }
}