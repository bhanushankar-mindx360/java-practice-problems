import java.util.*;

class Problem11 {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 2};

        boolean result = Arrays.stream(nums)
                .distinct()
                .count() != nums.length;

        System.out.println(result);
    }
}