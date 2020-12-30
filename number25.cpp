#include <stdio.h> 
//25. 석차 구하기
		// N명의 학생의 수학 점수가 입력되면 각 학생의 석차를 출력하는 프로그램을 작성하시오
int b[100]; 
int main() {
	int n;
	scanf("%d",&n);
	int a[n];
	int b[n];
	
	for(int i =0; i<n; i++) {
		scanf("%d",&a[i]);
		b[i]=1;
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(a[i]<a[j]) b[i]++; 
			}
		}
		
		for(int i=0; i<n; i++) {
			printf("%d ",b[i]);
		}
	
	
	
	
	return 0;
}
