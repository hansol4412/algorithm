#include <stdio.h> 
// 20. 가위 바위 보
// 총 n번의 가위 바위 보 게임을 하여 A가 이기면 A를 출력하고 B가 이기면 B를 출력하고 비기면 D를 출력한다
// 1:가위  2:바위   3:보

int main() {
	int n;
	printf("몇 번의 게임을 실행할 것인가?:");
	scanf("%d",&n);
	int a[n];
	int b[n];
	int cna=0;
	int cnb=0;
	for (int i =0; i<n; i++) {
			scanf("%d %d",&a[i],&b[i]);
			if(a[i]==b[i]) printf("D \n");
			else if(a[i]==2 && b[i]==1) {printf("A \n"); cna++;}
			else if(a[i]==3 && b[i]==2) {printf("A \n"); cna++;}
			else if(a[i]==1 && b[i]==3) {printf("A \n"); cna++;}
			else { printf("B \n"); cnb++;}
		}
		if(cna>cnb)printf("최종 승자는 A입니다.\n");
		else if(cna<cnb)printf("최종 승자는 B입니다.\n");
		else printf("둘은 비겼습니다.\n");
	return 0;
}
