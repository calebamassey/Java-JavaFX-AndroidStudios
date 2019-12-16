package Assignment_9_13_2018.Number_13_7;

public class Square extends GeometricObject implements Colorable{
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
        }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() { return  side * side; }

    public double getPerimeter() { return side*4; }

    @Override
    public void howToColor() {
        System.out.println("Color All Four Sides");
    }
}
