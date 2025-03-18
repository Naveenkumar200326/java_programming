class Node5
{
    int val ;
    Node5 next;
    public Node5(int val)
    {
     this.val=val;
     this.next=null;
    }
}
class stacklinklist
{
    Node5 head=null;
    int count=0;
    public void push(int val)
    {
        count=count+1;
        Node5 newnode=new Node5(val);
        if(head==null)
        {
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    public void display()
    {
        Node5 temp=head;
        while(temp!=null)
        {
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public void isempty()
    {
        if(count==0)
        {
            System.out.println("True");
            return;
        }
        System.out.println("False");

    }
    public void size()
    {
        System.out.println("size:"+count);
    }
    public void peek(){

        System.out.println("peek element:"+head.val);
    }
    public void pop()
    {
        head=head.next;
    }
}




public class stack_using_linkedlist {
    public static void main(String[] args) {
        stacklinklist o=new stacklinklist();
        o.push(90);
        o.push(80);
        o.push(70);
        o.push(60);
        o.display();
        o.isempty();
        o.size();
        o.peek();
        o.pop();
        o.display();
        

    }
}
