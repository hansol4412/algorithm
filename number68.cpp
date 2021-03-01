#include <stdio.h>
#include <vector> 
#include <algorithm>
using namespace std;
int n;
vector<pair<int,int> > a[30];
int ch[30];
int cost=1000;
int DFS(int v,int sum){
	if(v==n){
		if(cost>sum)cost=sum;
	}
	else{
		for(int i =0; i<a[v].size(); i++){
			if(ch[a[v][i].first]==0){
				ch[a[v][i].first]=1;
				DFS(a[v][i].first,sum+a[v][i].second);
				ch[a[v][i].first]=0;
			}
		}
	}
	return cost;
}
int main() { 
// 68. 최소비용 (인접리스트)
// 가중치 방향 그래프가 주어지면 1번 정점에서 N번 정점까지 가는 최소비용을 출력하는 프로그램을 작성하시오.
	printf("정점의 수를 입력하세요:");
	scanf("%d",&n); 
	int m;
	printf("간선의 수를 입력하세요:");
	scanf("%d",&m); 
	int i;
	int o;
	int x;
	for(int k=1; k<=m; k++){
		scanf("%d %d %d",&i,&o, &x);
		a[i].push_back(make_pair(o,x));
	}
	ch[1]=1;
	printf("1부터 %d까지의 최대 경로수는 %d이다. \n",n,DFS(1,0));
	return 0;
  
}
