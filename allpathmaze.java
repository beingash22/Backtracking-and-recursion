import java.io.*;

class Maze
{
    static int n;
    static int sol[][]=new int[10][10];

    public static void display(int a[][])
    {
        for (int k=0; k<n; k++)
        {
            for (int p=0; p<n; p++)
            {
                if (sol[k][p]==1)
                System.out.print(a[k][p]); 
            }
        }
        System.out.println();
    }

    public static int findpath(int a[][], int i, int j)
    {
        if (i<n && j<n && a[i][j]!=0)
        {
            if (i==n-1 && j==n-1)
            {
                sol[i][j]=1;
                display(a);
                return 0;
            }
            else
            {
                sol[i][j]=1;
               if(findpath(a, i+1, j)==1)
               {
                    return 1;
               }
               else if (findpath(a, i, j+1)==1)
               {
                    return 1;
               }
                    sol[i][j]=0;
                    return 0;
            }
        }
        else 
        return 0;
    }

    public static void main (String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader (new InputStreamReader (System.in));

        n=Integer.parseInt(br.readLine());
        int a[][]=new int[n][n];

        for (int i=0; i<n; i++)
        {
            for (int j=0; j<n; j++)
            a[i][j]= Integer.parseInt(br.readLine());
        }

        findpath(a, 0, 0);
    }
}