package collection;

import java.util.ArrayList;
import java.util.Collections;

public class StringArrayList {

    public static void main(String[] args){
        ArrayList <String>al = new ArrayList<String>();
        al.add("Hello");
        al.add("World");
        al.add("The");
        al.add("Power");
        al.add("of Your");
        al.add("Subconsious");
        al.add("Mind");

        Collections.shuffle(al);
        for(String e : al)
            System.out.println(e);


    }
}
