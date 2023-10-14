package com.pqwt.基础;

class SwitchCaseTest{
    public static void  main(String[] args)
    {

        int i=0,j=0;
        for (i=1;i<=9;i++)
        {
            for (j=1;j<=i;j++)
            {
                System.out.print(i+"*"+j+"="+(j*i)+"    ");
            }
            System.out.println();
        }

    }
}