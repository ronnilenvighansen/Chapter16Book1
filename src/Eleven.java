/**
 * Created by Ronni on 03-09-2016.
 */

/* Write a method called compress that replaces every pair of elements in the list with a single element equal to the
 * sum of the pair. If the list is of odd size, leave the last element unchanged. For example, if the list stores
 * [1, 7, 3, 9, 4, 6, 5], your method should change it to stores [8, 12, 10, 5] (1+7, then 3+9, then 4+6, then 5). */

public class Eleven
{
    public static void main(String[] args)
    {
        LinkedIntList list = new LinkedIntList();
        int data[] = {1, 7, 3, 9, 4, 6, 5};
        for(int i = 0; i < data.length; i++)
        {
            list.add(data[i]);
        }
        System.out.println(list.compress(list));
    }
}
