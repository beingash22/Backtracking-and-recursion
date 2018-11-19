#include<stdio.h>
int isGroup(int *arr,int target,int start){
	if(start>=5)
		{printf("%d\n",target);
		return (target==0);}
	return isGroup(arr,target+arr[start],start+1)||isGroup(arr,target-arr[start],start+1);
}
void main(){
	int arr[5]={1,2,4,5,6};
	printf("%d",isGroup(arr,6,0));
}
