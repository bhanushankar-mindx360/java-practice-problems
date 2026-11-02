import java.util.*;
import java.util.stream.*;

class Problem12 {
    public static void main(String[] args) {

        Stream<Integer> stream1 = Stream.of(10, 20, 30);
        Stream<Integer> stream2 = Stream.of(40, 50, 60);

        List<Integer> result = Stream.concat(stream1, stream2)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}