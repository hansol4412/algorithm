#include <stdio.h>
using namespace std;
int DFS(int n){
	if(n<=1){
		printf("%d ",n);
	}
	else{
		DFS(n/2);
		printf("%d ",n%2);
		
	}
}
int main() { 
// 57. 재귀함수  이진수 출력
// 10진수 N이 입력되면 재귀함수를 사용하여 2진수로 변환해 출력하는 프로그램을 작성하시오.
	int n;
	printf("10진수의 값을 입력하세요:");
	scanf("%d",&n);
	DFS(n);
	return 0;
 
}
