import javax.lang.model.util.ElementScanner6;

class maze
{
   static int arr1[][]= 
   {{1,2,3},
    {4,5,6},
    {7,8,9}
};

static int arr2[][]= { {0, 0, 0},
                    {0, 0, 0},
                    {0, 0, 0}};

    static int flag=0;
    static void path(int arr[][],int i,int j,int cost,String temp)
    {
        flag=1;
        if( i<3 && j<3 && arr[i][j]==9)
        {
            temp+=" "+arr1[i][j];
            cost+=arr[i][j];
            System.out.println("path found"+" "+ cost+" "+temp);
            return ;
        }
        else if(i>2 && j>2)
        {
            return ;
        }
    else
    {
        if(i<3 && arr[i][j]!=0 && j<3)
        {
            cost+=arr[i][j];
            temp+=" "+arr1[i][j];
            arr2[i][j]=1;
            path(arr,i+1,j,cost,temp);
            path(arr,i,j+1,cost,temp);
           // path(arr,i+1,j+1,cost,temp);

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
    public static void main(String args[])
    {
    int cost=0;
    String temp="";
    
        int arr[][]= { {1, 0, 0},
                       {1, 1, 0},
                       {1, 1, 9},
                       
    };
        path(arr,0,0,cost,temp);
    }
}