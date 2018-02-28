package ch16ex1;

public class LinkedIntList
{
    // for exercise 1 in chapter 16. Added int index as parameter.
    private int counter = 0;

    public void add(int value, int index)
    {
        ListNode current = front;
        while (true)
        {
            current = current.next;
            counter++;
            if (counter == index)
                break;
        }
        //    current.next = new ListNode(value);
        current.data = value;
    }

    // Simple first version of LinkedIntList with just a constructor
// and methods for add and toString.
        private ListNode front;  // first value in the list

        // post: constructs an empty list
        public LinkedIntList()
        {
            front = null;
        }

        // post: returns comma-separated, bracketed version of list
        public String toString()
        {
            if (front == null)
            {
                return "[]";
            } else
                {
                String result = "[" + front.data;
                ListNode current = front.next;
                while (current != null)
                {
                    result += ", " + current.data;
                    current = current.next;
                }
                result += "]";
                return result;
                }
        }

        // post: appends the given value to the end of the list
        public void add(int value)
        {
            if (front == null)
            {
                front = new ListNode(value);
            } else
                {
                ListNode current = front;
                while (current.next != null)
                {
                    current = current.next;
                }
                current.next = new ListNode(value);
                }
        }



}
