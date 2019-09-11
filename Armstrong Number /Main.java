#include <stdio.h>
int main() {
	//Type your code
  int n,i,r,sum=0,re;
  scanf("%d",&n);
  re=n;
 while(n>0)
  {
    r=n%10;
    sum=sum+r*r*r;
    n=n/10;
  }
  if(re==sum)
   printf("Armstrong Number");
  else
  printf("Not an Armstrong Number"); 
	return 0;
}