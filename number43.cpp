#include <stdio.h> 
#include <algorithm>
using namespace std;
// 43. 뮤직비디오 (이분검색 응용)
/* 음반에 N개의 곡이 들어가는 데 순서가 그대로 유지된 채로 DVD에 녹화하려고 한다. 
	제작상의 이유로 M개의 DVD를 사용해서 음반을 제작하려한다. 중간에 곡이 짤려서 2개에 DVD로 나눠서 녹음되면 안된다.
	이때 한개의 DVD의 최소 크기 (최소 시간)을 출력하시오.		 */
int n;
int a[100];
int count(int mid){
	int sum=0;
	int cnt=1;
	for(int i =0; i<n; i++){
		if(sum+a[i]>mid){
			cnt++;
			sum=a[i];
		}
		else{
			sum+=a[i];
		}
	}
	return cnt;
}
	
	
int main() {   
	int result=0;
	printf("노래의 갯수를 입력하세요 :");
		scanf("%d",&n);
	printf("DVD의 갯수를 입력하세요:");
		int m; 
		scanf("%d",&m);
	int sum=0;
	int max=0;
	for(int i=0; i<n; i++){
		scanf("%d", &a[i]);
		sum+=a[i];
		if(max<a[i])max=a[i];
	}
	
	int left=1; 
	int right =sum;
	while(left<=right){
		int mid = (left+right)/2;
		if(mid>=max && count(mid)<=m ){
			right= mid-1;
			result=mid;
		}
		else{
			left= mid+1;
		}
	}
	
	 
	 printf("%d \n",result);
	return 0;

}
