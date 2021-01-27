#include <stdio.h>
#include <math.h> 
int main() { 
// 48. 각 행의 평균과 가장 가까운 값
/* 9X9 격자판에 쓰여진 81개의 자연수가 주어질 쨰, 각 행의 평균을 구하고 그 평균과 가장 가까운 값을 출력하는 프로그램을 작성하세요.
평균은 소수점 첫 쩨 자리에서 반올림합니다. 가까운 값이 두 개 이면 그 중 큰 값을 출력하세요.*/ 
	int a[9][9];
	for(int i =0; i<9; i++){
		int sum=0;
		for(int j=0; j<9 ; j++){
			scanf("%d",&a[i][j]);
			sum+=a[i][j];
		}
		int avg=round(sum/9.0);
		int min=100;
		int store=-100;
		for(int j=0; j<9;j++){
			if(abs(avg-a[i][j])<min){
				min=abs(avg-a[i][j]);
				store=a[i][j];
			}
			else if(abs(avg-a[i][j])==min){
				if(a[i][j]>store){
					 store=a[i][j];
				}
					min=abs(avg-a[i][j]);
			}
			
		}
		printf("평균:%d  평균에 가까운 값:%d\n",avg, store);
		
		
	}
		
	return 0;

}
