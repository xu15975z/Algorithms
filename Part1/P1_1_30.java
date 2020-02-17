package Algorithms.Part1;

public class P1_1_30 {
    public static int hz(int q,int p){
        if (q==0) return p;
        return hz(q,p%q);
    }


    public static void main(String[] args) {
        final int N=20;
        boolean [][]b=new boolean[N][N];
        for (int i=0;i<N;i++){
            for (int j=0;j<N;j++) {
                b[i][j] = (hz(i,j)==1);
                if (b[i][j])System.out.print(1);
                else  System.out.print(0);
            }
            System.out.println();
        }
    }
}
