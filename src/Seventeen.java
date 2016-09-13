/**
 * Created by Ronni on 03-09-2016.
 */

/* Write a method called removeRange that accepts a starting and ending index as parameters and removes the elements
 * at those indexes (inclusive) from the list. For example, if a variable list stores the values
 * [8, 13, 17, 4, 9, 12, 98, 41, 7, 23, 0, 92], the call of listRange.removeRange(3, 8); should remove values between
  * index 3 and index 8(the values 4 and 7), leaving the list of [8, 13, 17, 23, 0, 92]. The method should throw an
  * IllegalArgumentException if either of the positions is negative. Otherwise you may assume that the positions
  * represent a legal range of the list (0 <= start <= end <= size). */

public class Seventeen
{
    public static void main(String[] args)
    {
        LinkedIntList list = new LinkedIntList();
        int data[] = {8, 13, 18, 4, 9, 12, 98, 41, 7, 23, 0, 92};
        for(int i = 0; i < data.length; i++)
        {
            list.add(data[i]);
        }
        list.removeRange(3, 8);
        System.out.println(list);
    }
}
