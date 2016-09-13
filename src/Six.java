/**
 * Created by Ronni on 03-09-2016.
 */

/* Write a method called hasTwoConsecutive that returns whether or not a list of integers has two adjacent numbers that
 * are consecutive integers (true if such a pair exists and false otherwise). For example, if a variable list stores
  * the values [1, 18, 2, 7, 8, 39, 18, 40], then the call list.hasTwoConsecutive() should return true because the list
  * contains the adjacent numbers (7, 8), which are a pair of consecutive numbers. */

public class Six
{
    public static void main(String[] args)
    {
        LinkedIntList list = new LinkedIntList();
        int data[] = {1, 18, 2, 7, 8, 39, 18, 40};
        for(int i = 0; i < data.length; i++)
        {
            list.add(data[i]);
        }
        System.out.println(list.hasTwoConsecutives());
    }
}
