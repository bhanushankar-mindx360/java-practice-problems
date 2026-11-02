import java.util.*;
class Problem6 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 50, 20, 90, 30);

        int max = numbers.stream()
                .max(Integer::compareTo)
                .orElseThrow();

        System.out.println(max);
    }
}