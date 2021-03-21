#include <stdio.h>
#include <algorithm> 
using namespace std;
int unf[100];

int Find(int v){
	if(unf[v]==v) return v;
	else return unf[v]=Find(unf[v]); //�޸�������̼� 
} 

void Union(int a, int b){
	
	a=Find(a);
	b=Find(b);
	if(a !=b) {
		unf[a]=b;
	} 
}


int main() { 
// 77_3. ģ���ΰ�
	/* ������ �� �л��� N���̰�, ��� �л��� 1���� N���� ��ȣ�� �ο��Ǿ� �ִ�. 
	 * �������Դ� ���� �� ���� �л��� ģ�������� ��ȣ�� ǥ���� ���ڽ��� �־�����. 
	 * ���� (1,2) (2,3) (3,4)�� ���� ���� �־����� 1�� �л���2�� �л��� ģ���̰�, 2�� �л��� 3�� �л���
	 * ģ���̰�, 3�� �л��� 4���л��� ģ���̴�. �̴� ����Ǿ� 1�� �л��� 4�� �л��� ģ���� �� �� �ִ�
     * ģ�����谡 ������ YES, �ƴϸ� NO�� ����Ѵ�. */
	// Union&Find �ڷᱸ�� 
	  
	  int n; 
	  printf("�л����� �Է��ϼ���: \n");
	  scanf("%d", &n);
	  int r; 
	  printf("�� ���� ģ������ �Է��ϼ���: \n");
	  scanf("%d", &r);
	  int a;
	  int b;
	  
	  for(int i=1; i<=n; i++){
	  	unf[i]=i;
	  }
	  
	  for(int i=1; i<=r; i++){
	  	scanf("%d %d", &a, &b);
	  	Union(a,b);
	  }
	  
		printf("ģ�� ���̸� �˰� ���� ��ȣ�� 2�� �Է��ϼ���: \n");
		int fa;
		int fb;
		scanf("%d %d", &fa, &fb);
		fa= Find(fa);
		fb= Find(fb);
		
		if(fa != fb){
			printf("NO \n");
		}
		else{
			printf("YES \n");
		}
		
		return 0;
			 
}
