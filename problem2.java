import java.util.*;
import java.util.stream.*;

class Problem2 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 100, 150, 200);

        List<Integer> result = numbers.stream()
                .map(String::valueOf)
                .filter(n -> n.startsWith("1"))
                .map(Integer::valueOf)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}