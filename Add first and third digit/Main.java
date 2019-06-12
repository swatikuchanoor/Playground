#include<stdio.h>
int main()
{
  //Type your code here
  int n;
  scanf("%d",&n);
  int r,a,b,c,sum=0,i;
 r=n%10;
  n=n/100;
  sum=r+n;
  printf("%d\n",sum);
   
   
  return 0;
}