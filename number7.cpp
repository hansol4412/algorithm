#include <stdio.h> 

// ����ܾ� ����  
/* ������ ǥ�õǴ� ����ܾ ������ ǥ����� ������ �����ϰ� �ҹ���ȭ
	���� ����ϴ� ���α׷��� �ۼ��ϼ���.  */ 
 
int main() {
	char a[100];
	char b[100];
	int p=0;
	gets(a);
		for(int i=0; a[i]!='\0'; i++){
			if(a[i]!=32 && a[i]>=65 && a[i]<=90){
				b[p++]=a[i]+32;
			}	
		}
		b[p]='\0';
		printf("%s\n",b);
	
	return 0;
}