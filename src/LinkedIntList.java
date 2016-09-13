import java.util.NoSuchElementException;

public class LinkedIntList
{
    private ListNode front;

    public LinkedIntList() {
        front = null;
    }

    public void add(int value) {
        if (front == null){
            front = new ListNode(value);
        } else {
            ListNode current = front;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new ListNode(value);
        }
    }

    public void add(int index, int value) {
        if (index == 0) {
            front = new ListNode(value, front);
        } else {
            ListNode current = goTo(index - 1);
            ListNode newNode = new ListNode(value, current.next);
            current.next = newNode;

        }
    }

    public void addSorted(int value) {
        if (front == null || front.data > value) {
            front = new ListNode(value, front);
        } else {
            ListNode current = front;
            while (current.next != null && current.next.data < value) {
                current = current.next;
            }
            current.next = new ListNode(value, current.next);
        }
    }

    public int get(int index) {
        ListNode current = goTo(index);
        return current.data;
    }

    public int indexOf(int value) {
        int index = 0;
        ListNode current = front;
        while (current != null) {
            if (current.data == value) {
                return index;
            }
            index++;
            current = current.next;
        }
        return -1;
    }

    public boolean isEmpty(){
        return front == null;
    }

    public void remove(int index) {
        if (index == 0) {
            front = front.next;
        } else {
            ListNode current = goTo(index - 1);
            current.next = current.next.next;
        }
    }

    public int set(int index, int value)
    {
        ListNode current = goTo(index);
        current.data = value;
        return value;
    }

    public int size() {
        int count = 0;
        ListNode current = front;
        while (current != null) {
            current = current.next;
            count++;
        }
        return count;
    }

    public String toString()
    {
        if (front == null)
        {
            return "[]";
        }
        else
        {
            String result = "[" + front.data;
            ListNode current = front.next;
            while (current != null) {
                result += ", " + current.data;
                current = current.next;
            }
            result += "]";
            return result;
        }
    }

    private ListNode goTo(int index)
    {
        ListNode current = front;
        for (int i = 0; i < index; i++)
        {
            current = current.next;
        }
        return current;
    }

    public int max()
    {
        if (front == null)
        {
            throw new NoSuchElementException();
        }
        ListNode current = front;
        int max = current.data;
        while (current != null)
        {
            if (current.data > max)
            {
                max = current.data;
            }
            current = current.next;
        }
        return max;
    }

    public boolean isSorted()
    {
        if(front == null)
        {
            return true;
        }
        ListNode current = front;
        while(current.next != null)
        {
            if(current.data > current.next.data)
            {
                return false;
            }
            else
            {
                current = current.next;
            }
        }
        return true;
    }

    public int frequency(int value)
    {
        if (front == null)
        {
            throw new NoSuchElementException();
        }
        ListNode current = front;
        int count = 0;
        while (current != null)
        {
            if (current.data == value)
            {
                count++;
            }
            current = current.next;
        }
        if(count == 0)
        {
            return -1;
        }
        return count;
    }

    public int lastIndexOf(int value, int frequency)
    {
        if (front == null)
        {
            throw new NoSuchElementException();
        }
        ListNode current = front;
        int count = 0;
        while (current != null)
        {
            if (current.data == value && frequency != 0)
            {
                frequency--;
                if(frequency == 0)
                {
                    return count;
                }
            }
            current = current.next;
            count++;
        }
        return -1;
    }

    public boolean hasTwoConsecutives()
    {
        int temp = this.get(0);
        for(int i = 1; i < this.size(); i++)
        {
            if(temp+1 == this.get(i) || temp-1 == this.get(i))
            {
                return true;
            }
            temp = this.get(i);
        }
        return false;
    }

    public int deleteBack(LinkedIntList list)
    {
        if (front == null)
        {
            throw new NoSuchElementException();
        }
        ListNode current = front;
        int back = 0;
        int count = 0;
        while (current != null)
        {
            if (current.next == null)
            {
                back = current.data;
                list.remove(count);
            }
            count++;
            current = current.next;
        }
        return back;
    }

    public LinkedIntList stutter()
    {
        LinkedIntList list = new LinkedIntList();
        if (front == null)
        {
            throw new NoSuchElementException();
        }
        ListNode current = front;
        while (current != null)
        {
            list.add(current.data);
            list.add(current.data);
            current = current.next;
        }
        return list;
    }

    public LinkedIntList stretch(int number)
    {
        LinkedIntList list = new LinkedIntList();
        if (front == null)
        {
            throw new NoSuchElementException();
        }
        ListNode current = front;
        while (current != null)
        {
            for(int i = 0; i < number; i++)
            {
                list.add(current.data);
            }
            current = current.next;
        }
        return list;
    }

    public LinkedIntList compress(LinkedIntList list1)
    {
        LinkedIntList list2 = new LinkedIntList();
        if (front == null)
        {
            throw new NoSuchElementException();
        }
        ListNode current = front;
        if(list1.size() % 2 == 0)
        {
            while(current != null)
            {
                list2.add(current.data + current.next.data);
                current = current.next.next;
            }
        }
        else
        {
            while(current.next != null)
            {
                list2.add(current.data + current.next.data);
                current = current.next.next;
                if(current.next == null)
                {
                    list2.add(current.data);
                }
            }
        }
        return list2;
    }

    public LinkedIntList transferFrom(LinkedIntList list1, LinkedIntList list2)
    {
        if(front == null)
        {
            throw new NoSuchElementException();
        }
        ListNode current = front;

        while(current != null)
        {
            if(current.next.next == null)
            {
                while(list2.size() != 0)
                {
                    list1.add(0, list2.get(0));
                    list2.remove(0);
                }
            }
            current = current.next;
        }

        return list1;
    }

    public LinkedIntList removeAll(int value)
    {
        LinkedIntList list = new LinkedIntList();
        if (front == null)
        {
            throw new NoSuchElementException();
        }
        ListNode current = front;
        while(current != null)
        {
            if(current.data != value)
            {
                list.add(current.data);
            }
            current = current.next;
        }
        return list;
    }

    public boolean notEquals(LinkedIntList list)
    {
        if(list.size() == this.size())
        {
            for(int i = 0; i < list.size(); i++)
            {
                if(list.get(i) != this.get(i))
                {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public void removeRange(int start, int end)
    {
        for(int i = end; i >= start; i--)
        {
            this.remove(i);
        }
    }
}