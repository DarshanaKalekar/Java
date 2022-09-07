package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        //Declare LinkedList
        //LinkedList <Integer> al = new LinkedList<Integer>();
        //LinkedList <String> al = new LinkedList<String>();
        //List al = new LinkedList();

        LinkedList l = new LinkedList();

        l.add(100);
        l.add(1.5);
        l.add("Hello World");
        l.add(true);
        l.add('A');

        System.out.println(l);
        //size
        System.out.println("The size of Linkedlist is " + l.size());

        //remove
        l.remove(1);
        System.out.println("\nAfter removing the element :" + l);

        //Insert element in the middle of linked list
        l.add(3,"Java");

        System.out.println("After retriving element " + l);

        //replace
        l.set(2, "C#");
        System.out.println("After Replace " + l);

        //search - contains - true/false
        System.out.println("Search for C# " + l.contains("C#"));
        System.out.println("Search for C++ " + l.contains("C++"));

        //isEmpty()
        System.out.println(l.isEmpty());

        System.out.println("\nReading elements using looop");

        //1) For Loop
        for(int i = 0; i<l.size(); i++){
            System.out.println(l.get(i));
        }

        System.out.println("\nReading elements using for each loop");
        for(Object e:l){
            System.out.println(e);
        }

        System.out.println("\nReading elements using iterator method");

        Iterator it = l.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


        //Linked List as Stack
        LinkedList l1 = new LinkedList();

        l1.add("Dog");
        l1.add("Cat");
        l1.add("Horse");

        l1.addFirst("Tiger");
        l1.addLast("Elephant");

        System.out.println("Linked List as stack "+l1);


    }

}
