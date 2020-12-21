#include <stdio.h> 
#include <algorithm>
// 16. Anagram (구글 인터뷰 문제)
// 아나그램이란 두 문자열이 알파벳의 나열 순서는 다르지만 그 구성이 일치하면 두 단어는 아나그램이라고 한다
// 아나그램 판별시 대소문자는 구별된다.
int ac[52], bc[52];
int main() {
		int num;
		char a[100];
		scanf("%s",&a);
		for(int i =0; a[i]!='\0';i++){
			num = a[i]-'A';
		    if(num>=32) {
		    	num=num-6;
		    }
		    ac[num]++;
		}
		
		char b[100];
		scanf("%s",&b);
		for(int i =0; b[i]!='\0';i++){
			num = b[i]-'A';
		    if(num>=32) {
		    	num=num-6;
		    }
		    bc[num]++;
		}
		
		for(int i=0; i<52; i++)
		{
			if(ac[i]!=bc[i]){
				printf("NO \n");
				exit(0);
			}
			
		}
		
		printf("YES \n");
	
	return 0;
}
