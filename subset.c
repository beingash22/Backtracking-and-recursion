#include <stdio.h>

static int sol[20];

void display(int a[])
{

    for (int i=0; i<6; i++)
    {
        if (sol[i]==1)
        printf ("%d\t", a[i]);
    }
    printf ("\n");
}

int subset(int a[], int n, int sum)
{
    if(sum==0)
    {
        display(a);
        return 0;
    }

    if (n<6 && sum>0)
    {
        //printf ("%d\t",sum);
        sol[n]=1;
        if(subset(a, n+1, sum-a[n]))
        {
            return 1;
        }
        sol[n]=0;
        if(subset(a, n+1, sum))
        {
            return 1;
        }
        return 0; 
    }
    else
    return 0;
}



void main()
{
    int a[]={1,10,4,8,2,7};
    int sum=15;

    subset(a, 0, sum);
}


/*int isGroup(int *arr,int target,int start){
	if(start>=5)
		{printf("%d\n",target);
		return (target==0);}
	return isGroup(arr,target+arr[start],start+1)||isGroup(arr,target-arr[start],start+1);
}
void main(){
	int arr[5]={1,2,4,5,6};
	printf("%d",isGroup(arr,6,0));
}
*/
