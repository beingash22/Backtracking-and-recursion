import java.io.*;
import java.util.*;

class LRU
{
    static int find(String arr[], String c)
    {
        for(int i=0;i<4;i++)
        {
            if(arr[i].equals(c))
            {
                return i;
            }
        }
        return -1;
    } 
    
    public static void main (String args[]) throws IOException
    {
        int index1;
        int n;
        //Scanner sc=new Scanner(System.in);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());

        String name[]=new String[n];
        String arr[]= {" "," "," "," "};

        //sc.next();
        for (int i=0; i<n; i++)
        {
        name[i]=br.readLine();
        }

     
      
        for (int i=0; i<n; i++)
        {
            index1=find(arr,name[i]);
            if(index1==-1)
            {
                for (int j=3; j>0; j--)
                {
                    arr[j]=arr[j-1];
                }
                arr[0]=name[i];
              
            }

            else
            {
                for (int j=index1;j>0;j--)
                {
                    arr[j]=arr[j-1];
                }
                arr[0]=name[i];
            }
        }

        System.out.println("\n");
        for (int i=0; i<4; i++)
        System.out.println(arr[i]);
        
    }
}