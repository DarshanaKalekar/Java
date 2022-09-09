package collection;
import java.util.ArrayList;

public class StringTrim {

    static String Trim(String s){
        //System.out.println(s.trim());
        return s.trim();
    }

    public static void main(String[] args){
        ArrayList <String> l = new <String>ArrayList();
        l.add("   Hello ");
        l.add("   World  ");
        l.add("   The  ");
        l.add("   Power  ");
        l.add("   of Your  ");
        l.add("   Subconsious  ");
        l.add("   Mind  ");
        
        System.out.println("Before trimming : "+l);


        for(int i = 0;i<l.size();i++)
        {
            l.set(i,Trim(l.get(i)));
        }
        
        System.out.println("After  trimming : "+l);
    }
}
