#include <stdio.h>
#include <stack>
using namespace std;
int main() { 
// 53. K진수 출력 (Stack 클래스 사용x)
/* 10진수 n이 입력되면 m진수로 변형하여 출력하는 프로그램을 작성하시오. 
   스택 자료구조를 사용하여라 */
	int n; 
	printf("변형하는 숫자 n을 입력하세요:");
	scanf("%d",&n);
	int m;
	printf("m진수를 입력하세요:");
	scanf("%d", &m);
	stack<int> stk;
	char str[20] ="0123456789ABCDEF"; 
	
	while(n>0){
		stk.push(n%m);
		n= n/m;
	}
	while(!stk.empty()){
		printf("%c",str[stk.top()]);
		stk.pop();
	}
	
	return 0;

}
