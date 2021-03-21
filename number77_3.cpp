#include <stdio.h>
#include <algorithm> 
using namespace std;
int unf[100];

int Find(int v){
	if(unf[v]==v) return v;
	else return unf[v]=Find(unf[v]); //메모라이제이션 
} 

void Union(int a, int b){
	
	a=Find(a);
	b=Find(b);
	if(a !=b) {
		unf[a]=b;
	} 
}


int main() { 
// 77_3. 친구인가
	/* 현수네 반 학생은 N명이고, 모든 학생은 1부터 N까지 번호가 부여되어 있다. 
	 * 현수에게는 각각 두 명의 학생의 친구관꼐가 번호로 표현된 숫자쌍이 주어진다. 
	 * 만약 (1,2) (2,3) (3,4)의 숫자 쌍이 주어지면 1번 학생과2번 학생이 친구이고, 2번 학생와 3번 학생이
	 * 친구이고, 3번 학생과 4번학생이 친구이다. 이는 연결되어 1번 학생과 4번 학생이 친구가 될 수 있다
     * 친구관계가 맞으면 YES, 아니면 NO를 출력한다. */
	// Union&Find 자료구조 
	  
	  int n; 
	  printf("학생수를 입력하세요: \n");
	  scanf("%d", &n);
	  int r; 
	  printf("몇 쌍의 친구인지 입력하세요: \n");
	  scanf("%d", &r);
	  int a;
	  int b;
	  
	  for(int i=1; i<=n; i++){
	  	unf[i]=i;
	  }
	  
	  for(int i=1; i<=r; i++){
	  	scanf("%d %d", &a, &b);
	  	Union(a,b);
	  }
	  
		printf("친구 사이를 알고 싶은 번호를 2개 입력하세요: \n");
		int fa;
		int fb;
		scanf("%d %d", &fa, &fb);
		fa= Find(fa);
		fb= Find(fb);
		
		if(fa != fb){
			printf("NO \n");
		}
		else{
			printf("YES \n");
		}
		
		return 0;
			 
}
