package Java;
import java.util.*;

public class lc1_TwoSum {
    public int[] twoSum(int[] nums, int target) {
        if (nums == null) return null;

        Map<String, Integer> map = new HashMap<String, Integer>();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int i = 0, j = nums.length - 1;
        while (i < j) {
            int sum = nums[i] + nums[j];
            if (sum == target) {
                map.put("max",i+1);
                map.put("min",j+1);
                return map;
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = new int[4];
        nums[0] = 2;
        nums[1] = 7;
        nums[2] = 11;
        nums[3] = 15;
        int target = 9;
        res = twoSum(nums, target);
        System.out.println("22");
    }
}
