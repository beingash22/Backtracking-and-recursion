#include <stdio.h>
#include <stdlib.h>
void main()
{
struct person
{
    int weight;
    int height;
};

struct Point
{
    int x,y;
};

struct Point *point;
point=malloc(sizeof(struct Point));
point->x=1;
point->y=2;

struct person *per;
per=(struct person*)point;

printf ("%d", per->height);
printf ("%d\n", per->weight);
}
