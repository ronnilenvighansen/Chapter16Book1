import java.util.LinkedList;
import java.util.List;

/**
 * Created by Ronni on 03-09-2016.
 */

/* Write a method called deleteBack that deletes the last value (the value at the back of the list) and returns the
 * deleted value. If the list is empty, throw a NoSuchElementException. */
public class Seven
{
    public static void main(String[] args)
    {
        LinkedIntList list = new LinkedIntList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(23);
        System.out.println(list.deleteBack(list));
        System.out.println(list);
    }

}
