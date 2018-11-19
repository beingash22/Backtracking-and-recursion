#include <stdio.h>
#include <string.h>

void count(char *str)
{
	int i,j;
	int len=0,count=0;
    //char key;
	len=strlen(str);
	for(i=0;i<len;i++)
	{
		for(j=i+1;j<len;j++)
		{
			if(str[i]==str[j])
			{
				count++;
                str[j]='#';
			}
		}
        if (str[i]!='#')
		    printf("%c->%d\n", str[i], count+1);
		count=0;
	}
}
void main()
{
	char str[50];
	int i,j,len;
	printf("enter string");
	scanf("%s",str);
	count(str);
}