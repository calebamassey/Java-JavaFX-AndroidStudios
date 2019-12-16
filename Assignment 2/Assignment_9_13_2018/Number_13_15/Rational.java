package Assignment_9_13_2018.Number_13_15;

import java.math.*;

class Rational extends Number implements Comparable<Rational> {

// BigInteger Data fields for numerator and denominator
    BigInteger numerator;
    BigInteger denominator;

    /** Construct a rational with default properties of ZERO and ONE */
    public Rational() {

    }

    /** Construct a rational BigInteger with specified numerator and denominator */
    public Rational(BigInteger numerator, BigInteger denominator) {
      BigInteger gcd = gcd(numerator, denominator);

        if (denominator.compareTo(BigInteger.ZERO) < 0)
        this.numerator = numerator.multiply(new BigInteger("-1")).divide(gcd);
      else
        this.numerator = numerator.divide(gcd);
        this.denominator = denominator.abs().divide(gcd);
    }

    /** Find GCD of two BigInteger numbers */
    private static BigInteger gcd(BigInteger n, BigInteger d) {
      BigInteger n1 = n.abs();
      BigInteger n2 = d.abs();
      BigInteger gcd = BigInteger.ONE;

        for (BigInteger k = BigInteger.ONE;
        k.compareTo(n1) <= 0 && k.compareTo(n2) <= 0;
        k = k.add(BigInteger.ONE)) {
            if (n1.remainder(k).equals(BigInteger.ZERO) &&
            n2.remainder(k).equals(BigInteger.ZERO))
            gcd = k;
        }

        return gcd;
    }

    /** Return numerator */
    public BigInteger getNumerator() {
        return numerator;
    }

    /** Return denominator */
    public BigInteger getDenominator() {
        return denominator;
    }

    /** Add a rational number to this rational */
    public Rational add(Rational secondRational) {
      BigInteger n = numerator.multiply(secondRational.getDenominator()).add(
                denominator.multiply(secondRational.getNumerator()));
      BigInteger d = denominator.multiply(secondRational.getDenominator());
        return new Rational(n, d);
    }

    /** Subtract a rational number from this rational */
    public Rational subtract(Rational secondRational) {
      BigInteger n = numerator.multiply(secondRational.getDenominator()).subtract(
                denominator.multiply(secondRational.getNumerator()));
      BigInteger d = denominator.multiply(secondRational.getDenominator());
        return new Rational(n, d);
    }

    /** Multiply a rational number to this rational */
    public Rational multiply(Rational secondRational) {
      BigInteger n = numerator.multiply(secondRational.getNumerator());
      BigInteger d = denominator.multiply(secondRational.getDenominator());
        return new Rational(n, d);
    }

    /** Divide a rational number from this rational */
    public Rational divide(Rational secondRational) {
      BigInteger n = numerator.multiply(secondRational.getDenominator());
      BigInteger d = denominator.multiply(secondRational.numerator);
        return new Rational(n, d);
    }

    @Override
    public String toString() {
        if (denominator.equals(BigInteger.ONE))
        return numerator + "";
      else
        return numerator + "/" + denominator;
    }

    @Override /** Override the equals method in the Object class */
    public boolean equals(Object parm1) {
        if ((this.subtract((Rational)(parm1))).getNumerator().equals(BigInteger.ONE))
        return true;
      else
        return false;
    }

    @Override /** Override the hashCode method in the Object class */
    public int hashCode() {
        return new Double(this.doubleValue()).hashCode();
    }

    @Override /** Override the abstract intValue method in java.lang.Number */
    public int intValue() {
        return (int)doubleValue();
    }

    @Override /** Override the abstract floatValue method in java.lang.Number */
    public float floatValue() {
        return (float)doubleValue();
    }

    @Override /** Override the doubleValue method in java.lang.Number */
    public double doubleValue() {
        return numerator.doubleValue() / denominator.doubleValue();
    }

    @Override /** Override the abstract longValue method in java.lang.Number */
    public long longValue() {
        return (long)doubleValue();
    }

    @Override
    public int compareTo(Rational o) {
        if ((this.subtract((Rational)o)).getNumerator().compareTo(BigInteger.ZERO) > 0)
        return 1;
      else if ((this.subtract((Rational)o)).getNumerator().compareTo(BigInteger.ZERO) < 0)
        return -1;
      else
        return 0;
    }
}
