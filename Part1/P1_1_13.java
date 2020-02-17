package Algorithms.Part1;

import java.util.jar.JarEntry;


public class P1_1_13 {
    public static void main(String[] args) {
        final int N = 10;
        final int M = 3;
        int t =0;
        char [][] b = new char[M][N];
      /*  if (M==N) {
            System.out.println("erro");
            System.exit(1);
        }*/
        System.out.println("转置前：");

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                b[i][j] = '*';
            }
            for (int j = 0; j < N; j++)System.out.print(b[i][j]);
            System .out .println() ;
        }
        System.out.println("转置后：");
        char  [][] b1 = new char[N][M];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++)
               b1[j][i]=b[i][j];
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++)
                System.out.print(b1[i][j]);
            System.out.println();
        }

    }
}
