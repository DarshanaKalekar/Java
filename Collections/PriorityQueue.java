package collection;

import com.sun.source.doctree.SystemPropertyTree;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Iterator;
import java.util.PriorityQueue;

//Heterogeneous data not allowed in priority Queue

public class Queue1 {
    public static void main(String[] args){
        PriorityQueue q = new PriorityQueue();

        q.add("A");
        q.add("B");
        q.add("C");
        q.offer("C");

        //Get head element

        // element()
        System.out.println(q.element()); // if queue is empty : NoSuchElementException

        // peak()
        System.out.println(q.peek()); //if queue is empty : null

        System.out.println("Queue" + q);

        //return and remove element from queue

        // remove()
        System.out.println(q.remove()); // if queue is empty : NoSuchElementException

        //poll()
        System.out.println(q.poll());  //if queue is empty : null

        Iterator itr = q.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }


}
