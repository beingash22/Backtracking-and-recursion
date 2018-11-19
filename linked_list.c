
#include<stdio.h>

#include<stdlib.h>

struct node{
    int data;

    struct node *next;

};

struct node *head=NULL;

void Insert(int x)
{
    
struct node *temp=(struct node*)malloc(sizeof(struct node));

    temp->data=x;
    head->next=temp;
    while(temp->next!=NULL){
        temp=head->next;
    }


    temp->next=NULL;  
}

void Print()
{

    struct node *temp=head;

    while(temp != NULL){
        
    printf("%d",temp->data);
        
    temp=temp->next;
    }
}

int main(){
    
   int i,x,n;
    
    
   printf("enter the number of nodes");
    
   scanf("%d",&n);
    
   for(i=0;i<n;i++)
   {       
    printf("enter the nodes\n");
    scanf("%d",&x);  
    Insert(x);   
   }
    Print();
   return 0;

} 