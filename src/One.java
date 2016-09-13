import java.util.LinkedList;
import java.util.List;

/**
 * Created by Ronni on 03-09-2016.
 */

/* Write a method called set that accepts an index and a value and set the list's element at that index to have the
* the given value. You may assume that the index is between 0(inclusive) and the size of the list(exclusive). */

public class One
{
    public static void main(String[] args)
    {
        LinkedIntList list = new LinkedIntList();
        list.add(5);
        list.add(4);
        list.set(1, 8);
        System.out.println(list);
    }
}
