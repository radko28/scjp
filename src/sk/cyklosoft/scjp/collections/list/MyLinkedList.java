package sk.cyklosoft.scjp.collections.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import sk.cyklosoft.scjp.collections.comparator.DescComparator;


/**
 * 
 * order
 *
 */
public class MyLinkedList {

    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("monday");
        list.add("sunday");
        list.add("friday");
        list.add("tuesday");
        
        Iterator<String> iter = list.iterator();
        while(iter.hasNext()) {
            System.out.printf("%s\n", iter.next());
        }
        
        System.out.printf("%s\n", "---common sort---");
        Collections.sort(list);
        iter = list.iterator();
        while(iter.hasNext()) {
            System.out.printf("%s\n", iter.next());
        }
        System.out.printf("%s\n", "---DescComparator---");
        Collections.sort(list, new DescComparator());
        iter = list.iterator();
        while(iter.hasNext()) {
            System.out.printf("%s\n", iter.next());
        }
        
        System.out.printf("%s\n", "---peek---");
        System.out.printf("%s\n", ((Queue)list).peek());
        System.out.printf("%s\n", "---DescComparator---");
        iter = list.iterator();
        while(iter.hasNext()) {
            System.out.printf("%s\n", iter.next());
        }
        
        System.out.printf("%s\n", "---poll---");
        System.out.printf("%s\n", ((Queue)list).poll());
        System.out.printf("%s\n", "---DescComparator---");
        iter = list.iterator();
        while(iter.hasNext()) {
            System.out.printf("%s\n", iter.next());
        }

        System.out.printf("%s\n", "---offer---");
        System.out.printf("%s\n", ((Queue)list).offer("saturday"));
        System.out.printf("%s\n", "---DescComparator---");
        Collections.sort(list, new DescComparator());
        iter = list.iterator();
        while(iter.hasNext()) {
            System.out.printf("%s\n", iter.next());
        }




    }
    
    

}
