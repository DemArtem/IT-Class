package _Java.Interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {1, 5, 3, 1, 2, 4, 5};
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }
        Integer[] result = set.toArray(new Integer[set.size()]);
        System.out.println(Arrays.toString(result));
    }
}