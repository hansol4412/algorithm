#include <stdio.h> 

// 영어단어 복구  
/* 에러로 표시되는 영어단어를 원래의 표현대로 공백을 제거하고 소문자화
	시켜 출력하는 프로그램을 작성하세요.  */ 
 
int main() {
	char a[100];
	char b[100];
	int p=0;
	gets(a);
		for(int i=0; a[i]!='\0'; i++){
			if(a[i]!=32 && a[i]>=65 && a[i]<=90){
				b[p++]=a[i]+32;
			}	
		}
		b[p]='\0';
		printf("%s\n",b);
	
	return 0;
}
