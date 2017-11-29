package sk.cyklosoft.scjp.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/**
 * 
 * order
 *
 */
public class MyArrayList {

    public static void main(String[] args) {
        List<String> array = new ArrayList<>();
        array.add("monday");
        array.add("sunday");
        array.add("friday");
        array.add("tuesday");
        
        Iterator<String> iter = array.iterator();
        while(iter.hasNext()) {
            System.out.printf("%s\n", iter.next());
        }
        
        System.out.printf("%s\n", "---common sort---");
        Collections.sort(array);
        iter = array.iterator();
        while(iter.hasNext()) {
            System.out.printf("%s\n", iter.next());
        }

    }

}
