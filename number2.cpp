#include <stdio.h>

// 자연수의  합  
// 자연수 A, B가 주어지면 A부터 B가지의 합을 수식과 합께 출력하시오. 
 
int main() {
	int a;
	int b;
	int sum=0;
	scanf("%d %d", &a, &b);
	for(int i=a; i<b; i++)
	{
		printf("%d + ",i);
		sum+=i;		 		
	}
	sum+= b;
	printf("%d = %d", b, sum);
	
	return 0;
}
