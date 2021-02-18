#include <stdio.h>
using namespace std;
int n;
int a[10][10];
int ch[10];
int path[10];
int cnt=0;
int DFS(int s, int L){
	if(s==n){
		cnt++;
		for(int i=0; i<L; i++){
			printf("%d ",path[i]);
		}
		printf("\n");
	}
	else{
		for(int i =1; i<=n; i++){
			if(a[s][i]==1 && ch[i]==0){
				ch[i]=1;
				path[L]=i;
				DFS(i,L+1);
				ch[i]=0;
			}
		}
	}
	return cnt;
}
int main() { 
//64_1. 경로탐색(인접행렬) 
// 방향그래프가 주어지면 1번 정점에서 N번 정접까지 가는 모든 경로의 가지수를 출력하는 프로그램을 작성하세요.
// 주어진 경로를 모두 출력하시오. 
	printf("정점의 수를 입력하세요:");
	scanf("%d",&n); 
	int v;
	printf("간선의 수를 입력하세요:");
	scanf("%d",&v); 
	
	int i;
	int o;
	for(int k=1; k<=v; k++){
		scanf("%d %d",&i,&o);
		a[i][o]=1; 
	}
	ch[1]=1;
	path[0]=1; //경로의 처음은 무조건 1부터 시작 
	printf("1부터 %d까지의 최대 경로수는 %d이다. \n",n,DFS(1,1));
	return 0;
  
}
