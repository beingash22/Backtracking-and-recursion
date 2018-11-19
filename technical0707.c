// arrray k saare power set store karaana h.
#include<stdio.h>
void main()
{
int a[3]={1,2,3},i,j,k;
//total_set=pow(2,3);
for(i=0;i<1<<3;i++)
{
    printf("{");
    for(j=0;j<3;j++)
    {
        k=(i&1<<j)?1:0;
        if(k==1)
        printf("%d",a[j]);
        }
        printf("}");
        printf("\n");
    }
}