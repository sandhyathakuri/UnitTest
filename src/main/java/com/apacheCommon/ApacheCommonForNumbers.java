package com.apacheCommon;

import org.apache.commons.lang.math.NumberUtils;

public class ApacheCommonForNumbers {
    public int StringToNum(String num){
        int i = NumberUtils.toInt(num,0);
        System.out.println(i);
        return i;
    }

    public int maxNumFromArray(int num[]){
        int i = NumberUtils.max(num);
        System.out.println(i);
        return i;
    }
    public boolean isNum(String str){
        //this method only check if there is a number or not
        boolean b1 = NumberUtils.isNumber(str);
        System.out.println("For is Number method " + b1);

        // this method check if there is only numbers or not
        b1 = NumberUtils.isDigits(str);
        System.out.println("For is Digits method " + b1);
        return b1;
    }
    public static void main(String[] args){
        ApacheCommonForNumbers numbers = new ApacheCommonForNumbers();
        numbers.StringToNum("123");
        numbers.StringToNum("Text");

        int n[] = {23,45,34};
        numbers.maxNumFromArray(n);
        numbers.isNum("123-234");
    }

}
