#include <stdio.h>
#include <vector>
#include <algorithm> 
using namespace std;
vector<int> map[10]; //vector에 먼저 노드의 연결정보 받아드리기 
int Q[100];
int front=-1;
int back=-1;
int ch[100]; //main에 정의시 옳바른 결과 나오지x 
int main() { 
// 69. 이진트리 넓이 우선탐색(BFS)
// 배열을 이용하여 큐 자료구조 나타내기 
	int n;
	printf("노드의 수를 입력하세요:");
	scanf("%d",&n); 
	int a;
 	int b;
 	for(int i =1; i<=n; i++){
		scanf("%d %d",&a,&b);
		map[a].push_back(b);
	 } 

	 Q[++back]=1; //시작점 부여 
	 ch[1]=1;  //연결 여부 확인
	 int x; 
	 while(front<back){
	 	x=Q[++front];
	 	printf("%d ",x); //빼기 
	 	for(int i=0; i<map[x].size(); i++){
	 		if(ch[map[x][i]]==0){
	 			ch[map[x][i]]=1;
	 			Q[++back]=map[x][i]; // 넣기  
			 }
		 }
	 } 
	return 0;
  
}
