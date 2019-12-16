package Assignment_9_13_2018.Number_13_11;

public class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable{
    double side;

    public Octagon(Object o) { }

    public Octagon(double side) { this.side = side; }

    public double getSide() { return side; }

    public void setSide(double side) { this.side = side; }

    @Override
    public double getArea() { return (2 + (4 / Math.sqrt(2))) * side * side; }

    @Override
    public double getPerimeter() { return side * 8; }

    @Override
    public int compareTo(Octagon o) {
        if (this.getArea() > o.getArea() ){ return 1; }
        else if (this.getArea() < o.getArea() ){ return -1; }
        else {return 0;}
    }

   @Override
    public Object clone() {
        try {
            Octagon c = (Octagon) super.clone();
            return c;
        } catch (CloneNotSupportedException ex) {
            return null;
        }
    }
}
