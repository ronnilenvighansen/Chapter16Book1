import sun.awt.image.ImageWatched;

/**
 * Created by Ronni on 03-09-2016.
 */

/* Write a method called notEquals that accepts a second list as a parameter, returns true if the two lists are not
 * equal, and returns false otherwise. Two lists are considered unequal of they store the different values in any
  * random order and do not have the same length. */

public class Fifteen
{
    public static void main(String[] args)
    {
        LinkedIntList list1 = new LinkedIntList();
        LinkedIntList list2 = new LinkedIntList();
        list1.add(55);
        list1.add(11);
        list2.add(55);
        list2.add(55);
        System.out.println(list1.notEquals(list2));
    }
}
