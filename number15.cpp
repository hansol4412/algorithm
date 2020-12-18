#include <stdio.h> 

// 15. 소수의 개수
// 자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하시오.

int main() {
	int n;
	scanf("%d",&n);
	int flag, cnt=0;
	
	for(int i=2; i<=n; i++){
		flag=1;
		for(int j =2; j*j<=i; j++){
			if(i%j==0){
				flag=0;
				break;
			}
		}
		if(flag==1)cnt++;
	}
	
	printf("%d",cnt);
	
	return 0;
}
