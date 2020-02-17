package Algorithms.Part1;

import edu.princeton.cs.algs4.Stack;

import java.util.Scanner;

public class StackKH {
    public static void main(String[] args) {
        Stack<Character> S = new Stack<Character>();
      /*  Scanner scan = new Scanner(System.in);
        String s1 = scan.next();*/
        String s1 = "(({[{()([{}{}])[]}]}))";
        for (int i=0;i<s1.length();i++) {
            if (s1.charAt(i)=='(') S.push(s1.charAt(i));
            else if (s1.charAt(i)=='{') S.push(s1.charAt(i));
            else if (s1.charAt(i)=='[') S.push(s1.charAt(i));
            else if (s1.charAt(i)=='}') S.pop();
            else if (s1.charAt(i)==']') S.pop();
            else if (s1.charAt(i)==')') S.pop();

        }
        if (S.isEmpty())System.out.println(true);
        else System.out.println(false);
    }
}