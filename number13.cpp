#include <stdio.h> 

// 13. 가장 많이 사용된 자릿수
// N자리의 자연수가 입력되면 자연수의 자릿수 중 가장 많이 사용된 숫자를 출력하는 프로그램을 작성하시오.
// 답이 여러 개일 경우 그 중에서 가장 큰 수를 출력하시오. 
int n[10];
int main() {
	
	char a[100];
	printf("숫자를 입력하시오:");
	
	scanf("%s",&a);
		
		
		for (int i = 0; a[i]!='\0'; i++) {
			int num = a[i]-48;
		    n[num]++;
		}
		
		
		int max = 0;
		int numMax = 0;
		for(int j= 0; j<=9; j++ )
		{
			if(n[j]>max) {
				max=n[j];
				numMax=j;
			}
			else if(n[j]==max) {
				if(numMax<j) numMax=j;
			}
		}
		
		printf("가장 많이 사용한 수는 %d입니다.\n",numMax);
	
	
	return 0;
}
