#include <stdio.h>
#include <stack>
using namespace std;
int main() { 
//55. 기차 운행 (stack사용)
/* A도시에서 출발한 기차는 교차로에 들려 순서를 조정한 후 B도시로 도착한다.  
	기차별로 번호가 부여되는데  P(push)작업과 O(out)작업을 통해 순서대로 B도시에 도착하도록 작성하여라
	번호 순서대로 도착이 불가능한 작업은 Impossible이라고 출력한다. */
	int n;
	printf("기차의 갯수를 입력하시오:");
	scanf("%d",&n);
	int a[n+1];
	printf("기차의 번호를 입력하세요:");
	for(int i=1; i<=n; i++){
		scanf("%d",&a[i]);
	}
	int j=1;
	stack<int> stk;
	for(int i=1; i<=n; i++){
		stk.push(a[i]);
		printf("P");
		while(true){
			if(stk.empty()){
				break;
			}
			if(j==stk.top()){
				stk.pop();
				printf("O");
				j++;
			}
			else{
				break;
			}
		}
	}
	if(!stk.empty()){
		printf("\nimpossible \n");
	}
	return 0;

}
