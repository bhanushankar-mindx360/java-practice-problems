import java.util.*;
import java.util.stream.*;

class Problem5 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 20, 10, 30, 20, 10, 40);

        Map<Integer, Long> result = numbers.stream()
                .collect(Collectors.groupingBy(
                        n -> n,
                        Collectors.counting()
                ));

        System.out.println(result);
    }
}