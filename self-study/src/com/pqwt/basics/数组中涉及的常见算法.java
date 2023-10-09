package com.pqwt.basics;

class ArrayTest3{
    public static void main(String[] args)
    {
        //1.生成随机数
       /*
        int[] arr=new int[10];
        for (int i=0;i<arr.length;i++)
        {
            System.out.println(Math.random());
        }
        */

        
        

        //下面这一行不叫复制
        /*arr2=arr1;//arr2和aar1公用同一块地址，对2修改，1也跟着变化
        for(int k:arr2)
        {
            System.out.print(k);
        }
*/
        //下面才是复制
       /* int[] arr3=new int[arr1.length];
        for(int i=0;i<arr3.length;i++)
            arr3[i] = arr1[i];*/

        //数组的反转


       /* for (int i=0;i<arr3.length;i++)
        {
            int k=arr3[i];
            arr3[i]=arr3[arr3.length-i-1];
            arr3[arr3.length-1-i]=k;
        }
*/

        //线性查找
        /*String dest="8";
        for(int i=0;i<arr1.length;i++)
        {
            if(dest.equals(arr1[i]))
            {
                System.out.print("get it:"+i);
            }
        }*/


        //二分法查找
        int[] sz=new int[]{1,2,3,4,5,6,7,8,9,11,12,33,44,55};
        int pot=3;
        int head=0;//初始的首索引
        int end=sz.length-1;//初始的末索引

        while (head<=end)
        {
            int middle=(head+end)/2;
            if(pot==sz[middle])
            {
                System.out.println("zhap dao le:"+(middle+1));
                break;
            }
            else if(sz[middle]>pot)
            {
                end=middle-1;
            }
            else{
                head=middle+1;
            }
        }
    }
}