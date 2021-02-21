#include <stdio.h>
using namespace std;
int n;
int a[10][10];
int ch[20];
int min=10000;
int DFS(int s, int sum){
	if(s==n){
		if(min>sum)min=sum;
	}
	else{
		for(int i =1; i<=n; i++){
			if(a[s][i]>0 && ch[i]==0){
				ch[i]=1;
				DFS(i,sum+a[s][i]);
				ch[i]=0;
			}
		}
	}
	return min;
}
int main() { 
// 67. 최소비용 (인접행렬)
// 가중치 방향 그래프가 주어지면 1번 정점에서 N번 정점까지 가는 최소비용을 출력하는 프로그램을 작성하시오.

	printf("정점의 수를 입력하세요:");
	scanf("%d",&n); 
	int v;
	printf("간선의 수를 입력하세요:");
	scanf("%d",&v); 
	
	
	int i;
	int o;
	int x;
	for(int k=1; k<=v; k++){
		scanf("%d %d %d",&i,&o,&x);
		a[i][o]=x; 
	}
	ch[1]=1;
	printf("1부터 %d까지의 최소경로의 값은 %d이다 \n", n, DFS(1,0));
	return 0;
  
}
