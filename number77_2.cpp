#include <stdio.h>
#include <algorithm> 
#include <vector>
using namespace std;
int main() { 
// 77_2. ģ���ΰ�
	/* ������ �� �л��� N���̰�, ��� �л��� 1���� N���� ��ȣ�� �ο��Ǿ� �ִ�. 
	 * �������Դ� ���� �� ���� �л��� ģ�������� ��ȣ�� ǥ���� ���ڽ��� �־�����. 
	 * ���� (1,2) (2,3) (3,4)�� ���� ���� �־����� 1�� �л���2�� �л��� ģ���̰�, 2�� �л��� 3�� �л���
	 * ģ���̰�, 3�� �л��� 4���л��� ģ���̴�. �̴� ����Ǿ� 1�� �л��� 4�� �л��� ģ���� �� �� �ִ�
     * ģ�����谡 ������ YES, �ƴϸ� NO�� ����Ѵ�. */
	// �������� �Է� ���� 
	  
	  int n; 
	  printf("�л����� �Է��ϼ���: \n");
	  scanf("%d", &n);
	  int r; 
	  printf("�� ���� ģ������ �Է��ϼ���: \n");
	  scanf("%d", &r);
	  
	  vector<int> t1;
	  vector<int> t2;
	  int a;
	  int b;
	  t1.push_back(0);
		for(int i =1; i<=r; i++) {
			scanf("%d", &a);
			scanf("%d", &b);
			if(i==1){
				t2.push_back(a);
			}
			t1.push_back(a);
			t2.push_back(b);
			
		}
		
		//�������� �Է��� ģ�� ��ȣ �����ϱ�
		sort(t1.begin(), t1.end());
		sort(t2.begin(), t2.end());
		
		/*
		for(int i =0; i<=r; i++ ){
			printf("%d ",t1[i]);
		}
		printf("\n");
		for(int i =0; i<=r; i++ ){
			printf("%d ",t2[i]);
		}
		*/
		
		
		printf("ģ�� ���̸� �˰� ���� ��ȣ�� 2�� �Է��ϼ���: \n");
		int f1;
		scanf("%d", &f1);
		int f2;
		scanf("%d", &f2);
		
		int f3=0;
		int f4=0;
		
		//���ĵ� ģ���� �߿��� ã�� ���� ģ���� ��ȣ�� �迭 ��� �ִ��� �ε��� ã��
		for(int i =1; i<=r; i++) {
			if(t1[i]==f1) f3=i;
		}
		for(int i =1; i<=r; i++) {
			if(t2[i]==f2) f4=i;
		}
		
		/*
		printf("%d \n",f3);
		printf("%d \n",f4);
		*/
			for(int i=f3; i<f4; i++) {
				if(t1[i]!=t2[i-1]) {
					printf("NO \n");
					break;
				}
				if(i==f4-1) {
					printf("YES \n");
				}
			}
			
			
	   
	 
}
