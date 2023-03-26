package ro.sda.advanced._1_arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class JavaArrayList {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("element 1");
        myList.add("element 2");
        myList.add("element 3");
        myList.add("element 4");
        myList.add("element 2");

        myList.remove("element 2");
        for (String  s: myList){
            System.out.println(s);
        }

        System.out.println(myList.contains("element 3"));

        myList.set(2,"another");
        System.out.println(myList);

        myList.clear();
        System.out.println(myList);


        List<MyClass> anotherList = new ArrayList<>();
        anotherList.add(new MyClass("A"));
        anotherList.add(new MyClass("B"));
        anotherList.add(new MyClass("C"));
        anotherList.add(new MyClass("D"));

        System.out.println(anotherList.contains(new MyClass("B")));

    }
}

class MyClass{
    String name;
    public MyClass (String name){
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyClass myClass = (MyClass) o;
        return Objects.equals(name, myClass.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}