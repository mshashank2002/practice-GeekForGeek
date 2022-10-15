
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

public class NthNodeFromLast
{
    int getNthFromLast(Node head, int n)
    {
        Node cur;
        cur=head;
        int count=0;
        while(cur!=null)
        {
            cur=cur.next;
            count++;
        }
        cur=head;

        for(int i=0;i<count-n;i++)
        {
            cur=cur.next;

        }
        if(n >count)
        {
            return -1;
        }
        return(cur.data);
}
