#include <stdio.h> 
// 35. Special Sort(구글)
// N개의 정수가 입력되면 양의 정수와 음의 정수가 섞인 숫자들을 음의 정수는 왼쪽으로 양의 정수는 오른족으로 나눠라
//입력된 음과 양의 정수의 순서에는 변함이 없어야 한다..  

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
			if(a[j]>0&&a[j+1]<0){
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
