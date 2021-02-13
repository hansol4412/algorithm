#include <stdio.h>
using namespace std;
int n; 
int a[10];
int total;
int flag=0;
void DFS(int L, int sum){
	if(sum>(total/2)) return;
	if(flag==1) return;

	if(L>n){
		if(sum==(total-sum)){
			flag=1;
		}	
	}
	else{
		DFS(L+1, sum+a[L]);
		DFS(L+1, sum);
	}
}
int main() { 
// 60. 합이 같은 부분집합 (DFS) 
/* N개의 원소로 구성된 자연수 집합이 주어지면, 이 집합을 두 개의 부분집합으로 나누었을 때
   두 부분집합의 원소의 합이 서로 같은 경우가 존재하면 YES를 출력하고, 그렇지 않으면 NO을 출력하는 프로그램을 작성하시오.*/ 
	printf("원소의 갯수를 입력하세요:");
	scanf("%d",&n);
	total=0;
	for(int i=1; i<=n; i++){
		scanf("%d",&a[i]);
		total+= a[i];
	}
	DFS(1,0);
	if(flag==1) printf("YES \n");
	if(flag==0) printf("No \n");
	return 0;
 
}
