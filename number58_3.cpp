#include <stdio.h>
using namespace std;
int DFS(int n,int x){
	if(x>n){
		return 0;
	}
	else{
		DFS(n,2*x);
		DFS(n,2*x+1);
		printf("%d",x);
	}
}
int main() { 
// 58_3. 이진트리 깊이우선트리(DFS)
// 후위순회 출력.
	int n;
	printf("노드의 갯수를 입력하세요:");
	scanf("%d",&n);
	DFS(n,1);
	return 0;
 
}
