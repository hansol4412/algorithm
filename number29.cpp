#include <stdio.h> 
//29. 3의 개수 (small)
//자연수 n이 입력되면 1부터 n까지 자연수를 종이에 적을 때 각 숫자 중 3의 개수는?
//ex) n이 15이면 3과 13이 포함되어 2이다.

int main() {

	int n;
	scanf("%d",&n);
	int cnt=0;
		
		for(int i=1; i<=n; i++) { 
			int tmp=i;
			// for(int j=i;j>0;j=j/10) ->while문 대신 사용
			while(tmp>0) {
				if(tmp%10==3)cnt++;
				tmp=tmp/10;
			}
		}
		
		printf("%d\n",cnt);
	return 0;

}
