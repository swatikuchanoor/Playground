#include<stdio.h>

int main()
{
  int n,r,sum=0,res,res1;
  scanf("%d",&n);
  
  while(n>0)
  {
    r=n%10;
   
    sum=sum+r;
    
    n=n/10;
  }
 // printf("%d",sum);
 
 if(sum>10) 
  {
    res1=sum%10;
    res=res1+1;
  
 printf("%d",res);
}
else
{
  printf("%d",sum);
}
  return 0;
}
    
    
    