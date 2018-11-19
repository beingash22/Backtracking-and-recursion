/*#include<stdio.h>
int main()
{
int a[]={1,-1,3,2,-7,-5,11,6},i;
for(i=0;i<8;i++)
printf("%d",a[i]);
    
getch();
return;    
}*/

#include<stdio.h>
int a[]={1,8,3,2,7,5,11,6};
//void swap(int i,int j);
int main()
{
    int k,j,i,l,temp;
for(i=0;i<8;i++)
{
                k=a[i]%2?a[i]+9999:a[i];
for(j=i+1;j<8;j++)
 {              
                l=a[j]%2?a[j]+9999:a[j];
                if(k>l){
                        
     temp=a[j];
     a[j]=a[i];
     a[i]=temp;
                        }
                }
               }
    for(i=0;i<8;i++)
printf("%d ",a[i]);
           
getch();
return;    
}   


