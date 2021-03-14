#include <stdio.h>
#include <algorithm> 
#include <vector>
using namespace std;
int main() { 
// 77_2. 친구인가
	/* 현수네 반 학생은 N명이고, 모든 학생은 1부터 N까지 번호가 부여되어 있다. 
	 * 현수에게는 각각 두 명의 학생의 친구관꼐가 번호로 표현된 숫자쌍이 주어진다. 
	 * 만약 (1,2) (2,3) (3,4)의 숫자 쌍이 주어지면 1번 학생과2번 학생이 친구이고, 2번 학생와 3번 학생이
	 * 친구이고, 3번 학생과 4번학생이 친구이다. 이는 연결되어 1번 학생과 4번 학생이 친구가 될 수 있다
     * 친구관계가 맞으면 YES, 아니면 NO를 출력한다. */
	// 무작위로 입력 가능 
	  
	  int n; 
	  printf("학생수를 입력하세요: \n");
	  scanf("%d", &n);
	  int r; 
	  printf("몇 쌍의 친구인지 입력하세요: \n");
	  scanf("%d", &r);
	  
	  vector<int> t1;
	  vector<int> t2;
	  int a;
	  int b;
	  t1.push_back(0);
		for(int i =1; i<=r; i++) {
			scanf("%d", &a);
			scanf("%d", &b);
			if(i==1){
				t2.push_back(a);
			}
			t1.push_back(a);
			t2.push_back(b);
			
		}
		
		//무작위로 입력한 친구 번호 정렬하기
		sort(t1.begin(), t1.end());
		sort(t2.begin(), t2.end());
		
		/*
		for(int i =0; i<=r; i++ ){
			printf("%d ",t1[i]);
		}
		printf("\n");
		for(int i =0; i<=r; i++ ){
			printf("%d ",t2[i]);
		}
		*/
		
		
		printf("친구 사이를 알고 싶은 번호를 2개 입력하세요: \n");
		int f1;
		scanf("%d", &f1);
		int f2;
		scanf("%d", &f2);
		
		int f3=0;
		int f4=0;
		
		//정렬된 친구들 중에서 찾고 싶은 친구의 번호가 배열 어디에 있는지 인덱스 찾기
		for(int i =1; i<=r; i++) {
			if(t1[i]==f1) f3=i;
		}
		for(int i =1; i<=r; i++) {
			if(t2[i]==f2) f4=i;
		}
		
		/*
		printf("%d \n",f3);
		printf("%d \n",f4);
		*/
			for(int i=f3; i<f4; i++) {
				if(t1[i]!=t2[i-1]) {
					printf("NO \n");
					break;
				}
				if(i==f4-1) {
					printf("YES \n");
				}
			}
			
			
	   
	 
}
