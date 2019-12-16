package Assignment_9_13_2018.Number_13_15;

import java.math.BigInteger;

public class Exercise13_15_Template {
    public static void main(String[] args) {
        // Create and initialize two rational  BigInteger numbers r1 and r2.
        Rational r1 = new Rational(new BigInteger("1"), new BigInteger("5"));
        Rational r2 = new Rational(new BigInteger("8"), new BigInteger("15"));

        // Display results
        System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
        System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
        System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
        System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
        System.out.println(r2 + " is " + r2.doubleValue());
    }
}