import java.util.*;

class Problem18 {
    public static void main(String[] args) {

        int[] numbers = {10, 50, 20, 90, 30};

        int max = Arrays.stream(numbers)
                .max()
                .orElseThrow();

        System.out.println(max);
    }
}