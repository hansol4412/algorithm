#include <stdio.h> 
#include <vector>
#include <algorithm>
using namespace std;
// 42. 이분검색
/* 임의의 N개의 숫자가 압력으로 주어지고, N개의 수를 오름차순으로 정렬한 다음 N개의 수 중
한 개의 수인 key가 주어지면 이분검색으로 key가 정렬된 상태에서 몇번째 있는지 구하는 프로그램을 작성하시오 */
int main() {   
	printf("배열의 크기를 입력하세요.:");
		int n;
		scanf("%d",&n);
	printf("찾으려는 key를 입력하세요.:");
		int key;
		scanf("%d",&key);
	vector<int> a;
	int tmp;
		for(int i=0; i<n; i++) {
			scanf("%d",&tmp);
			a.push_back(tmp);
		}
	sort(a.begin(),a.end());
	
	int left=0;
	int right=n-1;
	while(left<=right){
		int mid = (left+right)/2;
		if(key==a[mid]){
			printf("찾는 값은 a[%d]에 있습니다. \n",mid);
			break;
		}
		else if(key>a[mid]) left=mid+1;
		else right=mid-1;
		
	} 
	
	
	 
	return 0;

}
