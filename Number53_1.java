package algorithm;
import java.util.Scanner;
import java.util.Stack;
public class Number53_1 {

	public static void main(String[] args) {
		// 53_1. K진수 출력 (Stack 클래스 사용o)
		/* 10진수 n이 입력되면 m진수로 변형하여 출력하는 프로그램을 작성하시오. 
			스택 자료구조를 사용하여라 */
			Scanner stdIn = new Scanner(System.in);
			System.out.print("변형하는 숫자 n을 입력하세요:");
			int n = stdIn.nextInt();
			System.out.print("m진수를 입력하세요:");
			int m = stdIn.nextInt();
			Stack<Integer> stack = new Stack<>();
			String[] str = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
			while(n>0) {
				stack.push(n%m);
				n= n/m;
			}
			while(!stack.empty()) {
				System.out.print(str[stack.pop()]);
			}
	}

}
