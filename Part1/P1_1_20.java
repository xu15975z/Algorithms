package Algorithms.Part1;
//ln(n!)=ln1+ln2+ln3...+ln(n)
public class P1_1_20 {
    public static double Ln(double n){

        if(n==1) return 0;
        return Math.log(n)+Ln(n-1);

    }



    public static void main(String[] args) {
    System.out .println(Ln(4)) ;
        System.out .println(Math.log(24)) ;
    }
}
