#include <stdio.h> 

// 나이계산  
/* 주민등록증의 번호가 주어지면 주민등록증 주인의 나이와 성별을 판단해 출력하시오 .
주민등록 번호는 -을 기준으로 하여 앞뒤로 나뉘어집니다*/ 
 
int main() {
	char a[20];
	int year;
	int age;
	scanf("%s",&a);
	if (a[7]=='1'||a[7]=='2'){
		age = 1900 + ((a[0]-48)*10 + (a[1]-48));
	}
	else{
		age = 2000 + ((a[0]-48)*10 + (a[1]-48));
	}
	year = 2020-age+1;
	printf("나이는 %d 입니다\n",year);
	
	if(a[7]== '1' || a[7]== '3'){
		printf("성별은 남자입니다 \n");
	}
	else{
		printf("성별은 여자입니다 \n");
	}
	
	return 0;
}
