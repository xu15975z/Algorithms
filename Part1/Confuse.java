package Algorithms.Part1;

import java.util.Random;

public class Confuse {
    public static void main(String[] args) {
        final int N = 5;
        int t = 0;int c=0;
        Random r = new Random();

        int[] a = new int[N];
        for (int i = 0; i < N; i++) a[i] = i;
        for (int i = 1; i < N; i++) {
         // System .out.print(r.nextInt(N-i)+"  ");
            //System .out.print(N-i+"  ");
            c=r.nextInt(N-i);
            t = a[c];
            a[c] = a[N-i];
            a[N - i] = t;
        }

        System .out.println();
        for (int i = 0; i < N; i++) System .out.print(a[i] +"   ");
    }
}
