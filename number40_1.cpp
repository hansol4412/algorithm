#include <stdio.h> 
#include <vector>
#include <algorithm>
using namespace std;
// 40_1. 교집합 (투포인트 알고리즘)
// 두 집합 A, B가 주어지면  두 집합의 교집합을 출력하는 프로그램을 작성하세요.
//교집합은 오름차순으로 정렬하시오. 
// 정렬 후 교집합 구하기 
int main() {
	int n;
	printf("첫번째 배열의 크기를 입력하세요.: ");
	scanf("%d",&n); 
	vector<int> a(n);
	for(int i=0; i<n; i++){
		scanf("%d",&a[i]);	
	}
	sort(a.begin(), a.end());
	 
	int m;
	printf("두번째 배열의 크기를 입력하세요.: ");
	scanf("%d",&m); 
	vector<int> b(m);
	for(int i=0; i<m; i++){
		scanf("%d",&b[i]);	
	}
	sort(b.begin(), b.end());
	
	vector<int> c(n<m?n:m);
	int p1=0, p2=0, p3=0;

		while(p1<n && p2<m){
			if(a[p1]==b[p2]){
				c[p3++]=a[p1++];
				p2++;
			}
			else if(a[p1]<b[p2]){
				p1++;
			}
			else{
				p2++;
			}
		}
	
	for(int i=0; i<p3; i++){
		printf("%d  ", c[i]);
	}
	
	
	 
	return 0;

}
