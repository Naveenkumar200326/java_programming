class Node4
{
    int val;
    Node4 next;
    Node4 prev;
    public Node4(int val){
        this.val=val;
        this.next=null;
        this.prev=null;
    }
}
class doublylinklist
{
    Node4 head;
    public void insertatbegin(int val)
    {
        Node4 newnode=new Node4(val);
        if(head==null)
        {
            head=newnode;
            return;
        }
        newnode.next=head;
        head.prev=newnode;
        head=newnode;
    }
    public void deleteatbegin()
    {
        head=head.next;
    }

    public void insertatend(int val)
    {
        Node4 newnode=new Node4(val);
        if(head==null)
        {
            head=newnode;
            return;
        }
        Node4 tail=head;
        while (tail.next!=null)
        {
            tail=tail.next;
        }
        tail.next=newnode;
        newnode.prev=tail;
    }
    public void deleteatend()
    {
        Node4 temp=head;
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        temp.next.prev=null;
        temp.next=null;

    }
    public void display()
    {
        Node4 tail=head;
        while(tail!=null)
        {
            System.out.print(tail.val+"<->");
            tail=tail.next;
        }
        System.out.println("Null");
    }

  
    public void midelement()
    {

        int count=0;
        Node4 temp=head;
        while(temp!=null)
        {
            temp=temp.next;
            count=count+1;
        }
        int res,x;

         res=count/2;
         res=res+1;
         x=res;

        Node4 a=head;
        for(int i=1;i<x;i++)
        {
         a=a.next;
        }
        System.out.println(a.val);

    }
    public void insertatposition(int val,int pos)
    {
        Node4 newnode=new Node4(val);
        if(pos==1)
        {
         newnode.next=head;
         head.prev=newnode;
         return;
        }
        Node4 temp=head;
        for(int i=1;i<pos-1 && temp!=null;i++)
        {
         temp=temp.next;
        }
        newnode.next=temp.next;
        temp.next.prev=newnode;
        newnode.prev=temp;
        temp.next=newnode;
    }
}







public class doublypart_exa {
    public static void main(String[] args) {
        doublylinklist s=new doublylinklist();
        s.insertatbegin(10);
        s.insertatbegin(20);
        s.insertatbegin(30);
        System.out.println("inserted at begin:");
        s.display();
        s.insertatend(40);
        s.insertatend(50);
        s.insertatend(60);
        System.out.println("inserted at end:");
        s.display();
        System.out.println("delete at begin:");
        s.deleteatbegin();
        s.display();
        s.insertatend(80);
        s.display();
        System.out.println("delete at end:");
        s.deleteatend();
        s.display();
        s.insertatend(28);
        s.insertatend(52);
        
        s.display();

        s.insertatposition(7,4);
        s.display();
    }
}
