package ch16ex1;

/* Write a method called set that accepts an index and a value and sets the list’s element at that index to have the given
value. You may assume that the index is between 0 (inclusive) and the size of the list (exclusive). */

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class indexAndValue
{
    public static void main(String[] args)
    {
        LinkedIntList linkedIntList = new LinkedIntList();
        System.out.println(linkedIntList);

        for (int i = 0; i < 10; i++)
            linkedIntList.add(i);
        System.out.println(linkedIntList);


        linkedIntList.add(25,1);
        System.out.println(linkedIntList);

    }
}
