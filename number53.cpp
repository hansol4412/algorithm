#include <stdio.h>
int ptr = -1;
int stack[10];
void push(int m){
	stack[++ptr]=m;
}

int pop(){
	return stack[ptr--];
}
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
	char str[20] ="0123456789ABCDEF"; 
	
	
	while(n>0){
		push(n%m);
		n= n/m;
	}
	
	while(ptr!=-1){
		printf("%c",str[pop()]);
	}
	return 0;

}
