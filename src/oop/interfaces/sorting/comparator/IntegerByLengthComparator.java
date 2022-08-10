package oop.interfaces.sorting.comparator;

import java.util.Comparator;

public class IntegerByLengthComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer integer1, Integer integer2){
        return - (integer1 - integer2);
    }
}
