/*2³=8 则：log(2)8=3*/

        package Algorithms.Part1;

import java.util.Scanner;

public class P1_1_14log {
    public static int Mylog(int b){

        int a=2,i=2;int k=1;
     System.out.print("b="+b+"    ");
    for (;a<b;k++){
        a=a*i;
    }
    System.out.print("a="+a+"    ");
    if(a!=b)return k-1 ;
    else return k;
    }


    public static void main(String[] args) {
       // Scanner scanner = new Scanner(System.in);
       // System.out .print("log(2) ") ;
        //int a=scanner .nextInt();
    System.out.println(Mylog(2));
        System.out.println(Mylog(4));
        System.out.println(Mylog(9));
        System.out.println(Mylog(64));
        System.out.println(Mylog(63));
    }
}

