package sk.cyklosoft.scjp.collections.comparator;

import java.util.Comparator;

public class DescComparator implements Comparator<String>{

    @Override
    public int compare(String a, String b) {
        return b.compareTo(a);
    }

}
