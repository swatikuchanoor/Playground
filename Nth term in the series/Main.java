#include<stdio.h>

int main()
{
  // Type your code here
  int n,i,res;
 
  scanf("%d",&n);
  if(n%2==1)
  {
    for(i=0;i<n/2;i++)
    {
      res=(n-1);
    }
    printf("%d",res);
  }
  else
  {
    res=(n-1)/2;
    printf("%d",res);
  }
     
}