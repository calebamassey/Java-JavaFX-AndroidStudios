package Assignment_9_13_2018.Number_13_11;


public class Run {
        public static void main(String[] args) {

            Octagon o1 = new Octagon(5);

            System.out.println("Octagon Area is " + o1.getArea());
            System.out.println("Octagon Perimeter is " + o1.getPerimeter());

            Octagon o2 = (Octagon) o1.clone();

            System.out.println("Comparing o1.compareTo(o2) returns: " + o1.compareTo(o2));
        }
}

