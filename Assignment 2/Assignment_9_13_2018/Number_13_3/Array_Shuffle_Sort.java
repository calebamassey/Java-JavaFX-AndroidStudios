package Assignment_9_13_2018.Number_13_3;

import java.util.ArrayList;

public class Array_Shuffle_Sort {
    /*
    *(Sort ArrayList) Write the following method that sorts an ArrayList of numbers.
                public static void sort(ArrayList<Number> list)

    */
    public static void main(String[] args) {
        //Creates an ArrayList with 100 Random Numbers between 1-100
        ArrayList<Number> list = new ArrayList<>();
        for (int i = 0; i < 100; i++){
            Number num = Math.floor(Math.random() * 100)  ;
            list.add(num);
            }
        System.out.println("Unsorted list is " + list);  //Prints out the unsorted list
        System.out.println("Sorted list is " + sort(list));  //Prints out the sorted list
    }


    public static ArrayList<Number> sort(ArrayList<Number> list) {
        ArrayList<Number> min_list = new ArrayList<>();
        int count = 0;

        //For loop that adds the min variable to the min_list
        for (int i = 0; i < 100; i++){
            Number min = list.get(0);
            //Assigns the smallest value in the list to min
            for (Number temp : list) {
                if (temp.intValue() < min.intValue()){
                    min = temp;
                }

            }
            min_list.add(min);
            list.remove(min);
            //count++; //used to make sure min_list is at correct length
        }
        //System.out.println("The count is " + count); // prints count of min_list length
        return min_list;
    }


}
