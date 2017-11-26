package sk.cyklosoft.scjp.collections.comparator;

import java.util.Comparator;

public class StringArrayComparator implements Comparator<String> {

	@Override
	public int compare(String one, String two) {
		return two.compareTo(one);
	}

}
