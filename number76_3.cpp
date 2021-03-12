 #include <stdio.h>
using namespace std; 

int dy[20][20]; 
int C(int n, int r){
	
	if(dy[n][r]>0) return dy[n][r]; // 끝까지 내려가지 않고 중복되는 값이 있으면 그 값 사용. 
	
	if(n==r || r==0) return 1;
	else return dy[n][r] = C(n-1, r) + C(n-1,r-1);
	
}
int main() { 
	//76_3. 이항계수
	/*이항계수는 N계의 원소를 가지는 집합에서 R개의 원소를 뽑아 부분집합을 만드는 경우의 수
	  공식은 nCr로 표현한다. */
	// 메모리제이션 사용 
	  
	  int n; 
	  printf("n을 입력하시오: \n");
	  scanf("%d", &n);
	  int r; 
	  printf("r을 입력하시오: \n");
	  scanf("%d", &r);
	  printf("%dC%d = %d\n",n,r,C(n,r));
	  
	   
	 
}
