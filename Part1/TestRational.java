package Algorithms.Part1;

public class TestRational
{

    public static void main(String[] args)
    {
        Rational r = new Rational(2, -6);
        System.out.println(r);
        Rational r1 = new Rational(1, 5);
        Rational r2 = new Rational(-1, 15);
        System.out.println(r.plus(r1));
        System.out.println(r.plus(r2).plus(r1));
        System.out.println(r.minus(r1));
        System.out.println(r.times(r1));
        System.out.println(r.divides(r1));
        System.out.println(r.times(r1).equals(r2));
        r = new Rational(0, 2);
        System.out.println(r);
        System.out.println(r.plus(r1));

        r1 = new Rational(1, 3);
        r2 = new Rational(2, 3);
        System.out.println(r1.plus(r2));

        r1 = new Rational(1, 200000000);
        r2 = new Rational(1, 300000000);
        System.out.println(r1.plus(r2));

        r1 = new Rational(1073741789, 20);
        r2 = new Rational(1073741789, 30);
        System.out.println(r1.plus(r2));


    }
}