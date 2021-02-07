#include <stdio.h>
using namespace std;
int DFS(int n){
	if(n<=1){
		printf("%d ",1);
	}
	else{
		printf("%d ",n);
		DFS(n-1);
	}
}
int main() { 
// 56. 재귀함수 분석
// 자연수 N이 주어지면 재귀함수를 사용하여 1부터 N까지 출력하는 프로그램을 작성하시오.
	int n;
	printf("n의 값을 입력하세요:");
	scanf("%d",&n);
	DFS(n);
	return 0;

}
