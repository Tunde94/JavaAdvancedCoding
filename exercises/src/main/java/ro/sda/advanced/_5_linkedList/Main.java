package ro.sda.advanced._5_linkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//folosim foarte mult pentru adaugare/ stergere- in cautare nu prea e recomandat
public class Main {
    public static void main(String[] args) {
        List<String> myList = new LinkedList<>();
        myList.add("a");
        myList.add("b");
        myList.add("c");
        myList.add("d");

        System.out.println(myList.get(2));

        System.out.println(myList.contains("c"));

        System.out.println(myList.size());

        Queue<String> queue = new LinkedList<>();
        queue.add("x");
        queue.add("y");
        queue.add("z");

        while (!queue.isEmpty()){
            String current = queue.poll();
            System.out.println(current);
        }

        ArrayList<Integer> arrayList =new ArrayList<>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);

        LinkedList<Integer> myLinkedList = new LinkedList<>(arrayList);
        for (Integer i: myLinkedList){
            System.out.println(i);
        }







    }
}
