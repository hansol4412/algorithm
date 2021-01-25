#include <stdio.h> 
// 46. 멀티 태스킹
/*  멀티태스킹이 가능한 컴퓨터는 1번 작업부터 순서대로 1초씩 작업한다.
	작업 갯수 N개와 그에 따른 작업 시간을 입력한 후 M초 후 정전이 왔다. 복구 후 어떤 작업을 해야하는 지 출력하시오.
	더 이상 작업해야 할 작업이 없으면 -1을 출력하시오. */
	
int main() {  
	int n;
	printf("작업의 갯수를 입력하세요:");
		scanf("%d",&n);
		int a[n+1];
		int sum=0;
		for(int i=1; i<=n ; i++){
			scanf("%d",&a[i]);
			sum+=a[i];
		}
	printf("몇 초 후에 정전이 일어나는가?:");
		int m; 
		scanf("%d",&m);
	
	if(m>=sum){
		printf("-1\n");
		return 0;
	}
	
	//정전 나기 전 작업  
	int cnt = 0;
	int p = 0;
	
	while(true){
		p++;
		if(p>n)p=1; 
		if(a[p]==0)continue;
		a[p]--;
		
		cnt++;
		if(cnt==m)break;
	}
	
	// 정전 후 작업 찾기 
	while(true){
		p++;
		if(p>n)p=1;
		if(a[p]!=0){
			printf("%d \n",p);
			break;
		}
	} 
	
	
	
	
	
	
	

	return 0;

}
