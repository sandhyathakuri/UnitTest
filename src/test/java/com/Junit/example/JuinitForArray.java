package com.Junit.example;

import com.junitClass.example.ArrayFirstAndLast;
import com.junitClass.example.DoubleTheArray;
import com.junitClass.example.LeftArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JuinitForArray {

    @Test
    public void testAnArray(){
        ArrayFirstAndLast firstAndLast = new ArrayFirstAndLast();

        int[] arrOne = {1,2,3,1};
        Assertions.assertTrue( firstAndLast.sameFirstLast(arrOne));

        int[] arrTwo = {1,2,3,};
        Assertions.assertFalse( firstAndLast.sameFirstLast(arrTwo));


    }

    @Test
    public void testTwoArrays(){

        LeftArray leftArray= new LeftArray();
        int [] arrOne = {1,2,3};
        int [] arrTwo = {2,3,0};

        Assertions.assertArrayEquals(arrTwo,leftArray.arr_rotateLeft(arrOne),
                "These two array should be the same");
    }

    @Test
    public void testArraysWithLength(){
        DoubleTheArray doubleTheArray = new DoubleTheArray();
        int[] args ={1,2,3,4};
        int[] expectedResult = {0,0,0,0,0,0,0,3};

        Assertions.assertArrayEquals(expectedResult,doubleTheArray.makeLast(args),
                "New array should be the same");

    }

}
