#include <stdio.h> 
#include <algorithm>
using namespace std;
// 44. 마구간 정하기 (이분검색 응용)
/* N개의 마구간과 M마리의 말이 있습니다. 마구간 마다 한마리의 말을 넣어 배치했을 때 가장 가까운 두 말의 거리가
	최대가 되는 값을 출력하시오*/
int n;
int count(int mid,int a[]){
	int cnt =1;
	int pos =a[0];
	for(int i=1; i<n; i++){
		if(a[i]-pos>=mid){
			cnt++;
			pos=a[i];
		}
	}
	return cnt;
}
	
	
int main() {   
	int result=0;
	printf("마구간의 갯수를 입력하세요 :");
		scanf("%d",&n);
		int a[n];
	printf("말의 갯수를 입력하세요 :");
		int m; 
		scanf("%d",&m);
	for(int i=0; i<n; i++){
		scanf("%d", &a[i]);
	}
	sort(a,a+n);
	
	int left=0; 
	int right =a[n-1];
	while(left<=right){
		int mid = (left+right)/2;
		if(count(mid,a)>=m ){
			left=mid+1;
			result=mid;
		}
		else{
		right=mid-1;
		}
	}
	
	 
	 printf("%d \n",result);
	return 0;

}
