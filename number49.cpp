#include <stdio.h>
int main() { 
// 49. 블록의 최댓값
// 블록을 정면에서 본 단면과 오른쪽 측면에서 본 단면을 주고 최대 블록갯수을 출력하는 프로그램을 작성하시오. 
	int n;
	printf("N*N의 지역에서 N의 값을 입력하세요.");
	scanf("%d", &n);
	int a[2][n];
	int b[n][n];
	
	printf("정면의 블록:");
	for(int i=0; i<n; i++){
		scanf("%d",&a[0][i]); 
	}
	printf("오른쪽 측면의  블록:");
	for(int i=0; i<n; i++){
		scanf("%d",&a[1][i]); 
	}
	
	for(int i=0; i<n; i++){
		int temp = a[0][i];
		for(int j=0; j<n; j++){
			b[j][i]= temp;
		}
	}
	
	for(int i=0; i<n; i++){
		int temp2 = a[1][i];
		for(int j=0; j<n; j++){
			if(b[n-i-1][j]>temp2){
				b[n-i-1][j]=temp2;	
			}
		}
	}
	
	for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				printf("%d ",b[i][j]);
			}
			printf("\n");
		}
		
	int sum=0;
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				sum+=b[i][j];
			}
				
		}
	
	printf("블록의 최대 갯수는 %d 이다 \n",sum);
		
	return 0;

}
