#include <stdio.h> 
// 40. 교집합 (투포인트 알고리즘)
// 두 집합 A, B가 주어지면  두 집합의 교집합을 출력하는 프로그램을 작성하세요.
//교집합은 오름차순으로 정렬하시오.
// 교집합 구한 후 정렬하기 
int c[20];
int main() {
	int n;
	printf("첫번째 배열의 크기를 입력하세요.: ");
	scanf("%d",&n); 
	int a[n];
	for(int i=0; i<n; i++){
		scanf("%d",&a[i]);	
	}
	 
	int m;
	printf("두번째 배열의 크기를 입력하세요.: ");
	scanf("%d",&m); 
	int b[m];
	for(int i=0; i<m; i++){
		scanf("%d",&b[i]);	
	}
	
	int p3=0;

		for(int i=0; i<n; i++) {
			for(int j =0; j<m; j++) {
				if(a[i]==b[j]) {
					c[p3]=a[i];
					p3++;
				}
			}
		}
		
		for(int i=0; i<p3-1; i++) {
			int idx=i;
			for(int j =i+1; j<p3; j++ ) {
				if(c[j]<c[idx]) idx=j;
			}
			int temp = c[i];
			c[i]=c[idx];
			c[idx]=temp;
		}
	
	for(int i=0; i<p3; i++){
		printf("%d  ", c[i]);
	}
	
	
	 
	return 0;

}
