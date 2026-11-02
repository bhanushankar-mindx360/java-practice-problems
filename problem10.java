import java.util.*;
import java.util.stream.*;

class Problem10 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(50, 10, 40, 20, 30);

        List<Integer> result = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(result);
    }
}