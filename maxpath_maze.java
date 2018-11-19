import java.io.*;



class maze
{
    static int arr2[][]= { {0, 0, 0},
                    {0, 0, 0},
                    {0, 0, 0}};
    static int arr3[][]= { {0, 0, 0},
                    {0, 0, 0},
                    {0, 0, 0}};
                    
    static int max=0, flag=1;

    static void display(int arr[][])
    {
        for (int i=0; i<3; i++)
        {
            for (int j=0; j<3; j++)
            {
                if (arr3[i][j]==1)
                System.out.print (arr[i][j]);
                else
                System.out.print(0);
            }
            System.out.println ();
        }
    }
    static void copy()
    {
        for (int i=0; i<3; i++)
        {
            for (int j=0; j<3; j++)
            arr3[i][j]=arr2[i][j];
        }
    }
    static void maxpath(int arr[][],int i,int j,int cost)
    {
        if(i==2 && j==2)
        {
            arr2[i][j]=1;
            cost+=arr[i][j];
            if (max<cost)
            {
                max=cost;
                copy();
            }
            return ;
        }
        else if(i>3 && j>3)
        {
            return ;
        }
        else
        {
        if(i<3 && j<3 && )
        {
            cost+=arr[i][j];

            arr2[i][j]=1;
            maxpath(arr,i+1,j,cost);
            maxpath(arr,i,j+1,cost);
            maxpath(arr,i+1,j+1,cost);

            arr2[i][j]=0;
        
          /* if(i>=1 && arr2[i-1][j]!=1)
            {
             path(arr,i-1,j,cost,temp);
            }
            if(j>=1 && arr2[i][j-1]!=1)
            {
                 path(arr,i,j-1,cost,temp);
            }
            */
           
        }
        }
       
    }

    public static void main (String args[])
    {
        int a[][]={{2,1,3},
                  {4,5,6},
                  {8,1,7}};

                 maxpath(a, 0, 0, 0);
                System.out.println (max);

                display(a);

    }
}
