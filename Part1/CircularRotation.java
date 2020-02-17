package Algorithms.Part1;

public class CircularRotation {
    public static boolean cr(String a, String b) {
        return (a.length() == b.length() && (b + b).indexOf(a) >= 0);
    }

    public static void main(String[] args) {
        String s1 = "ACTGACGHC";
        String s2 = "CGHCACTGA";
        if (cr(s1, s2)) System.out.println("yes");
        else System.out.println("no");
    }
}