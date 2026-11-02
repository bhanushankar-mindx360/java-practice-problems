import java.util.*;
import java.util.stream.*;

class Problem16 {
    public static void main(String[] args) {

        List<String> languages = Arrays.asList(
                "Java", "Python", "Java",
                "C++", "Python", "Java"
        );

        Map<String, Long> result = languages.stream()
                .collect(Collectors.groupingBy(
                        s -> s,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue
                ));

        System.out.println(result);
    }
}