#include <stdio.h> 
// 31. 탄화수소 질량
// 탄소(C)와 수소(H)로 이루어진 탄화수소에서 탄소는 한 개가 12g, 수소는 한 개가 1g이다. 탄화수소식에서 질량을 구하라
// cf) C1H4의 식은 CH4라고 입력하고 계산한다.

int main() {

	char ch[10];
	scanf("%s",&ch);
	
 		int c=12;
		int h=1;
		 for(int j =0; j<=3; j++) {
			 if(ch[j]==67 ||ch[j]==99) {
				 if(ch[j+1]<48 ||ch[j+1]>57) c=c*1; 
				 else c= c*(ch[j+1]-48);
			 }
			 if(ch[j]==72 ||ch[j]==104) {
				 if(ch[j+1]<48 ||ch[j+1]>57) h=h*1;
				 else h= h*(ch[j+1]-48);	 
			 }
		 }
		 
		 int sum= c+h;
	printf("%d\n",sum);
			 
	return 0;

}
