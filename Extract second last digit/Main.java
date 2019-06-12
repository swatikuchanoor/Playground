#include<stdio.h>
int main()
{
  //Type your code here
  int n,i,r;
   scanf("%d",&n);
  for(i=0;i<=1;i++)
  {
   
    
      r=n%10;
      n=n/10;
    
    
  }
  printf("%d\n",r);
  return 0;
 
}