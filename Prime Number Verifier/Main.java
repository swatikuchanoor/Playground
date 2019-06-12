// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  // Enter your code here 
  int n,count=0,i;
  scanf("%d",&n);
 for(i=1;i<=n;i++)
 {
   if(n%i==0)
   {
     count++;
   }
 }
  if(count==2)
  {
    printf("prime");
  }
  else if(n==0)
  {
    printf("neither");
  }
  else
  {
    printf("composite");
  }
  
  
   return 0;
}