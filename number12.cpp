#include <stdio.h> 

// 11. 숫자의 총 갯수(large)
// 자연수 N이 입력되면 1부터 N까지의 자연수를 종이에 적을 때 각 숫자는 몇개가 쓰이는지 프로그램을 작성하시오.
// 예를 들어 1부터 15까지는 1,2,3,4,5,6,7,8,9,1,0,1,1,1,2,1,3,1,4,1,5인 21개의 숫자가 쓰였다.

int main() {
	printf("수를 입력하시오:");
	int n;
	scanf("%d",&n);
	int sum=0;
	int digit=9;
	int res=0;
	int cnt=1;
	while(sum+digit<n){
		sum=sum+digit;
		res=res+(digit*cnt);
		cnt++;
		digit=digit*10;
	}
	res= res+(n-sum)*cnt;
	printf("사용된 숫자의 총 갯수는 %d 개 입니다.\n",res);
	
	
	return 0;
}
