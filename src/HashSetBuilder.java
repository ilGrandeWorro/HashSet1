package src;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetBuilder {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4};
        Set setNumbers = createHashSet(numbers);
        System.out.println(setNumbers);

        Integer toAdd = 5;
        setNumbers.add(toAdd);
        System.out.println(setNumbers);
    }

    public static HashSet createHashSet (Integer[] object){
        HashSet<Integer> result = new HashSet(Arrays.asList(object));

        return result;
    }
}
