#include <stdio.h> 
//26. 마라톤
/*마라톤을 할 때 각 선수 입장에서 자기보다 앞에 달리고 있는 선수 등 중 평소 실력이 자기보다 좋은 선수를
남은 거리동안 앞지르는 것은 불가능 하다. 반대로, 평소 자기보다 좋지 않은 실력을 가진 선수는 남은 거리
동안 앞지르는 것이 가능하다. 이런 가정하에 각 선수는 자신이 앞으로 얻을 수 있는 최선의 등수를 알 수 있다 */
// 선수의 평소 실력은 같을 수 있고, 실력이 같으면 앞에 달리는 선수를 앞지를 수 없다.

int main() {
	int n;
	scanf("%d",&n);
	int a[n];
	int b[n];
	
	for(int i =0; i<n; i++) {
		scanf("%d",&a[i]);
		b[i]=1;
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<i; j++) {
				if(a[i]<a[j]) b[i]++; 
			}
		}
		
		for(int i=0; i<n; i++) {
			printf("%d ",b[i]);
		}
	
	
	
	
	return 0;
}
