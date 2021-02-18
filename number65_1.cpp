#include <stdio.h>
using namespace std;
int n; 
int a[10][10];
int ch[10][10];
int dx[4]= {-1, 0, 1, 0};
int dy[4]= {0, -1, 0, 1};
int pathX[100];
int pathY[100];
int cnt=0;

int DFS(int x, int y ,int L){
	if(x==n&&y==n){
		cnt++;
		for(int i=0; i<L-1;i++){
			printf("(%d, %d) -> ",pathX[i],pathY[i]);
		}
		printf("(7,7)\n");
	}
	else{
		for(int i=0; i<4; i++){
			int xx = x+1*dx[i];
			int yy = y+1*dy[i];
			if(xx<1||xx>n||yy<1||yy>n){
				continue;
			}
			if(a[xx][yy]==0 && ch[xx][yy]==0){
				ch[xx][yy]=1;
				pathX[L]=xx;
				pathY[L]=yy;
				DFS(xx,yy,L+1);
				ch[xx][yy]=0;
			}
		}	
	}
	return cnt;
}
int main() { 
//65_1.미로탐색
/* 자연수 n이 주어지면 n*n  격자판 미로를 탈출하는 경로의 가지수를 출력하는 프로그램을 작성하세요.
   출팔점은 (1,1) 좌표이고 탈출 도착점은 (n,n)이다.
   격자판의 1은 벽이고, 0은 통로이다. 격자판의 움직임은 상하좌우로만 움직인다.*/ 
// 각각의 경로를 출력하여라. 
	printf("n을 입력하시오:") ;
	scanf("%d",&n);
	for(int i=1; i<=n; i++){
		for(int j=1; j<=n; j++){
			scanf("%d",&a[i][j]);
		}
	}
	ch[1][1]=1;
	pathX[0]=1;
	pathY[0]=1;
	printf("미로탈출 경로수는 총 %d가지이다 \n",DFS(1,1,1));
	return 0;
  
}
