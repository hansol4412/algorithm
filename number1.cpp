#include <iostream>

// 1부터 N까지의 M의 배수합
// 자연수 N이 입력되면 1부터 N까지의 배수합을 출력하는 프로그램을 작성하시오. 
 
using namespace std;
int main() {
	int n;
	int m;
	int sum=0;
	std::cin>>n>>m;
	for(int i=1; i<=n; i++)
	{
		if(i%m==0){
			sum += i;
		} 
			
	}
	std::cout<<sum;
	
	return 0;
}
