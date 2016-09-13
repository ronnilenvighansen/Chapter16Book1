/**
 * Created by Ronni on 03-09-2016.
 */

/* Write a method called removeAll that removes all occurrences of a particular value. For example, if a variable list
 * stores the values[3, 9, 4, 2, 3, 8, 17, 4, 3, 18], the call of list.removeAll(3); would change the list to stores
  * [9, 4, 2, 8, 17, 4, 18]. */

public class Fourteen
{
    public static void main(String[] args)
    {
        LinkedIntList list = new LinkedIntList();
        int data[] = {3, 9, 4, 2, 3, 8, 17, 4, 3, 18};
        for(int i = 0; i < data.length; i++)
        {
            list.add(data[i]);
        }
        System.out.println(list.removeAll(3));
    }
}
