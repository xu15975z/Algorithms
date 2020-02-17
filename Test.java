package Algorithms;

import Algorithms.Part1.Counter;

public class Test {
    public static void main(String[] args) {
        Counter counr = new Counter(5,3);
        System.out.println(counr.plus(2));
        counr.minu(3);
        System.out.println(counr.getI());
        counr.minu(3);
    }
}

