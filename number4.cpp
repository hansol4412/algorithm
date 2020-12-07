#include <iostream>
using namespace std; 

// 나이 차이  
/*  N명의 나이가 입력됩니다.이 N명의 사람 중 가장 나이차이가 많이 나는 경우는 몇살인지
 	최대 나이 차이를 출력하는 프로그램을 작성하시오.*/ 
 
int main() {
	//freopen("input.txt","rt",stdin);
	int n;
	int max=0;
	int min = 100;
	int age;
	cin>>n;
	for(int i =1; i<=n;i++){
		cin>>age;
		if(age>max)max= age;
		if(age<min)min= age;
	}
	cout<<max-min;
	
	return 0;
}
