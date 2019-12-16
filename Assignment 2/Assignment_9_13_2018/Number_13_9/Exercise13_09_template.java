package Assignment_9_13_2018.Number_13_9;

public class Exercise13_09_template{
    public static void main(String[] args) {
        Circle13_09 obj1 = new Circle13_09(6);
        Circle13_09 obj2 = new Circle13_09(4);

        // set the radius of 1 circle and then
        // set the radius of a 2nd circle
        System.out.println(obj1.equals(obj2));
        System.out.println(obj1.compareTo(obj2));


        Circle13_09 obj3 = new Circle13_09(5);
        Circle13_09 obj4 = new Circle13_09(5);

        System.out.println(obj3.equals(obj4));
        System.out.println(obj3.compareTo(obj4));

    }
}

// Circle.java: The circle class that extends GeometricObject and implements Comparable
class Circle13_09 extends GeometricObject implements Colorable //??
{

    public Circle13_09() {
    }

    public Circle13_09(double radius) {
        this.radius = radius;
    }

    private double radius;

    /** Return radius */
    public double getRadius() {
        return radius;
    }

    /** Set a new radius */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /** Implement the getArea method defined in GeometricObject */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    /** Implement the getPerimeter method defined in GeometricObject*/
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "[Circle] radius = " + radius;
    }

    public int compareTo(Circle13_09 obj) {
        if (this.getArea() > obj.getArea())
            return 1;
        else if (this.getArea() < obj.getArea())
            return -1;
        else
            return 0;
    }

    @Override
    public boolean equals(Circle13_09 circle) {
        return this.getRadius() == circle.getRadius();
    }

    @Override
    public void howToColor() {
        System.out.println("Colors Circle");
    }
}
