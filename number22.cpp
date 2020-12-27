#include <stdio.h> 
// 22. 온도의 최대값
// N일의 온도를 측정해서 연속적인 K일의 합을 구해 최대 합의 값을 출력하시오
// n=10, k=2 : 10일의 온도를 측정해서 연속적인 2일의 합을 구해 합이 가장 큰 것을 출력하시오.

int main() {
	int n; int k;
	scanf("%d %d",&n,&k);
		int a[n];
		for(int i =0; i<n; i++) {
			scanf("%d",&a[i]);
		}
		
		int max=-100;
		for(int i =0 ; i<=n-k; i++) {
			int sum=0;
			for(int j=i; j<i+k; j++) {
				sum+=a[j];
				
			}
			if(sum>max) max = sum;
		}
		printf("온도의 최대 값은:%d \n",max);
		
	
	return 0;
}
