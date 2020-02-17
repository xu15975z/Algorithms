package Algorithms.Part1;

import java.util.Scanner;

public class p1_1_9 {
    public static void main(String[] args) {
        String s="";
        int n=0;
        Scanner scan = new Scanner(System.in );
        n=scan.nextInt() ;
        for (int nn=n;n>0;n=n/2){
            s=(n%2)+s;
        }
    System.out .println(s);
    }
}
