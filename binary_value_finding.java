import java.util.*;

class bin {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String str="";
        String y;
        for (int i = 0; i < N; i++) {
            int X = in.nextInt();
            while(X>0)
            {
                int temp=X%2;
                y=Integer.toString(temp);
                str=y+str;
                X=X/2;
            }
            int ans=Integer.parseInt(str);
            str="";
            System.out.println(ans);
        }

    }
}

