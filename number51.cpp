#include <stdio.h>
int a[700][700];
int dy[700][700];
int main() { 
//51. 영지 선택 (large)
/* 왕은 현수에게 땅을 하사하기로 했다. 전체 땅에는 오렌지 나무의 갯수가 적혀있는데 현수는 오렌지 나무를 좋아한다.
	따라서 하사 받을 땅의 가로와 세로가 정해지면 오렌지 나무가 최대가 되는 땅을 선택하여 오렌지 나무의 갯수를 출력하라.*/
	int tc, tr, hc, hr;
	printf("전체 토지의 세로:");
	scanf("%d",&tc);
	printf("전체 토지의 가로:");
	scanf("%d",&tr);
		
		for(int i =1; i<=tc; i++) { 
			for(int j =1; j<=tr; j++) {
			scanf("%d",&a[i][j]);
			dy[i][j]= dy[i-1][j]+dy[i][j-1]-dy[i-1][j-1]+ a[i][j];
			}
		} 
	
		printf("하사 받을 토지의 세로:");
		scanf("%d",&hc);
		printf("하사 받을 토지의 가로:");
		scanf("%d",&hr);
		
		int max=0;
		int sum =0;
		
		for(int i=hc; i<=tc; i++){
			for(int j=hr; j<=tr; j++){
				sum=dy[i][j]-dy[i-hc][j]-dy[i][j-hr]+dy[i-hc][j-hr];
				if(sum>max)max=sum;
			}
		}
		
		printf("하사 받은 땅의 오렌지 갯수는? %d \n",max );
	return 0;

}
