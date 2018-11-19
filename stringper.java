import java.io.*;

class stringper
{
    int print[]=new int[100];
    int allpermutations(String s, int l, int start)
    {
        
        if (start==l)
        {
            for(int i=0; i<l; i++){
                if (print[i]==1)
                System.out.print(s.charAt(i));
            }
            System.out.println();
            return 0;
        }

        if (start<l)
        {  
            print[start]=1;
            allpermutations(s, l, start+1);
            allpermutations(s, l, start+2);
            print[start]=0;
        }

        return 0;
    }

    public static void main (String args[]) throws IOException{

        BufferedReader br=new BufferedReader (new InputStreamReader (System.in));

        String str=br.readLine();
        stringper ob=new stringper();
        System.out.println();
        ob.allpermutations(str, str.length(), 0);
    }
}