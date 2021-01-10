#include <stdio.h> 
// 37. Least Recently Used (카카오 캐시 변형 문제)
// 캐시메모리는 LRU 알고리즘 즉, 가장 오랫동안 사용하지 않는 것을 제거하는 알고리즘을 사용한다. 
// Cache Miss : 해야할 작업이 캐시에 없는 상태로 모든 작업이 뒤로 밀리고 새로운 작업이 앞에 추가 된다.
// Cache Hit : 해야할 작업이 캐시에 있는 상태로 사용해야 하는 작업 앞에 있는 작업은 뒤로 밀리고 사용하는 작업이 맨 앞으로 온다
// 캐시 크기와 작업수를 입력하고 캐시메모리의 작업 과정을 출력하시오..  
int m[20];
int main() {
	int memory;
	scanf("%d",&memory);
	int work;
	scanf("%d",&work);
	int w[work];
	for(int i=0; i<work; i++){
		scanf("%d",&w[i]);
	}	
	
	for(int i=0; i<work; i++){
		int pos=-1;
		for(int j=0; j<=memory; j++){
			if(w[i]==m[j]) pos =j;
		}
		if(pos==-1){
			for(int t=memory-1; t>=1; t--){
				m[t]=m[t-1];	
			}	
			m[0]= w[i];
		}
		else{
			for(int t=pos; t>=1; t--){
				m[t]= m[t-1];
			
			}
				m[0]=w[i];
			
		}
		
		for(int i=0; i<memory; i++){
			printf("%d ",m[i]);
		}
		printf("\n");
	}
	
	
	 
	return 0;

}
