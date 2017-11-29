package sk.cyklosoft.scjp.collections.map;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

/**
 * 
 * ordered
 *
 */
public class MyLinkedHashMap {

   public static void main(String[] args) {
       LinkedHashMap<String, String> ssLinkedHashMap = new LinkedHashMap<>();
       
       ssLinkedHashMap.put("monday", "one");
       ssLinkedHashMap.put("sunday", "three");
       ssLinkedHashMap.put("friday", "four");
       ssLinkedHashMap.put("tuesday", "two");
       for (Entry<String, String> entry : ssLinkedHashMap.entrySet())        {
           String value = entry.getValue();
           String key = entry.getKey();
           System.out.printf("%s %s\n", key, value);
       }
   }

}
