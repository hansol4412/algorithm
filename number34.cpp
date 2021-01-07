#include <stdio.h> 
// 34. 버블정렬
// N개의 숫자가 입력되면 오름차순으로 정렬하는 프로그램을 작성하시오..  

int main() {
	int n;
	printf("수를 입력하세요: ");
	scanf("%d",&n); 
	int a[n];
	for(int i=0; i<n; i++){
	scanf("%d",&a[i]);	
	}

	for(int i=0; i<n-1;i++){
		for(int j=0; j<n-i-1; j++){
			if(a[j]>a[j+1]){
				int temp = a[j];
				a[j] = a[j+1];
				a[j+1] = temp;
				
			}
		}
	} 
	
	for(int i=0; i<n; i++){
		printf("%d  ", a[i]);
	}
		
	
	 
	return 0;

}
