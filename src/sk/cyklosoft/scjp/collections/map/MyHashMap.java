package sk.cyklosoft.scjp.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MyHashMap {

    public static void main(String[] args) {
        Map<Integer, String> isMap = new HashMap<>();
        isMap.put(1, "one");
        isMap.put(3, "three");
        isMap.put(4, "four");
        isMap.put(2, "two");
        
        for (Entry<Integer, String> entry : isMap.entrySet())        {
            String value = entry.getValue();
            Integer key = entry.getKey();
            System.out.printf("%d %s\n", key, value);
        }
        
        Iterator<Entry<Integer, String>> entries = isMap.entrySet().iterator();
        while(entries.hasNext()) {
            Entry<Integer, String> entry = entries.next();
            String value = entry.getValue();
            Integer key = entry.getKey();
            System.out.printf("%d %s\n", key, value);            
        }
        
        Map<String, String> ssMap = new HashMap<>();
        ssMap.put("monday", "one");
        ssMap.put("sunday", "three");
        ssMap.put("friday", "four");
        ssMap.put("tuesday", "two");
        
        for (Entry<String, String> entry : ssMap.entrySet())        {
            String value = entry.getValue();
            String key = entry.getKey();
            System.out.printf("%s %s\n", key, value);
        }
        
    }
}
