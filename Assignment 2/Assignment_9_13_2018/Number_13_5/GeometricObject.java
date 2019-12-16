package Assignment_9_13_2018.Number_13_5;

// GeometricObject.java: The abstract GeometricObject class
public abstract class GeometricObject implements Comparable {
    private String color = "white";
    private boolean filled;

    /**Default construct*/
    protected GeometricObject() {
    }

    /**Construct a geometric object*/
    protected GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    /**Getter method for color*/
    public String getColor() {
        return color;
    }

    /**Setter method for color*/
    public void setColor(String color) {
        this.color = color;
    }

    /**Getter method for filled. Since filled is boolean,
     so, the get method name is isFilled*/
    public boolean isFilled() {
        return filled;
    }

    /**Setter method for filled*/
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**Abstract method findArea*/
    public abstract double getArea();

    /**Abstract method getPerimeter*/
    public abstract double getPerimeter();

    static GeometricObject Max(GeometricObject object_1, GeometricObject object_2) {
        if (object_1.compareTo(object_2) == 1) { return object_1; }
        else if (object_1.compareTo(object_2) == -1) { return object_2; }
        else { return object_1; }
    }
    public int compareTo(GeometricObject o) {
        if (this.getArea() > o.getArea()) { return 1; }
        else if (this.getArea() < o.getArea()) { return -1; }
        else{ return 0; }
    }
}