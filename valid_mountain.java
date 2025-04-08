public class valid_mountain {
    public static void main(String[] args) {
        int arr[]={0,1,2,3,4,5,6,7,8,9};
        int x=arr.length;
        boolean y=false;
        int index=0,l=0;
        System.out.println(x);
        if(x<3)
        {
            y=false;
        }
        else
        {
            for(int i=0;i<x;i++)
            {
                if(arr[i]>l)
                {
                    l=arr[i];
                    index=i;
                    System.out.println(l);
                }
            }
            if(index+1!=x){

            for(int i=0;i<=index-1;i++)
            {
                if(arr[i]<arr[i+1])
                {
                    y=true;
                }
                else
                {
                    y=false;
                    break;
                }

            }
            if(y)
            {
                for(int i=index;i<x-1;i++)
                {
                    if(arr[i]>arr[i+1])
                    {
                        y=true;
                    }
                    else
                    {
                        y=false;
                        break;
                    }
                }
            }}
        }
        System.out.print(y);
    }
}
