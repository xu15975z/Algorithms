package Algorithms.Part1;

import java.util.Scanner;

public class P1_1_3 {
    public static void main(String[] args) {
        Scanner sacn1=new Scanner(System.in);
        int i=0;
        double [] a=new double[3];
        while (i<3){
            a[i]=sacn1.nextDouble();
            i++;
        }
        if (a[0]==a[1]&&a[1]==a[2]) System.out.println("eq") ;
        else System.out.println("no-eq") ;
    }
}
