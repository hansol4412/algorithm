#include <stdio.h>
#include <vector>
#include <queue>
#include <algorithm> 
using namespace std;
int dis[100];
int ch[100];
int main() { 
// 70. 그래프의 최단거리 (BFS) 
// 그래프에서 1번 정점에서 각 정점으로 가는 최소 이동 간선수를 구하여라. 
	int n;
	printf("노드의 수를 입력하세요:");
	scanf("%d",&n); 
	int m;
	printf("간선의 수를 입력하세요:");
	scanf("%d",&m);
	int a;
 	int b;
 	vector<int> map[10];
 	for(int i =1; i<=m; i++){
		scanf("%d %d",&a,&b);
		map[a].push_back(b);
	 } 
	queue<int> Q; 
	 ch[1]=1; 
	 Q.push(1); 
	 int x; 
	 while(!Q.empty()){
	 	x=Q.front();
	 	Q.pop();
	 	for(int i=0; i<map[x].size(); i++){
	 		if(ch[map[x][i]]==0){
	 			ch[map[x][i]]=1;
	 			Q.push(map[x][i]);
				 dis[map[x][i]]=dis[x]+1;   
			 }
		 }
	 } 
	 for(int i=2; i<=n; i++){
		 	printf("%d : %d\n",i, dis[i]);
		 }
	return 0;
  
}
