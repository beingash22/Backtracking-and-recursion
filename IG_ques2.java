import java.io.*;
class ques2
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));

        String s1=br.readLine();
        String s2=br.readLine();
        int count=0;

        int l1=s1.length();
        int l2=s2.length();

        for (int i=0; i<l1; i++)
        {
            for (int j=0; j<l2; j++)
            {
                if ((s1.charAt(i)==s2.charAt(j))&&(i!=j))
                {
                    count++;
                    break;
                }
 
                else if ((s1.charAt(i)!=s2.charAt(j))&&(j==l2-1))
                    count++;
            }
        }

        count=count+(l2-l1);

        System.out.println(count);
    }
}