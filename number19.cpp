#include <stdio.h> 
// 19. �г� ������
/* �л����� ��ȭ�� �� �� ���� ���ڸ��� ���� Űī ū �л��� ������ �� �л����� ���� �л��� ��ũ���� ������ �ʽ��ϴ�
�� �ٿ� ���� Ű ������ �־����� �� ��� ����� �þ߸� ������ �г������� �� �ٿ� �� �� �ִ��� ���Ͻÿ�.*/

int main() {
	int n;
	printf("�л� ���� �Է��ϼ���:");
	scanf("%d",&n);
	int a[n];
		for (int i =0; i<n; i++) {
			scanf("%d",&a[i]);
		}
		 int max= a[n-1];
		 int cnt = 0;
		 for(int i  = n-1; i>=0; i--) {
			 if(a[i]>max) {
				 cnt++;
				 max = a[i];
			 }
		 }
		 printf("�г������ڴ� %d�� �Դϴ�.\n",cnt);
	return 0;
}