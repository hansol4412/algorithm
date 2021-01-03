#include <stdio.h> 
// 31_1. 탄화수소 질량
// 탄소(C)와 수소(H)로 이루어진 탄화수소에서 탄소는 한 개가 12g, 수소는 한 개가 1g이다. 탄화수소식에서 질량을 구하라
// cf) C1H4의 식은 CH4라고 입력하고 계산한다.

int main() {

		 char ch[10];
		 int c = 0;
		 int h = 0; 
		 int position = 0;
		 printf("식을 입력하시오:");
		 scanf("%s",&ch);
		 if(ch[1]=='H') {
			 c=1;
			 position = 1;
		 }
		 else {
			 for(int i=1; ch[i]!='H'; i++) {
				 c=10*c + (ch[i]-'0');
				 position=i+1;
			 }
			 
		 }
		 
		 if(ch[position+1]=='\0') h=1;
		 else {
			 for(int i = position+1; ch[i]!='\0'; i++) {
				 h=10*h+ (ch[i]-'0');
			 }
		 }
		 printf("C의 갯수: %d\n",c);
		 printf("H의 갯수:%d\n",h);
		 int sum = c*12+h;
		 printf("탄화수소 질량은 %dg이다.\n",sum);
	return 0;

}
