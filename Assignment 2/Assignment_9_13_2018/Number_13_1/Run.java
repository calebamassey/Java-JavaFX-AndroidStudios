package Assignment_9_13_2018.Number_13_1;


import java.util.Scanner;

public class Run {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            //Gets the lengths of the sides for Triangle Object
            System.out.print("Enter the length of Side 1: \n");
            double temp_side_1 =  scan.nextDouble();
            System.out.print("Enter the length of Side 2: \n");
            double temp_side_2 = scan.nextDouble();
            System.out.print("Enter the length of Side 3: \n");
            double temp_side_3 = scan.nextDouble();

            //Gets the color and fill status for Triangle Object
            System.out.print("Enter a color for the triangle: \n");
            String temp_color = scan.next();
            System.out.print("Enter true if the triangle is filled or false if not: \n");
            Boolean temp_filled = scan.nextBoolean();

            //Creates a Triangle Object
            Triangle t1 = new Triangle(temp_side_1, temp_side_2, temp_side_3);

            //Runs get for Area and Parameter of Triangle Class
            System.out.println("t1 area is " + t1.getArea());
            System.out.println("t1 perimeter is " + t1.getPerimeter());

            //Sets the color and fill status to match input
            t1.setColor(temp_color);
            System.out.println("Color has been changed to " + temp_color);
            t1.setFilled(temp_filled);
            System.out.println("Filled Status is set to " + temp_filled);


        }
}

