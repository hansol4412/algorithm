#include <stdio.h>
#include <stack>
using namespace std;
int main() { 
// 54. �ùٸ� ��ȣ (���� Ŭ���� ���)
// ��ȣ�� �ԷµǸ� �ùٸ� ��ȣ�̸� 'yes' �ùٸ��� ������ 'no'�� ����մϴ�.
	char a[50];
	scanf("%s",&a);
	stack<int> stk;
	
	for(int i=0; a[i]!='\0'; i++){
		if(a[i]=='('){
			stk.push(1);	
		}
		if(a[i]==')'){
			if(stk.empty()){
				printf("NO\n");
				return 0;
			}
			else{
				stk.pop();
			}
		}
	
	}
	if(stk.empty()){
		printf("YES\n");
	}
	if(!stk.empty()){
		printf("NO");
	}
	
	return 0;

}
