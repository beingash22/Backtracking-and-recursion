#include <stdio.h>


int main()

{

    int a,i,count=0,j,n,k=0,p;

    printf("enter the number");

    scanf("%d",&a);

    for(j=2;j<=a;j++)
    {

        k=0;

        count=0;
        for(i=1;i<=(j/2);i++){

           if(j%i==0)

               count++;

        }
         if(count==1){

            n=j;

            while(n>0){

                p=n%10;
                k=k*10+p;
                n=n/10;

            }

            if(k==j){

                printf("%d ",j);

            }

         }

    }


    return 0;

}