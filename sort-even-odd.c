#include<stdio.h>

void sortodd(int arr3[],int z)
{
	int temp,i,k;
	for(i=0;i<=z;i++)
	{
		for(k=i+1;k<=z;k++)
		{
			if(arr3[k]<arr3[i])
			{
				temp=arr3[i];
				arr3[i]=arr3[k];
				arr3[k]=temp;
			}
		}


	}	
}
void sorteven(int arr2[],int j)
{
	int i,p,temp=0;
	for(i=0;i<=j;i++)
	{
		for(p=i+1;p<=j;p++)
		{
			if(arr2[p]<arr2[i])
			{
				temp=arr2[i];
				arr2[i]=arr2[p];
				arr2[p]=temp;
			}
		}
	}	
}
void main()
{
	int arr[10],arr2[10],arr3[10];
	int i,j=0,len,z=0,m,n;
	printf("enter size of array\n");
	scanf("%d\n",&n);
	for(i=0;i<n;i++)
	{
		scanf("%d",&arr[i]);
	}
	for(i=0;i<n;i++)
	{
		if(arr[i]%2==0)
		{
			
			
			arr2[j]=arr[i];
			j++;
		}
		else
		{
			arr3[z]=arr[i];
			z++;
		}
	}
	sorteven(arr2,j);
	sortodd(arr3,z);
	
	printf("after sorting even array\n");
	for(m=0;m<=j;m++)
		printf("%d\n",arr2[m]);

	printf("after sorting odd array");

	for(n=0;n<=z;n++)
		printf("%d\n",arr3[n]);
	
}