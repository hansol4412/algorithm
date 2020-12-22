#include <stdio.h> 
// 17. 선생님 퀴즈
/* 학생이 n명 있습니다. 선생님은 각 학생들에게 숫자가 적힌 카드를 주고, 학생들은 1부터 자기 카드까지 합을 구합니다.
   학생들이 입력한 합이 맞으면 YES 틀리면 NO를 출력하시오 */

int main() {
		int n;
		int teacher, student;
		int sum;
		scanf("%d",&n);
		for(int i= 1; i<=n; i++){
			scanf("%d %d",&teacher, &student);
			sum=0;
			for(int j =1; j<=teacher; j++){
				sum=sum+j;
			}
			if(sum==student)printf("YES \n");
			else printf("NO \n");
			
		}
	
	return 0;
}
