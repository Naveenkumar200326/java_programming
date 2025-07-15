class Node{
    int val;
    Node next;
    public Node(int val)
    {
        this.val=val;
        this.next=null;
    }
}
class singly
{
    Node head;
    public void insertatstart(int val)
    {
        Node newnode=new Node(val);
        newnode.next=head;
        head=newnode;
    }
    public void insertatend(int val)
    {
        Node newnode=new Node(val);
        Node temp=head;
        while (temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newnode;
    }
    public void deleteatstart()
    {
        head=head.next;
    }
    public void deleteatend()
    {
        Node temp=head;
        while (temp.next.next!=null)
        {
            temp=temp.next;
        }
        temp.next=null;
    }
    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("End");
    }
}




public class Main{
    public static void main(String[] args) {
        singly s=new singly();
        s.insertatstart(10);
        s.insertatstart(20);
        s.insertatstart(30);
        s.insertatend(9);
        s.insertatend(8);
        s.display();
        s.deleteatstart();
        s.display();
        s.deleteatend();
        s.display();
        
    }
}
