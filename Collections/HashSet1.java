package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {
    public static void main(String[] args){
        //HashSet hs = new HashSet();
        //HashSet hs = new HashSet(100);
        //HashSet hs = new HashSet(100,(float)0.95);
        //HashSet <Integer>hs = new HashSet<Integer>();

        HashSet hs = new HashSet();


        hs.add(100);
        hs.add(1.5);
        hs.add("Hello World");
        hs.add(true);
        hs.add('A');
        hs.add(null);

        System.out.println(hs);
        System.out.println("Size : "+hs);

        //remove
        hs.remove(1.5);
        System.out.println("After removing elemenets"+hs);

        //contains
        System.out.println(hs.contains("Hello World"));
        System.out.println(hs.contains(200));

        System.out.println("\nReading elements using for each loop");
        for(Object e:hs){
            System.out.println(e);
        }

        System.out.println("\nReading elements using iterator method");

        Iterator it = hs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        HashSet <Integer>set1 = new HashSet<Integer>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        HashSet <Integer>set2 = new HashSet<Integer>();
        set1.add(5);
        set1.add(6);
        set1.add(3);
        set1.add(4);

        //Union
        set1.addAll(set2);
        System.out.println("Union :"+set1);

        //Intersection
        set1.retainAll(set2);
        System.out.println("Intersection : "+set1);

        //Difference
        set1.removeAll(set2);
        System.out.println("Difference : "+set1);

        //Subset
        set1.containsAll(set2);
        System.out.println("Subset : "+set1);
    }

}
