import java.util.LinkedList;
import java.util.List;

/**
 * Created by Ronni on 03-09-2016.
 */

/* Write a method called isSorted that returns true if the list is in sorted (nondecreasing) order and returns false
 * otherwise. an empty list is considered to be sorted. */

public class Three
{
    public static void main(String[] args)
    {
        LinkedIntList list = new LinkedIntList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list.isSorted());
    }
}
