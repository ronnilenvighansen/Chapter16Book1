/**
 * Created by Ronni on 03-09-2016.
 */

/* Write a method called stretch that takes an integer n as a parameter and that increases a list of integers by a
 * factor of n by replacing each integer in the original list with n copies of that integer. For example, if a variable
  * called list stores [18, 7, 4, 24, 11] and we make the call of list.stretch(3); the list should be changed to store
  * [18, 18, 18, 7, 7, 7, 4, 4, 4, 24, 24, 24, 11, 11, 11]. If n is zero or negative, the list should become empty. */

public class Ten
{
    public static void main(String[] args)
    {
        LinkedIntList list = new LinkedIntList();
        list.add(18);
        list.add(7);
        list.add(4);
        list.add(24);
        list.add(11);
        System.out.println(list.stretch(3));
    }
}
