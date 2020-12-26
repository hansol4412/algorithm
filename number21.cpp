#include <stdio.h> 
// 21. 카드게임
/* 0부터 9까지 숫자가 적힌 카드를 가지고 게임을 한다. 두 사람이 카드를 한장 씩 냈을 때 큰 수를 가진 사람이 이긴다.
이겼을 때 3점을 주고 졌을 때는 점수를 부여하지 않는다. 비겼을 때는 1점을 부여한다
10번의 게임을 하고 두 사람의 총점 계산과 이긴  사람을 출력하시오.*/

int main() {
	int a[10];
	int b[10];
		printf("게임을 시작합니다.\n");
		for(int i= 0; i<10; i++) {
			scanf("%d",&a[i]);
		}
		for(int i= 0; i<10; i++) {
			scanf("%d",&b[i]);
		}
		int ant=0;
		int bnt=0;
		for(int j =0; j<10; j++) {
			if(a[j]==b[j]) {
				ant++;
				bnt++;
			}
			else if(a[j]>b[j]) ant += 3;
			else bnt += 3;
		}
		
		printf("A의 총점: %d  B의 총점: %d\n",ant,bnt);
		if(ant==bnt) printf("둘이 비겼습니다\n");
		else if(ant>bnt) printf("A가 이겼습니다.\n");
		else printf("B가 이겼습니다.\n");
		
	
	return 0;
}
