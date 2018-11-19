
// Java code for stack implementation 
  
import java.io.*; 
import java.util.*; 
  
class Test 
{   
    public static String url () 
    { 
        Stack<String> stack = new Stack<String>(); 
        String str="/";
        System.out.print (str);
        int count=0;
        int len= str.length();

      for (int i=0; i<len; i++)
      {
          if (str.charAt(i)=='/')
          count++;
      }

      String save[]= str.split("/", count-1);
      System.out.println(save[0]);
      String last[]=new String[count-1];
      int p=0;
      for (int i=0; i<save.length; i++)
      {
          if (save[i].compareTo(".")!=0)
          {  last[p]=save[i];
            p++;
          }
      }
      int n=0;
      for (int i=0; i<last.length; i++)
      {
          if (last[i]!=null)
            n++;
      }
      if (n==0)
      return "-1";
     
      for (int i=0; i<n; i++)
      {
        if(last[i].equals(".."))
          {
           /* for(String i1:stack)
            {
                  System.out.println(i1);
            }
            */

              if (stack.isEmpty())
              {
              return "-1";
              }
              stack.pop();
            }
        else if (last[i].compareTo(".")!=0)
          stack.push(last[i]);
      }
      String temp="/";
      for (String i: stack)
      {
        temp=temp+i+"/";
      }
      return temp;
    } 

    public static void main (String args[])
    {
        String s=url();
        System.out.print (s);
    }
} 