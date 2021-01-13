#include <stdio.h> 
// 39. 배열합치기
// 오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출려하는 프로그램을 작성하세요.
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

	int p1=0, p2=0, p3=0;
	while(p1<=n-1 && p2<=m-1){
		if(a[p1]<b[p2])c[p3++]=a[p1++];
		else c[p3++]=b[p2++];
	}
	while(p1<=n-1)c[p3++]=a[p1++];
	while(p2<=m-1)c[p3++]=b[p2++];
	
	for(int i=0; i<n+m; i++){
		printf("%d  ", c[i]);
	}
	
	
	 
	return 0;

}
