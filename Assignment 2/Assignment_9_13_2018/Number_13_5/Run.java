package Assignment_9_13_2018.Number_13_5;

import java.util.Scanner;

public class Run {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //Creates and tests Circle and Rectangle Object
        Circle c1 = new Circle(20);
        Circle c2 = new Circle(10);
        Circle c_max = (Circle)GeometricObject.Max(c1,c2);

        Rectangle r1 = new Rectangle( 5, 5);
        Rectangle r2 = new Rectangle( 10, 15);
        Rectangle r_max = (Rectangle)GeometricObject.Max(r1,r2);

      System.out.println("The Larger of c1 and c2 has radius of " + c_max.getRadius());
      System.out.println("The Larger of r1 and r2 has height of " + r_max.getHeight() + " and width of " + r_max.getWidth());


    }

}
