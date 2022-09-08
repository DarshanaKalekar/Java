package collection;

import java.util.LinkedHashSet;

public class LinkedHashSet1 {
    public static void main(String[] args){
        LinkedHashSet lset = new LinkedHashSet();
        lset.add(100);
        lset.add(200);
        lset.add(300);
        lset.add(400);
        lset.add(500);

        System.out.println(lset);

        System.out.println(lset);
        System.out.println("Size : "+lset);

        //remove
        lset.remove(1.5);
        System.out.println("After removing elemenets"+lset);

        //contains
        System.out.println(lset.contains("Hello World"));
        System.out.println(lset.contains(200));
    }
}
