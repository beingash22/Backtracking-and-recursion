#include <stdio.h>

static int m=0;

int max(int a , int b){
    return a>b?a:b;
}

int path(int maze[2][2], int i, int j)
{

        if(i<2&&j<2&&maze[i][j]!=0){

            if(i==1&&j==1){
                return maze[i][j];
            }
            return maze[i][j] + max(path(maze,i+1,j),path(maze,i,j+1));
        }
        return 0;
}
/*{
    if (i==1 && j==1)
    {
        c=c+maze[i][j];
        if (m<c)
        {
            m=c;
            return c;
        }
        return 0;
        
    }

    if(i>=2 || j>=2)
    {
        return 0;
    }

    //printf ("%d\n", c);
    else
    {
    if (i<2 && maze[i][j]!=0)
    {
        c=c+maze[i][j];
        printf ("a-%d\n", c);

       path(maze, i+1, j, c);
    }
    if (j<2 && maze[i][j]!=0)
    {
        c=c+maze[i][j];
        printf ("b-%d\n", c);
       path(maze, i, j+1, c);
    }
       
    }
        return 0;
     
   
} */

void main()
{
   //int n;
   //scanf ("%d", &n);

    int maze[2][2]={{5,6}, {0,4}}; 
    int n= path(maze, 0, 0);

    if(n)
    printf ("%d\n", n);
    else
    printf ("no path\n");
    
}