import java.io.*;

class arm
{
    public static void main (String args[]) throws IOException
    {
        int r1, r2, count=0, rem, res=0, num;
        BufferedReader br= new BufferedReader (new InputStreamReader(System.in));

        r1=Integer.parseInt(br.readLine());
        r2=Integer.parseInt(br.readLine());

        for (int i=r1+1; i<r2; i++)
        {
            num=i;
            while(num>0)
            {
                count++;
                num=num/10;
            }
           //System.out.println(count);
            num=i;
            while (num>0)
            {
                rem=num%10;
                res=res+(int)Math.pow(rem,count);
                num=num/10;
            }
            //System.out.println(res);
            count=0;

            if (i==res)
            System.out.println(i);
            res=0;
        }
    }
}