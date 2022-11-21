class Solution
{
  static Node clone
  {
      Node cur=head;
        while(cur!=null)
        {
            Node temp=cur.next;
            cur.next=new Node(cur.data);
            cur.next.next=temp;
            cur=temp;
        }
        cur=head;
        while(cur!=null)
        {
            if(cur.arb!=null)
            {
                cur.next.arb=cur.arb.next;
            }
            else
            {
                cur.next.arb=null;
            }
            cur=cur.next.next;
        }
        Node orig=head;
        Node copy=head.next;
        Node temp=copy;
       while(orig!=null  && copy !=  null)
       {

             orig.next=(orig.next!=null)?orig.next.next:orig.next;

         
             copy.next=(copy.next!=null)?copy.next.next:copy.next;

            orig=orig.next;

            copy=copy.next;

        }

        return temp;
}
