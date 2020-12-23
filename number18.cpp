#include <stdio.h> 
// 18. 층간소음
/*아파트의 한 세대의 측정치가 m값을 넘으면 세대 호수와 작은 경보음이 관리실 모니터에 울린다
한 세대의 n초 동안의 실시간 측정치가 주어지면 최대 연속으로 경보음이 울린 시간을 구하이소.
경보음이 없으면 -1이 출력된다.*/

int main() {
		int n, m, num;
		int cnt=0;
		int max=0;
		scanf("%d %d", &n, &m);
		for(int i=1; i<=n; i++){
			scanf("%d",&num);
			if(num>m){
				cnt++;
				if(cnt>max)max=cnt;
			}
			else{
				cnt=0;
			}
		}
		printf("%d \n",max);
	
	return 0;
}
