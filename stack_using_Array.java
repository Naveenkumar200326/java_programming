class st
{
    int[] stack;
    int size;
    int top;
    public  st(int size)
    {
        this.size=size;
        top=-1;
        stack=new int[size];
    }
    public void push(int data)
    {
        if(top==size-1)
        {
            System.out.println("stack  is full");
            return;
        }
        top=top+1;
        stack[top]=data;
    }
    public void display()
    {
        System.out.println("Stack element");
        for(int i=0;i<=top;i++)
        {
            System.out.print(stack[i]+" ");
        }
        System.out.println();
    }
    public void isempty()
    {
        if(top==-1)
        {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
    public void size()
    {
        System.out.println("Size of Stack is:"+(top+1));
    }
    public void peek()
    {
        int x=0;
        System.out.println("");
        System.out.println("Stack peek element:");
        for(int i=0;i<=top;i++)
        {
            x=stack[i];
        }
        System.out.println(x);
    }
    public void pop()
    {
        top=top-1;
    }
}



public class Stack {
    public static void main(String[] args) {
        st obj=new st(5);
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        obj.display();
        obj.peek();
        obj.isempty();
        obj.size();
        obj.display();
        obj.pop();
        obj.display();
    }
}
