#include<stdio.h>

void main()
{
    int max=0;
    int a[5]={3,2,4,5,1};
for (int i=0; i<5; i++)
{
    if (max<a[i])
    max=a[i];
}

while (max)
{
    for (int i=0; i<5; i++)
    {
        if (a[i]>=max)
        printf ("*");
        else
        printf (" ");
    }
    max--;
    printf ("\n");
}
}