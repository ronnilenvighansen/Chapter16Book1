import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Created by Ronni on 03-09-2016.
 */

/* Write a method called max that returns the maximum value of integers. If the list is empty, it should throw a
 * NoSuchElementException. */

public class Two
{
    public static void main(String[] args)
    {
        LinkedIntList list = new LinkedIntList();
        list.add(3);
        list.add(5);
        list.add(2);
        System.out.println(list.max());
    }
}
