/**
 * Created by Ronni on 03-09-2016.
 */

/* Write a method called stutter that doubles the size of a list by replacing every integer in the list with two of
 * that integer. For example, suppose a variable list stores the values [1, 8, 19, 4, 17], after a call of
 * list.stutter(), it should store [1, 1, 8, 8, 19, 19, 4, 4, 17, 17]. */

public class Nine
{
    public static void main(String[] args)
    {
        LinkedIntList list = new LinkedIntList();
        list.add(1);
        list.add(8);
        list.add(19);
        list.add(4);
        list.add(17);
        System.out.println(list.stutter());
    }
}
