public class zohoquestion1 {
    public static void main(String[] args) {
        String str="NAVEENKUMAR";
        int x=str.length();
        int count=0;
        for(int i=0;i<x;i++)
        {
            for(int j=0;j<x;j++)
            {
                if(i+j==x-1 || i==j || x/2==j)
                {
                    System.out.print(str.charAt(i)+"  ");
                }
                else if(x/2==i)
                {
                        System.out.print(str.charAt(j)+"  ");
                }
                else
                {
                        System.out.print("   ");
                }
            }
            System.out.println(" ");
        }

        }
}

