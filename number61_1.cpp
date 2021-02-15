#include <stdio.h>
using namespace std;
int n; 
int m; 
int a[10];
int ch[10];
int cnt=0;
int DFS(int L, int sum){
	if(L>n){
		if(sum==m){
			for(int i=1; i<=n; i++){
				if(ch[i]==1){
					printf("+%d ",a[i]);
				}
				if(ch[i]==-1){
					printf("-%d",a[i]);
				}
			}
			printf(" = %d\n",sum);
			cnt++;
		}	
	}
	else{
	ch[L]=1;
	DFS(L+1,sum+a[L]);
	ch[L]=0;
	DFS(L+1,sum);
	ch[L]=-1;
	DFS(L+1, sum-a[L]);
	}
	if(cnt==0) return -1;
	else return cnt;
}

int main() { 
// 61-1. 특정 수 만들기 (DFS)
/* N개의 원소로 구성된 자연수 집합이 주어지면 집합의 원소와 "+", "-" 연산을 사용하여 특성 수인 M을 만드는
* 경우가 몇가지 있는지 출력하는 프로그램을 작성하세요.
각 원소는 연산에 한번만 사용됩니다. */
	printf("n개의 원소의 갯수를 입력하세요:");
	scanf("%d",&n);
	printf("만들고 싶은 숫자 m을 입력하세요:");
	scanf("%d", &m);
	for(int i=1; i<=n; i++){
		scanf("%d",&a[i]);	
	}
	printf("%d를 만들기 위한 숫자 조합의 경우의 수는 %d입니다.\n",m,DFS(1, 0));
	return 0;
  
}
