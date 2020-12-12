#include <stdio.h> 

// 모두의 약수
// 자연수 N이 입력되면 1부터 N까지의 각 숫자열의 약수의 갯수를 출력하는 프로그램을 출력하세요. 
int a[100];
int main() {
	int n;
	scanf("%d",&n);
	
	for(int i=1; i<=n; i++){
		for(int j=i; j<=n; j=j+i){
			a[j]++;
		}
	}
	
	for(int t=1; t<=n; t++){
		printf("%d의 약수의 갯수는 %d \n",t,a[t]);
	}
	
	return 0;
}
