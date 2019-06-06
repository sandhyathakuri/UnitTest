package com.junitClass.example;

public class ArrayFirstAndLast {

    /*
    Given an array of ints, return true if the array is
    length 1 or more,
    and the
    first element and the last elements are equal.
    sameFirstLast([1,2,3]) -> false
    sameFirstLast([1,2,3,1]) -> True
    sameFirstLast({1,2,1]) -> true
     */
    public boolean sameFirstLast(int []nums){
        if (nums.length ==0){
            return false;
        }
        if(nums[0] == nums[nums.length - 1]){
            return true;
        }else {
            return false;
        }
    }
}
