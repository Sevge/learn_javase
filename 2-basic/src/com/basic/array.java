package com.basic;

import java.util.Arrays;

public class array {
    public static void main(String[] args) {
//        int[] nums = {1,2,3,4,5};
//        for (int num : nums) {
//            System.out.println(num);
//        }


        int[] nums = {3, 123, 12, 1512, 14, 53, 46};
        int tmp = 0;
        for (int i=0; i<nums.length-1; i++) {
            boolean flag = false;
            for (int j=0; j<nums.length-1-i; j++) {
                if (nums[j] > nums[j+1]) {
                    tmp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = tmp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
