#include <stdio.h> 

// 숫자만 추출  
/* 문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로
	자연수를 만듭니다. 그 자연수의 약수의 갯수를 출력합니다.  */ 
 
int main() {
	char a[100];
	int res = 0 ;
	int cnt = 0;
	scanf("%s",&a);
	for(int i = 0; a[i]!='\0'; i++){
		if(a[i]>=48&&a[i]<=57){
			res = res*10+(a[i]-48);
		}
	}
	printf("자연수는 %d 입니다 \n",res);
	for(int j = 1; j<=res; j++){
		if(res%j==0)cnt++;
	}
	printf("추출된 자연수의 약수의 갯수는 %d 입니다 \n",cnt);
	
	return 0;
}
