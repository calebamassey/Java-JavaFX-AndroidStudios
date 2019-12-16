package Assignment_9_13_2018.Number_13_7;

public class Triangle extends GeometricObject implements Colorable{
    private double side_1;
    private double side_2;
    private double side_3;

    /**Default constructor*/
    public Triangle() {

    }

    public Triangle(double side_1, double side_2, double side_3) {
        this.side_1 = side_1;
        this.side_2 = side_2;
        this.side_3 = side_3;
    }

    public double getSide_1() {
        return side_1;
    }

    public void setSide_1(double side_1) {
        this.side_1 = side_1;
    }

    public double getSide_2() {
        return side_2;
    }

    public void setSide_2(double side_2) {
        this.side_2 = side_2;
    }

    public double getSide_3() {
        return side_3;
    }

    public void setSide_3(double side_3) {
        this.side_3 = side_3;
    }
    @Override
    public double getArea()
    {
        double s = (side_1 + side_2 + side_3)/2;
        double a = Math.sqrt(s *(s - side_1) * (s - side_2) * (s - side_3));
        return (a);
    }

    @Override
    public double getPerimeter() {
        return (side_1 + side_2 + side_3);
    }

    @Override
    public void howToColor() {
        System.out.println("Colors All Three Sides");
    }
}
