#include <stdio.h>
using namespace std;
int n;
int a[10][10];
int main() { 
// 63_2. 인접행렬 (가중치그래프)

	printf("정점의 수를 입력하세요:");
	scanf("%d",&n); 
	int v;
	printf("간선의 수를 입력하세요:");
	scanf("%d",&v); 
	
	
	int i;
	int o;
	int c; 
	for(int k=1; k<=v; k++){
		scanf("%d %d %d",&i,&o,&c);
		a[i][o]=c;
	}
	
	for(int k=1; k<=n; k++){
		for(int j =1; j<=n; j++){
			printf("%d ",a[k][j]);
		}
		printf("\n");
	}
	return 0;
  
}
