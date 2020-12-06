package algorithm;
import java.util.Scanner;
public class Number2 {

	public static void main(String[] args) {
		// 2. 자연수의 합
		// 자연수 A, B가 주어지면 A부터 B까지의 합을 수식과 함께 출력하세요.
				
				Scanner stdIn = new Scanner(System.in);
				System.out.print("A의 수를 입력하시오:");
				int a = stdIn.nextInt();
				System.out.print("B의 수를 입력하시오:");
				int b = stdIn.nextInt();
				int sum = 0;
				for(int i = a; i<b; i++) {
					System.out.print(i+" + ");
					sum+= i;
				}
				sum+= b;
				System.out.print(b+" = "+ sum);
			}

}
