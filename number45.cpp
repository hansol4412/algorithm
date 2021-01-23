#include <stdio.h> 
#include <algorithm>
using namespace std;
// 45. 공주 구하기
/* N명의 왕자가 시계 방향으로 동그랗게 앉고 1번 왕자부터 1부터 시작하먀 번호를 외친다.
	한 왕자가 특정 숫자 M을 외치면 그 왕자는 공주를 구하러 가는데서 제외된다. 마지막까지 살아 남은 왕자의 번호를 출력하라 */
	
int main() {  
	int n;
	printf("왕자 수를 입력하시오:");
		scanf("%d",&n);
		int a[n+1];
		for(int i=1; i<=n ; i++){
			a[i]=0;
		}
	printf("특정 수를 입력하시오:");
		int m; 
		scanf("%d",&m);
	
	int point=1;
	int cnt=0;
	int last=0;
	
	while(1){
		if(a[point]==0){
			cnt++;
			if(cnt==m){
				a[point]=1;
				cnt=0;
				last++;
			}
		}
		point++;
		if(point>n)point=1;
		if(last==n-1){
			break;
		}
	}
	
	for(int i=1; i<=n; i++){
		if(a[i]==0){
			printf("%d",i);
		}
	}

	return 0;

}
