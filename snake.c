#include<math.h>
#include<stdlib.h>
#include<stdio.h>
int random1()
{
    return rand()%7;
}
void main()
{
    int A[101]={0},i=0,sc,lc,start,end,chance=1;
    scanf("%d%d",&sc,&lc);
    for(int i=0;i<sc+lc;i++)
    {   scanf("%d%d",&start,&end);
        A[start]=end;
        printf("%d",A[start]);
    
        printf("input correct\n");
    }


    printf("input printed");
    int ply1=0,ply2=0;
    int sum;
    
    while(1)
    {
    switch(chance)
      {  case 1:
        { sum=random1(); 
          while((ply1+sum)!=100)
          { if(A[ply1+sum]!=0)
                ply1=A[ply1+sum];
            else
                ply1+=sum;
            //i+=1;
            
            chance=2;
            break;
          }
          if((ply1+sum)==100){chance=3;/*printf("player1 win\n");*/}
          break;
        }
        case 2:
            {sum=random1();
                while((ply2+sum)!=100)
            {
                if(A[ply2+sum]!=sum)
                ply2=A[ply2+sum];
                else
                    ply2+=sum;
                
                chance=1;
                break;
            }
            if((ply2+sum)!=100){chance=3;/*printf("player2 win");*/}
            break;
        
            }  
      }
        if(chance==3)
            {printf("player1 win");break;}

        else if(chance==3)
            {printf("player 2 win");break;}
    }


}