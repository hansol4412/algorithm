#include <stdio.h>
#include <vector>
#include <queue>
#include <algorithm> 
using namespace std;
int ch[100];
int main() { 
// 71. 송아지 찾기 (BFS : 상태트리탐색) 
/* 현수는 송아지를 잃어버렸다.송아지에는 위치추적기가 달려있다. 현수의 위치와
   송아지의 위치가 직성상의 좌표 점으로 주어지면 현수는 현재 위치에서 송아지의
   위치까지 다음과 같은 방법으로 이동한다.
   현수는 스카이 콩콩을 타고 가는데 한 번의 점프로 앞으로 1, 뒤로 1, 앞으로 5를
   이동할 수 있다. 최소 몇번의 점프로 현수가 송아지 위치까지 갈 수 있는지
   구하는 프로그램을 작성하시오. */
// Queue를 사용해 작성하여라. 
	int s;
	printf("현수의 위치를 입력하여라:");
	scanf("%d",&s);
	int e;
	printf("송아지의 위치를 입력하여라:");
	scanf("%d",&e); 
	
	int dis[3]={1,-1,5}; //현수가 이동가능한 방법 
	queue<int> Q;
	Q.push(s); 
	 ch[s]=1;  
	 while(!Q.empty()){
	 	int x=Q.front();
	 	Q.pop();
	 	for(int i=0; i<3; i++){
	 		int pos = x + dis[i];
	 		if(pos<1 || pos>100) continue;
	 		if(pos==e){
	 			 printf("송아지를 찾기 위해 최소 %d의 점프를 해야한다,\n",ch[x]); 
	 			 return 0;
			 }
			if(ch[pos]==0){
				Q.push(pos);
				ch[pos]=ch[x]+1; // 최소점프 계산하기 
			}
		 }
	 } 
	return 0;
  
}
