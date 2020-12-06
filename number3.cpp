#include <stdio.h>

// 진약수의 합   
// 자연수 N이 주어지면 자연수 N의 진약수의 합을 수식과 함께 출력하는 프로그램을 작성하시오. 
 
int main() {
	int n;
	int sum=1;
	scanf("%d", &n);
	printf("%d", 1);
	for(int i = 2; i<n; i++){
		if(n%i==0){
			sum+=i;
			printf(" + %d", i);	
		}
	}
	printf(" = %d", sum);
	
	return 0;
}
