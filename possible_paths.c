#include<stdio.h>
   
void printpathutil(int mat[][3],int i,int j,int m,int n,int *path,int pi)
{
     int k,l;
    if(i==m-1)
    {
    for(k=j;k<n;k++) 
             path[pi+k-j]=mat[i][k];
    for(l=0;l<pi+n-j;l++) 
             printf("%d",path[l]);
    printf("\n");
    return; 
    }
    
    if(j==n-1)
    {
    for(k=i;k<n;k++) 
             path[pi+k-i]=mat[k][j];
    for(l=0;l<pi+m-i;l++) 
             printf("%d",path[l]);
    printf("\n");
    return; 
    }
    path[pi]=mat[i][j];
    //all paths after moving down 
    printpathutil(mat,i+1,j,m,n,path,pi+1);
    printpathutil(mat,i,j+1,m,n,path,pi+1);
}
void printAll(int mat[][3], int m, int n)
{
    int path[m+n];
    printpathutil(mat,0,0,m,n,path,0);
}
int main()
{
    int mat[3][3]={1,2,3,4,5,6,7,8,9};
  printAll(mat,3,3);  
getch();
return;    
} 
