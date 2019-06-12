#include<stdio.h>
int main()
{
  //Type your code here
  int n;
   int f1,f2,f3,i;
  scanf("%d",&n);
 
  f1=0;
  f2=1;
  for(i=1;i<=n;i++)
  {
    f3=f1+f2;
    f1=f2;
    f2=f3;
  }
  printf("%d",f3);
  
}