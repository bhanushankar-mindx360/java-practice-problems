import java.util.*;

class Problem3 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        numbers.stream()
                .findFirst()
                .ifPresent(System.out::println);
    }
}