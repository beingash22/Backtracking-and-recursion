#include <stdio.h>

void bubble(int ar[])
{
    int temp;
    for (int i=0; i<5; i++)
    {
        for (int j=0; j<5; j++)
        {
            if (ar[j]>ar[j+1])
            {
                temp=ar[j];
                ar[j]=ar[j+1];
                ar[j+1]=temp;
            }
        }
    }
}

void print(int ar[])
{
     for (int i=0; i<6; i++)
        printf ("%d", ar[i]);

}

void main()
{
    int a[6]={5,8,2,9,0,2};

    bubble(a);
    print(a);
}