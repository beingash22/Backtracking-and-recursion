#include <stdio.h>
float wtrr(int *arrival, int*run, int n, int q)
{
    float wait=0, tt=0, temp=0;
    float ttime[n];
    int i, rt[n];

    for (i=0; i<n; i++)
    {
    tt+=*(run+i);
    rt[i]=*(run+i);
    }
    //printf ("%f\n", tt);
    while (tt!=0)
    {
        
        for (i=0; i<n; i++)
        {
            if (*(run+i)==0)
            continue;

            else if (*(run+i)>=q)
            {
                tt-=q;
                temp+=q;
                ttime[i]=temp;
                *(run+i)-=q;
            }
            else{
                tt-=*(run+i);
                temp+=*(run+i);
                ttime[i]=temp;
                *(run+i)=0;
            }
            //tt-=q;
        }
    }

    for (i=0; i<n; i++)
    {
        wait+=ttime[i]-*(arrival+i)-rt[i];
    }
    wait=wait/n;
    return wait;
}

void main()
{
    int a[]={0,1,4};
    int r[]={5,2,3};
    printf ("%f\n",wtrr(a, r, 3, 3));
}