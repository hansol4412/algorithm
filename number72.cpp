#include <stdio.h>
#include <vector>
#include <queue>
#include <algorithm> 
using namespace std;
int main() { 
// 72. 공주 구하기(큐 자료구조로 해결) 
/* N명의 왕자가 시계 방향으로 동그랗게 앉고 1번 왕자부터 1부터 시작하먀 번호를 외친다.
한 왕자가 특정 숫자 M을 외치면 그 왕자는 공주를 구하러 가는데서 제외된다. 마지막까지 살아 남은 왕자의 번호를 출력하라 */
	int n;
	printf("왕자 수를 입력하시오:");
	scanf("%d",&n); 
	int m;
	printf("특정 수를 입력하시오.:");
	scanf("%d",&m);
	queue<int> Q;
	for(int i=1; i<=n; i++){
		Q.push(i);
	} 
	while(!Q.empty()){
		for(int i=1; i<m; i++){
			Q.push(Q.front());
			Q.pop();
		}
		Q.pop();
		if(Q.size()==1){
			printf("마지막으로 남은 왕자는 %d이다\n", Q.front());
			break;
		}
	}
	
	return 0;
  
}
