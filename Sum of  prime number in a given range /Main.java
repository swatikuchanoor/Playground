#include<stdio.h>
int main()
{
  //Type youe code here
  int max,i,sum=0,n,count;
  scanf("%d",&max);
  for(n=1;n<=max;n++)
  {
  
    count=0;
  for(i=1;i<=n;i++)
  {
    if(n%i==0)
    {
      count++;
    }
  }
    if(count==2)
    {
     sum=sum+n;
    }
  
  }
  printf("%d",sum);
  
  return 0;
}