package Algorithms.Part1;

import java.util.jar.JarEntry;


public class P1_1_11 {
    public static void main(String[] args) {
        final int N = 10;
        boolean[][] b = new boolean[N][N];
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++) {
                if ((i+j)%2==0) b[i][j]=true;
                else b[i][j]=false ;
            }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (b[i][j]) System.out.print("*");
                else System.out.print(" ");
            }
        System.out.println();
        }

    }
}
