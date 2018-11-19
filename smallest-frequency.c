#include <stdio.h>
#include<string.h>
void main()
{
	char str[50];
	int i,j,len=0,count=0,min,p=100;
	printf("enter string\n");
	scanf("%s",str);
	len=strlen(str);
	
	for(i=0;i<len;i++)
	{
        count=0;
		for(j=0;j<len;j++)
		{
			if(str[i]==str[j])
			{
				count++;
			}
		}
        min=count; 
		if(min<p) 
		{
			p=min;
		}
	}
	printf("smallest char->%d\n",p);
}