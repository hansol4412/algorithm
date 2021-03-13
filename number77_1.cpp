#include <stdio.h>
#include <algorithm> 
using namespace std;
int main() { 
// 77_1. 친구인가
	/* 현수네 반 학생은 N명이고, 모든 학생은 1부터 N까지 번호가 부여되어 있다. 
	 * 현수에게는 각각 두 명의 학생의 친구관꼐가 번호로 표현된 숫자쌍이 주어진다. 
	 * 만약 (1,2) (2,3) (3,4)의 숫자 쌍이 주어지면 1번 학생과2번 학생이 친구이고, 2번 학생와 3번 학생이
	 * 친구이고, 3번 학생과 4번학생이 친구이다. 이는 연결되어 1번 학생과 4번 학생이 친구가 될 수 있다
     * 친구관계가 맞으면 YES, 아니면 NO를 출력한다. */
	// But, 친구 쌍은 번호 순대로 입력해야 한다. 
	  
	  int n; 
	  printf("학생수를 입력하세요: \n");
	  scanf("%d", &n);
	  int r; 
	  printf("몇 쌍의 친구인지 입력하세요: \n");
	  scanf("%d", &r);
	  
	  int t1[r+1];
	  int t2[r+1];
	  int a;
	  int b;
		for(int i =1; i<=r; i++) {
			scanf("%d", &a);
			scanf("%d", &b);
			t1[i] = a;
			t2[i] = b;
		}
		t2[0]=t1[1];
		
		printf("친구 사이를 알고 싶은 번호를 2개 입력하세요: \n");
		int f1;
		scanf("%d", &f1);
		int f2;
		scanf("%d", &f2);
		
			for(int i=f1; i<f2; i++) {
				if(t1[i]!=t2[i-1]) {
					printf("NO \n");
					break;
				}
				if(i==f2-1) {
					printf("YES \n");
				}
			}
			
	   
	 
}
