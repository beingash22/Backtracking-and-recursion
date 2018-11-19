import java.util.*;
import java.io.*;
class check
{
    public static void main(String args[]) throws IOException
    {

        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));

        Random rand= new Random();
        int r=rand.nextInt(100);
        int num, count=0;

        while (true)
        {
            num=Integer.parseInt(br.readLine());
            count++;
            if (num>r)
            System.out.println("number should be less than "+num);
            else if (num<r)
            System.out.println("number should be greater than "+num);
            else
            {
            System.out.println("equal and "+count+"iterations");
            System.exit(0);
            }
        }
    }
}