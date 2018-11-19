/*
Problem: Is there any possibity that we get the answer 6 by using the array arr.

isGroup(arr,6,0) : in this arr represent the array; 6 represent the target(answer that we want to get); 0 represent the index of start
Addition : target-arr[start] reduce the answer into 0 (opposite operation of addition)
Subtracton : target+arr[start]

*/
#include<stdio.h>
int isGroup(int *arr,int target,int start){
	if(start>=5)
		return (target==0);
	return isGroup(arr,target-arr[start],start+1) || isGroup(arr,target+arr[start],start+1);
}
void main(){
	int arr[5]={1,2,4,5,6};
	printf("%d",isGroup(arr,6,0));
}


/*

Variation 1 for above Program


#include<stdio.h>
int isGroupSum(int *arr,int target,int start,char *s,int i){
	if(start>=5)
		return (target==0);
	return isGroupSum(arr,target-arr[start],start+1,s,i+1)&&(s[i]='+') || isGroupSum(arr,target+arr[start],start+1,s,i+1)&&(s[i]='-') || isGroupSum(arr,target,start+1,s,i+1)&&(s[i]=' ');
}
void main(){
	int a[5]={1,2,4,5,6};
	char s[10]="";
	//printf("%d\n",isGroupSum(a,6,0,s,0));
	if(isGroupSum(a,6,0,s,0)){
		for(int i=0;i<5;i++)
			printf("%c %d ",s[i],a[i]);
		printf(" = %d",6);
	}
}


*/

/*




*/