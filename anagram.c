#include <stdio.h>
#include<string.h>

void checkAnagram(char s1[], char s2[])
{
    int l1=strlen(s1);
    int l2=strlen(s2);
    int count=0;
    if (l1==l2)
    {
        for (int i=0; i<l1; i++)
        {
            for (int j=0; j<l1; j++)
                if (s1[i]==s2[j])
                {    
                    count++;
                    s2[j]='1';
                    break;
                }
        }
        if (count==l1)
        printf ("anagram\n");
        else
        printf ("not anagram\n");

    }
    else
    printf ("not anagram");
}

void main()
{
    char s1[20], s2[20];

    gets(s1);
    gets(s2);
    checkAnagram(s1, s2);
}