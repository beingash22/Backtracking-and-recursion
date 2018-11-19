import java.io.*;
class magic
{
    public void sum(int num)
    {
        int n=num, i, count=0, rem;
        int a[]=new int[10];
        while (n>0)
        {
            count++;
            n=n/10;
        }
        i=n=count;
        
        while (num>0)
        {
            rem=num%10;
            a[--i]=rem;
            num=num/10;
        }

        while (n>0)
        {
            for (int j=0; j<n-1; j++)
            {
                a[j]=Math.abs(a[j]-a[j+1]);
                System.out.print (a[j]);
            }
            System.out.println();
            n--;
        }

        System.out.print ("final ans ->"+a[0]);
    }

    public static void main (String args[]) throws IOException{

        BufferedReader br= new BufferedReader (new InputStreamReader(System.in));

        int n=Integer.parseInt(br.readLine());

        magic ob=new magic();
        ob.sum(n);
    }
}