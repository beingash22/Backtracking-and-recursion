import java.io.*;
import java.util.*;
class Url
{
    public static void main (String args[])
    {
        String str="/./";
        int count=0;
        int len= str.length();
        int n=0;

      for (int i=0; i<len; i++)
      {
          if (str.charAt(i)=='/')
            count++;
      }

      String save[]= str.split("/", count-1);
      String last[]=new String[count-1];
      int p=0;
      for (int i=0; i<save.length; i++)
      {
          if (save[i].compareTo(".")!=0)
          {  
                last[p]=save[i];
                p++;
          }
      }

      for (int i=0; i<last.length; i++)
      {
          if (last[i]!=null)
            n++;
      }
    /*if (n==0)
    {
        System.out.print (-1);
        System.exit(0);
    }
    */

      int store[]=new int[n];
      int dot[]=new int[n];

      for (int i=0; i<n; i++)
      {
        for (int j=0; j<last[i].length()-1; j++)
        {
            if ((last[i].charAt(j)=='.')&&(last[i].charAt(j+1)=='.'))
            {
                dot[i]=1;
            }          
        }
      }     
      
      count=0;
      for (int i=0; i<n; i++)
      {
          if (dot[i]==0)
          count++;
          else
          count--;
      }

      if (count<0)
      System.out.print("-1");

      else if (dot[0]==1)
      System.out.print("-1");

      else
      {
          int j=0;
          for (int i=0; i<n; i++)
          {
              if (dot[i]==0)
                  store[j++]=1;

              else 
              {
                  store[j]=0;
                  for (int k=j-1; k>=0; k--)
                  {
                    if (store[k]==1)
                    {
                        store[k]=0;
                        break;
                    }
                    else if ((k==0)&&(store[k]!=1))
                    {
                        System.out.print ("-1");
                        System.exit(0);
                    }
                  }
                  j=i+1;
              }
          }

      System.out.print("/");
      for (int i=0; i<n; i++)
      {
          if (store[i]==1)
          System.out.print (last[i]+"/");
      }
    }
    }
}
