package algorithm;
import java.util.Scanner;
import java.util.Stack;
public class Number55 {
	public static void main(String[] args) {
		//55. 기차 운행 (stack사용)
		/* A도시에서 출발한 기차는 교차로에 들려 순서를 조정한 후 B도시로 도착한다.  
		      기차별로 번호가 부여되는데  P(push)작업과 O(out)작업을 통해 순서대로 B도시에 도착하도록 작성하여라
		      번호 순서대로 도착이 불가능한 작업은 Impossible이라고 출력한다. */
		Scanner stdIn = new Scanner(System.in);
		System.out.print("기차의 갯수를 입력하시오:");
		int n = stdIn.nextInt();
		int[] a = new int[n+1];
		System.out.print("기차의 번호를 입력하세요:");
		for(int i =1; i<=n; i++) {
			a[i] = stdIn.nextInt();
		}
		Stack<Integer> stack = new Stack<>();
		int j=1;
		for(int i =1; i<=n; i++) {
			stack.push(a[i]);
			System.out.print("P");
			while(true) {
					if(stack.empty()) break;
					if(j==stack.peek()) {
						stack.pop();
						System.out.print("O");
						j++;
					}
					else {
						break;
					}
				
			}	
		}
		if(!stack.empty()) {
			System.out.println();
			System.out.println("Impossible");
		}
	}
}
