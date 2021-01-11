#include <stdio.h> 
// 38. Inversion Sequence
/* 1부터 N까지 수를 한 번씩만 사용하여 이루어진 수열이 있을 때, 1부터 N까지 각각의 수 앞에 놓여 있는 수 중에서
	자신보다 큰 수 들의 개수를 수열로 표현하는 것을 inversion sequence라고 한다. */
//ex) 4 8 6 2 5 1 3 7 -> 5 3 4 0 2 1 1 0 
int c[20];
int main() {
	int n;
	printf("수를 입력하세요: ");
	scanf("%d",&n); 
	int a[n];
	int b[n];
	for(int i=0; i<n; i++){
		scanf("%d",&a[i]);	
		b[i]=a[i];
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

	for(int i=0;i<n;i++){
		for(int j=0; b[j]!=a[i];j++){
			if(b[j]>a[i]) c[i]++;
		}
	}
	
	
	
	for(int i=0; i<n; i++){
		printf("%d  ", c[i]);
	}
	
	
	 
	return 0;

}
