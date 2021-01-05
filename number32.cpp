#include <stdio.h> 
// 32. 선택정렬
// N개의 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.
// 가장 작은 수를 찾아 앞에서 부터 정렬한다. 

int main() {
	int n;
	printf("입력할 수의 갯수를 입력하세요: ");
	scanf("%d",&n);
	int a[n];
	for(int i=0; i<n; i++){
	scanf("%d",&a[i]);	
	}
	int idx;
	for(int i=0; i<n; i++){
		idx =i;
		for(int j=i+1; j<n; j++){
			if(a[idx]>a[j]) idx= j;	
		}
		int temp = a[i];
		a[i]=a[idx];
		a[idx]=temp;
	}
	
	for(int i=0; i<n; i++){
		printf("%d ",a[i]);
	}
		
	
	 
	return 0;

}
