package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Arraylist {

    public static void main(String[] args){
        //Declare ArrayList
        //ArrayList <Integer> al = new ArrayList<Integer>();
        //ArrayList <String> al = new ArrayList<String>();
        //List al = new ArrayList();

        ArrayList al = new ArrayList();

        al.add(100);
        al.add(1.5);
        al.add("Hello World");
        al.add(true);
        al.add('A');

        System.out.println(al);
        //size
        System.out.println("The size of arraylist is " + al.size());

        //remove
        al.remove(1);
        System.out.println("\nAfter removing the element :" + al);

        //insert : add(index, object)
        al.add(2, "Python");
        System.out.println("After Insertion" + al);

        //replace
        al.set(2, "C#");
        System.out.println("After Replace " + al);

        //search - contains - true/false
        System.out.println("Search for C# " + al.contains("C#"));
        System.out.println("Search for C++ " + al.contains("C++"));

        //isEmpty()
        System.out.println(al.isEmpty());

        System.out.println("\nReading elements using looop");

        //1) For Loop
        for(int i = 0; i<al.size(); i++){
            System.out.println(al.get(i));
        }

        System.out.println("\nReading elements using for each loop");
        for(Object e:al){
            System.out.println(e);
        }

        System.out.println("\nReading elements using iterator method");

        Iterator it = al.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


    }



}
