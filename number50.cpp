#include <stdio.h>
int main() { 
//50. 영지 선택
/* 왕은 현수에게 땅을 하사하기로 했다. 전체 땅에는 오렌지 나무의 갯수가 적혀있는데 현수는 오렌지 나무를 좋아한다.
	따라서 하사 받을 땅의 가로와 세로가 정해지면 오렌지 나무가 최대가 되는 땅을 선택하여 오렌지 나무의 갯수를 출력하라.*/
	int tc, tr, hc, hr;
	printf("전체 토지의 세로:");
	scanf("%d",&tc);
	printf("전체 토지의 가로:");
	scanf("%d",&tr);
		int a[tc][tr];
		for(int i =0; i<tc; i++) { 
			for(int j =0; j<tr; j++) {
			scanf("%d",&a[i][j]);
			}
		} 
		
		printf("하사 받을 토지의 세로:");
		scanf("%d",&hc);
		printf("하사 받을 토지의 가로:");
		scanf("%d",&hr);
		
		int max=0;
		int sum;
		
		for(int i=0; i<=tc-hc; i++){
			for(int j=0; j<=tr-hr; j++){
				sum=0;
				for(int c=i; c<i+hc; c++){
					for(int r= j; r<j+hr; r++){
						sum+=a[c][r];
					}
				}
				if(sum>max)max=sum;
			}
		}
		
		printf("하사 받은 땅의 오렌지 갯수는? %d \n",max );
	return 0;

}
