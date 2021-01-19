#include <stdio.h> 
// 41_1. 연속된 자연수의 합
// 양의 정수가 입력되면 2개 이상의 연속된 자연수의 합으로 정수 N을 표현하는 방법의 가짓수를 출력하는 프로그램을 작성합니다.
int main() {
	int n;
	printf("양의 정수를 입력하세요: ");
	scanf("%d",&n); 
	int temp = n;
	int a=2;
	int cnt=0;
	n--;
	while(n>0){
		n=n-a;
		if(n%a==0){
			for(int i = 1; i<a; i++){
				printf("%d + ",n/a+i);
			}
			printf("%d = %d \n",n/a+a,temp);
			cnt++;
		}
		a++;
	}
	printf("%d개\n",cnt);
	
	
	 
	return 0;

}
