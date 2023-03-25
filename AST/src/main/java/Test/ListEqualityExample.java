package Test;

import java.util.ArrayList;
import java.util.List;

public class ListEqualityExample {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        List<Integer> list2 = new ArrayList();
        list2.add(1);
        list2.add(2);
        list2.add(3);

        boolean equal = list1.equals(list2);

        if (equal) {
            System.out.println("The two lists are equal");
        } else {
            System.out.println("The two lists are not equal");
        }
    }
}

