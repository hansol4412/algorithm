#include <stdio.h> 
// 36. 삽입정렬
// N개의 숫자가 입력되면 오름차순으로 정렬하는 프로그램을 작성하시오.
int main() {
	int n;
	printf("수를 입력하세요: ");
	scanf("%d",&n); 
	int a[n];
	for(int i=0; i<n; i++){
	scanf("%d",&a[i]);	
	}

	for(int i=1;i<n;i++){
		int temp = a[i];
		int j;
		for(j=i-1;j>=0; j--){
			if(a[j]>temp)a[j+1]=a[j];
			else break;
		}
		a[j+1]=temp;
		
	} 
	
	for(int i=0; i<n; i++){
		printf("%d  ", a[i]);
	}
		
	
	 
	return 0;

}
