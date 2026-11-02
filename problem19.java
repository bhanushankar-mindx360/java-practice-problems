import java.util.*;
import java.util.stream.*;

class Problem19 {
    public static void main(String[] args) {

        String str = "programming";

        Map<Character, Long> result = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        c -> c,
                        LinkedHashMap::new,
                        Collectors.counting()
                ));

        System.out.println(result);
    }
}