//_A_B_C=D what sign(+,-) did gives the ans correct (print whole combinations and output)


#include<stdio.h> 
int calculate(int *arr,char sign,int i,int d,int k,int len)
{
	
	switch(sign)
	{
		case '+':k+=arr[i];
				break;
		case '-':k-=arr[i];	
			break;
	}

	if(i==len)
		{if(k==d)
			{
			printf("true");
				printf("%d",k);
			return 1;
			}
		else return 0;
		}
	calculate(arr,'+',i+1,d,k,len)||calculate(arr,'-',i+1,d,k,len);
}
void main()
{
	int arr[3]={4,4,4},i=0,k=0,d=-12;
	//int len=strlen(arr);
	
	calculate(arr,'+',i,d,k,3);
	calculate(arr,'-',i,d,k,3);
}
	
	