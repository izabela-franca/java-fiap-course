package lists;

import java.util.Comparator;

public class PersonComparator implements Comparator<ListPerson> {
    @Override
    public int compare(ListPerson o1, ListPerson o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
