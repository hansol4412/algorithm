package algorithm;
import java.util.Scanner;
import java.util.Stack;
public class Number54 {

	public static void main(String[] args) {
		// 54. 올바른 괄호 (스택 클래스 사용)
		// 괄호가 입력되면 올바른 괄호이면 'yes' 올바르지 않으면 'no'를 출력합니다.
		Scanner stdIn = new Scanner(System.in);
		System.out.print("문자열을 입력하시오:");
		String str = stdIn.nextLine();
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
		    char ch = str.charAt(i);
		    if(ch=='(') stack.push(1);
		    if(ch==')') {
		    	if(stack.empty()) {
		    		System.out.println("No");
		    		System.exit(0);
		    	}
		    	else {
		    		stack.pop();
		    	}
		    }
		}
		
		if(stack.empty()) System.out.println("yes");
		if(!stack.empty()) System.out.println("No");
		
	}

}
