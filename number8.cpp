#include <stdio.h> 

// 올바른 괄호  
/* 괄호가 입력되면 올바른 괄호이면 'YES' 올바르지 않은 괄호이면 'NO'를 출력한다. */ 
 
int main() {
	char a[100];
	int p=0;
	gets(a);
		for(int i=0; a[i]!='\0'; i++){
			if(a[i]=='(')p++;
			if(a[i]==')')p--;	
		}
		if(p==0)printf("YES");
		else printf("NO");
	
	return 0;
}
