#include<stdio.h>
#include<string.h>

void reverse(char ch[]){
    int l,i;
    l=strlen(ch);
    for(i=0; i<(l/2); i++)
     swap(&ch[i],&ch[l-1-i]);
    
}
void swap(char *a,char *b){
    char *c;
    *c=*a;
    *a=*b;
    *b=*c;
}
int main(){
    char ch[20];
    printf("enter the string\n");
    scanf("%s",ch);
    reverse(ch);
    
    printf ("%s\n", ch);
}