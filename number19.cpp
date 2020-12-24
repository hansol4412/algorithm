#include <stdio.h> 
// 19. 분노 유발자
/* 학생들이 영화를 볼 떄 만약 앞자리에 앉은 키카 큰 학생이 있으면 그 학생보다 작은 학생은 스크린이 보이지 않습니다
한 줄에 낮은 키 정보가 주어지면 뒷 사람 모두의 시야를 가리는 분노유발작 그 줄에 몇 명 있는지 구하시오.*/

int main() {
	int n;
	printf("학생 수를 입력하세요:");
	scanf("%d",&n);
	int a[n];
		for (int i =0; i<n; i++) {
			scanf("%d",&a[i]);
		}
		 int max= a[n-1];
		 int cnt = 0;
		 for(int i  = n-1; i>=0; i--) {
			 if(a[i]>max) {
				 cnt++;
				 max = a[i];
			 }
		 }
		 printf("분노유발자는 %d명 입니다.\n",cnt);
	return 0;
}
