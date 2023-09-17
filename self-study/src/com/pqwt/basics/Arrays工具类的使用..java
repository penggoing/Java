package com.pqwt.basics;

import java.util.Arrays;

class ArraysToolsTest{
    public static void main(String[] args){
        //1.boolean equals(int[] a,int[] b):判断两个数组是否相等
        int[] arr1=new int[]{1,2,3};
        int[] arr2=new int[]{1,2,3,2,7,5,9,11,1};
        boolean isEquals= Arrays.equals(arr1,arr2);

        //2.输出数组信息System.out.println(Arrays.toString(int[] arr1));
        System.out.println(Arrays.toString(arr1));

        //3.将指定值填充到数组中
        Arrays.fill(arr1,10);
        System.out.println(Arrays.toString(arr1));

        //4.排序
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        //5.二分查找
        int index=Arrays.binarySearch(arr2,11);
        System.out.println(index+1);

    }
}