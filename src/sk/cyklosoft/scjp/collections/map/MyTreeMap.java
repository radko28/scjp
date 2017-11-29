package sk.cyklosoft.scjp.collections.map;

import java.util.TreeMap;
import java.util.Map.Entry;

import sk.cyklosoft.scjp.collections.comparator.DescComparator;
import sk.cyklosoft.scjp.data.Address;

/**
 * 
 * sorted
 *
 */
public class MyTreeMap {
    
    public static void main(String[] args) {
        System.out.printf("%s \n", "---TreeMap---");
        
        TreeMap<String, String > isTreeMapCommonSort = new TreeMap<>();
        isTreeMapCommonSort.put("monday", "one");
        isTreeMapCommonSort.put("sunday", "three");
        isTreeMapCommonSort.put("friday", "four");
        isTreeMapCommonSort.put("tuesday", "two");
        
        for (Entry<String, String> entry : isTreeMapCommonSort.entrySet())        {
            String value = entry.getValue();
            String key = entry.getKey();
            System.out.printf("%s %s\n", key, value);
        }
        System.out.printf("%s\n", "---pollFirstEntry---");
        System.out.printf("%s \n", isTreeMapCommonSort.pollFirstEntry().getKey());
        
        System.out.printf("%s\n", "---DescComparator---");
        TreeMap<String, String > isTreeMapSorted = new TreeMap<>(new DescComparator());
        isTreeMapSorted.putAll(isTreeMapCommonSort);
        for (Entry<String, String> entry : isTreeMapSorted.entrySet())        {
            String value = entry.getValue();
            String key = entry.getKey();
            System.out.printf("%s %s\n", key, value);
        }
        System.out.printf("%s\n", "---pollFirstEntry---");
        System.out.printf("%s \n", isTreeMapSorted.pollFirstEntry().getKey());
        
        System.out.printf("%s\n", "---DescComparator---");
        for (Entry<String, String> entry : isTreeMapSorted.entrySet())        {
            String value = entry.getValue();
            String key = entry.getKey();
            System.out.printf("%s %s\n", key, value);
        }
        
        System.out.printf("%s\n", "---put---");
        isTreeMapSorted.put("saturday", "five");
        for (Entry<String, String> entry : isTreeMapSorted.entrySet())        {
            String value = entry.getValue();
            String key = entry.getKey();
            System.out.printf("%s %s\n", key, value);
        }
        
        System.out.printf("%s\n", "---Address data type---");
        TreeMap<Address, String > addressTreeMapSort = new TreeMap<>();
        addressTreeMapSort.put(new Address("rado"), "one");
        addressTreeMapSort.put(new Address("kuzma"), "two");
        for (Entry<Address, String> entry : addressTreeMapSort.entrySet())        {
            String value = entry.getValue();
            Address key = entry.getKey();
            System.out.printf("%s %s\n", key.getName(), value);
        }
        
    }

}
