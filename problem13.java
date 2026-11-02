import java.util.*;
import java.util.stream.*;

class Problem13 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6);

        List<Integer> result = numbers.stream()
                .map(n -> n * n * n)
                .filter(n -> n > 50)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}