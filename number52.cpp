#include <stdio.h>

int main() { 
// 52. ugly number 
// 어떤 수를 소인수 분해 했을 때 그 소인수가 2 또는 3 또는 5로만 이루어진 수를 ugly number라고 부릅니다.
// 숫자 1은 ugly number의 첫번째 수 입니다.
// 자연수 N이 주어지면 ugly number을 차례로 적을 떄 N번째 ugly number을 출력하시오.
	int n;
	printf("몇번째 ugly number을 출력하십니까?");
	scanf("%d",&n);
	int a[n+1];
	a[1]=1;
	int p2 =1;
	int p3 =1;
	int p5 =1;
	int min =0;
	
	for(int i=2; i<=n; i++){
		if(2*a[p2]<=3*a[p3])min=2*a[p2];
		else min= 3*a[p3];
		if(5*a[p5]<min) min = 5*a[p5];
		if(min==2*a[p2])p2++;
		if(min==3*a[p3])p3++;
		if(min==5*a[p5])p5++;
		a[i]=min;
	}
	
	printf("%d번째 ugly number는 %d입니다.\n",n,a[n]);
	
	return 0;

}
