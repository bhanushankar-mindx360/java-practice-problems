import java.util.*;
import java.util.stream.*;

class Problem14 {
    public static void main(String[] args) {

        int[] numbers = {50, 10, 40, 20, 30};

        Arrays.sort(numbers);

        IntStream result = Arrays.stream(numbers);

        result.forEach(System.out::println);
    }
}