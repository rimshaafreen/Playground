#include <stdio.h>
int main() {
	//Type your code
  int n,i,r,res,sum=0,f;
  scanf("%d",&n);
  res=n;
  while(n>0)
  { i=1;f=1;
   r=n%10;
   while(i<=r)
   {f=f*i;
    i++;}
   sum=sum+f;
   n=n/10;}
    if(res==sum)
      printf("Yes");
  else
    printf("No");
	return 0;
}