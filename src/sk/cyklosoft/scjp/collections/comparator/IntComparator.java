package sk.cyklosoft.scjp.collections.comparator;

import java.util.Comparator;

import sk.cyklosoft.scjp.data.Items;

public class IntComparator implements Comparator<Items>{

	@Override
	public int compare(Items one, Items two) {
		return one.getValue().compareTo(two.getValue());
	}

}
