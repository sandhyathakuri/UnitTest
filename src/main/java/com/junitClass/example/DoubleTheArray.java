package com.junitClass.example;

public class DoubleTheArray {
    /*
    Given an int array, return a new array with double the length where its last element is the same as
     the original array, and all the other elements are 0. the original array will be length 1 0r more.
     Note: by default, a new int array contains all 0's


     */

    public int [] makeLast(int  nums[]){
        int arr [] = new int[nums.length * 2];
        arr [arr.length -1 ] = nums[nums.length -1];
        return arr;
    }
}
