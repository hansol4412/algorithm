 #include <stdio.h>
using namespace std; 

int dy[20][20]; 
int C(int n, int r){
	
	if(dy[n][r]>0) return dy[n][r]; // ������ �������� �ʰ� �ߺ��Ǵ� ���� ������ �� �� ���. 
	
	if(n==r || r==0) return 1;
	else return dy[n][r] = C(n-1, r) + C(n-1,r-1);
	
}
int main() { 
	//76_3. ���װ��
	/*���װ���� N���� ���Ҹ� ������ ���տ��� R���� ���Ҹ� �̾� �κ������� ����� ����� ��
	  ������ nCr�� ǥ���Ѵ�. */
	// �޸����̼� ��� 
	  
	  int n; 
	  printf("n�� �Է��Ͻÿ�: \n");
	  scanf("%d", &n);
	  int r; 
	  printf("r�� �Է��Ͻÿ�: \n");
	  scanf("%d", &r);
	  printf("%dC%d = %d\n",n,r,C(n,r));
	  
	   
	 
}
