#include <stdio.h>
#include <vector>
#include <queue>
#include <algorithm> 
using namespace std;
int main() { 
//74. 최소히프  (우선순위 큐)
/* 최소히프는 완전이진트리로 구현된 자료구조, 부모 노드값이 왼쪽자식와 오른쪽 자식노드의
   값 보다 작게 트리를 구성. 루트노드의 값이 가장 작은 수가 위치한다.
   1) 자연수가 입력되면 최소히프에  입력한다.
   2) 숫자 0이 입력되면 최소 히프에서 최솟값을 꺼내 출력한다.
   3) -1이 입력되면 프로그램을 종료한다.   
*/ 

	priority_queue<int> pq;
	int n;
	while(1){
		scanf("%d",&n);
		if(n==-1){
			break;
		}
		if(n==0){
			if(pq.empty()){
				printf("-1\n");
				break;	
			}
			printf("최소히프:%d \n",-pq.top());
			pq.pop(); 
		}
		else{
			pq.push(-n);
		}
	} 
	
	return 0;
  
}
