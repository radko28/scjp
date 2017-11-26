package sk.cyklosoft.scjp.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import sk.cyklosoft.scjp.collections.comparator.IntComparator;
import sk.cyklosoft.scjp.collections.comparator.StringArrayComparator;
import sk.cyklosoft.scjp.collections.comparator.StringListComparator;
import sk.cyklosoft.scjp.data.Items;

/*
 * 77/39
 * 87/56
 * 
 */
public class MyComparator {

	public static void main(String[] args) {
		List<Items> itemsList = new ArrayList<>();
		itemsList.add(new Items("three", 3));
		itemsList.add(new Items("one", 1));
		itemsList.add(new Items("two", 2));
		itemsList.add(new Items("four", 4));
		
		showList(itemsList);
		
		System.out.printf("%s\n","---sort---string");
		Collections.sort(itemsList, new StringListComparator());
		showList(itemsList);
		
		System.out.printf("%s\n","---sort---int");
		Collections.sort(itemsList, new IntComparator());
		showList(itemsList);
		
		System.out.printf("%s\n","---binarySearch---");
		Items key = new Items("three", 3);
		int index = Collections.binarySearch(itemsList, key, new IntComparator());
		System.out.printf("%d\n",index);
		
		String[] stringArray = {"one", "two", "three", "four"};
		
		System.out.printf("%s\n","---array string---");
		showArray(stringArray);
		
		System.out.printf("%s\n","---sort array---");
		Arrays.sort(stringArray);
		showArray(stringArray);
		
		System.out.printf("%s\n","---binarySearch string array---");
		index = Arrays.binarySearch(stringArray, "one");
		System.out.printf("%d\n", index);
		
		StringArrayComparator sac = new StringArrayComparator();
		System.out.printf("%s\n","---reverse sort array---");
		Arrays.sort(stringArray, sac);
		showArray(stringArray);
		
		System.out.printf("%s\n","---binarySearch string array---");
		index = Arrays.binarySearch(stringArray, "four");
		System.out.printf("%d\n", index);
		
		System.out.printf("%s\n","---binarySearch string array---");
		index = Arrays.binarySearch(stringArray, "one", sac);
		System.out.printf("%d\n", index);
		
	}
	
	private static void showArray(String[] stringArray) {
		for(String item : stringArray) {
			System.out.printf("%s \n", item);
		}
		
	}

	static void showList(List<Items> itemsList) {
		for(Items item : itemsList) {
			System.out.printf("%s %d\n",item.getName(), item.getValue());
		}
		
	}

}
