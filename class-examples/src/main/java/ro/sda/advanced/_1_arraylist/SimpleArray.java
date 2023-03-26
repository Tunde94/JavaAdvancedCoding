package ro.sda.advanced._1_arraylist;

public class SimpleArray {

    public static void main(String[] args) {
        String [] array = new String[3];
        array[0] = "element 1";
        array[1] = "element 2";
        array[2] = "element 3";

        for(String el : array){
            System.out.println(el);
        }

        System.out.println("--------------");

        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

        try {
            array[5] = "element 4";
        }
        catch (Exception e){
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("After block");
    }
}
