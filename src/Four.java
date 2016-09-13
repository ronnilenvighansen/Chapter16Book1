import java.util.LinkedList;
import java.util.List;

/**
 * Created by Ronni on 03-09-2016.
 */

/* Write a method called lastIndexOf that accepts an integer value as a parameter and that returns the index in the
 * in the list of the last occurrence of that value, or -1 if the value is not found in the list. For example, if a
  * variable list stores the values [1, 18, 2, 7, 18, 39, 18, 40], then the call of list.lastIndexOf(18) should return
  * 6. If the call had instead been list.lastIndexOf(3), the method should return -1. */

public class Four
{
    public static void main(String[] args)
    {
        LinkedIntList list = new LinkedIntList();
        int data[] = {1, 18, 2, 7, 18, 39, 18, 40};
        for(int i = 0; i < data.length; i++)
        {
            list.add(data[i]);
        }
        System.out.println(list.lastIndexOf(18, list.frequency(18)));
    }

    /*public static int lastIndexOf(Integer value)
    {

    }*/
}
