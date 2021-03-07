package algorithm;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
public class Number72 {

	public static void main(String[] args) {
		// 72. 공주 구하기(큐 자료구조로 해결) 
		/* N명의 왕자가 시계 방향으로 동그랗게 앉고 1번 왕자부터 1부터 시작하먀 번호를 외친다.
		한 왕자가 특정 숫자 M을 외치면 그 왕자는 공주를 구하러 가는데서 제외된다. 마지막까지 살아 남은 왕자의 번호를 출력하라 */
		Scanner stdIn = new Scanner(System.in);
		System.out.print("왕자 수를 입력하시오:");
		int n = stdIn.nextInt();
		System.out.print("특정 수를 입력하시오:");
		int m = stdIn.nextInt();
		Queue<Integer> que = new LinkedList<Integer>();
		for(int i =1; i<=n; i++) {
			que.offer(i);
		}
		while(!que.isEmpty()) {
			for(int i =1; i<m; i++) {
				que.offer(que.peek());
				que.poll();
			}
			System.out.print(que.peek()+" ");
			que.poll();
			if(que.size()==1) {
				System.out.println("마지막으로 남은 왕자의 번호는 "+que.peek()+"이다.");
				break;
			}
		}
		

	}

}
