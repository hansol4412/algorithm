#include <stdio.h> 
// 23. 연속 부분 증가수열
//n개의 숫자가 나열된 수열이 주어집니다. 이 수열 중 연속적으로 증가하는 부분 수열 최대 길이를 구해 출력하시오.
// 값이 같을 때는 증가하는 것으로 생각한다..

int main() {
	int n;
	scanf("%d",&n);
		int a[n];
		for(int i =0; i<n; i++) {
			scanf("%d",&a[i]);
		}
			int cnt=0;
		int max=0;
		int cmax=0;
		for(int i =0; i<n; i++) {
			if(a[i]>=max) {
				max=a[i];
				cnt++;
				if(cmax<cnt) cmax=cnt;
				
			}
			else {
				max=a[i];
				cnt =1;
			}
		}
		
		printf("%d \n",cmax);
		
	
	return 0;
}
