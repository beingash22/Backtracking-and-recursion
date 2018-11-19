#include<stdlib.h>
#include<stdio.h>
int fun(int coin[5], int r)
{
    int *x=(int*) malloc (sizeof(int)*(r+1));
    int t;

    for (int i=0; i<=r; i++)
    x[i]=9999;

    x[0]=0;

    for (int j=0; j<5; j++)
    {
        for(int i=0; i<=r; i++)
        {
            if (i>=coin[j])
            {
                t=1+x[i-coin[j]];
                if(x[i]>t)
                x[i]=t;
            }
        }
    }
    return x[r];
}

void main()
{
    int coin[]={0,2,4,5,7};
    int r=10;
    printf("%d\n",fun(coin, r));
}

// all possible ways for 13
// 7,4,2 --- 5,4,4 --- 7,2,2,2  
// but we need to take 2D array in printing all these paths