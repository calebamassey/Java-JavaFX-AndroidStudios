package Assignment_9_13_2018.Number_13_7;

import java.util.ArrayList;

public class Run {
        public static void main(String[] args) {

            ArrayList<GeometricObject> objectList = new ArrayList<GeometricObject>();

            objectList.add(new Square(10));
            objectList.add(new Square(10));
            objectList.add(new Triangle(8, 8, 8));
            objectList.add(new Circle(25));
            objectList.add(new Rectangle(2, 5));

            for (GeometricObject object : objectList){
                System.out.println("The area is " + object.getArea());
                if (object instanceof Colorable) {
                    object.howToColor();
                }
            }

        }
}

