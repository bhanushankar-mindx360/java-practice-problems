import java.util.*;
class Problem17 {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ram", "Krishna", "Arjun");

        Optional.ofNullable(names)
                .filter(list -> !list.isEmpty())
                .ifPresent(list -> list.forEach(System.out::println));
    }
}