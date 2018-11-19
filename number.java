class num
{
    public static void main(String args[])
    {
        int c=1;
        int res;
        for (int i=1; i<=5; i++)
        {
            res=1&i;
            if (res==0)
            System.out.print(i+1);
            for (int j=1; j<=4; j++)
            {
                System.out.print(i);
            }
            System.out.println();
            if (res==1)
            System.out.print(i+1); 
     
        }
    }
}