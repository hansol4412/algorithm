package algorithm;
import java.util.Scanner;
public class Number53 {
	public static int ptr = -1;
	public static void push(int[] stack, int k) {
		stack[++ptr] = k;
	}
	public static int pop( int[] stack) {
		return stack[ptr--];
	}
	public static void main(String[] args) {
		// 53. K진수 출력 (Stack 클래스 사용x)
		/* 10진수 n이 입력되면 m진수로 변형하여 출력하는 프로그램을 작성하시오. 
		 	스택 자료구조를 사용하여라 */
		Scanner stdIn = new Scanner(System.in);
		System.out.print("변형하는 숫자 n을 입력하세요:");
		int n = stdIn.nextInt();
		System.out.print("m진수를 입력하세요:");
		int m = stdIn.nextInt();
		int[] stack = new int[10];
		String[] str = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
		while(n>0) {
			push(stack, n%m);
			n = n/m;
		}
		
		while(ptr!=-1) {
			System.out.print(str[pop(stack)]);
		}

	}

}
