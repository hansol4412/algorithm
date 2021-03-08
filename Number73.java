package algorithm;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Collections;
import java.util.PriorityQueue;
public class Number73 {
	public static void main(String[] args) {
	//73. 최대히프  (우선순위 큐)
	/* 최대히프는 완전이진트리로 구현된 자료구조, 부모 노드값이 왼쪽자식와 오른쪽 자식노드의
	   값 보다 크게 트리를 구성. 루트노드의 값이 가장 큰 수가 위치한다.
	   1) 자연수가 입력되면 최대히프에  입력한다.
	   2) 숫자 0이 입력되면 최대 히프에서 최댓값을 꺼내 출력한다.
	   3) -1이 입력되면 프로그램을 종료한다.  
	*/
	 Scanner stdIn = new Scanner(System.in);
	 PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
	 while(true) {
		 int n = stdIn.nextInt();
		 if(n==-1) {
			 System.out.println("프로그램을 종료합니다.");
			 break;
		 }
		 if(n==0) {
			 if(pq.isEmpty()) {
				 System.out.println("-1: 우선순위 큐에 값이 없습니다.");
				 break;
			 }
			 System.out.println("최대 히프 : "+ pq.peek());
			 pq.poll();
		 }
		 else {
			 pq.offer(n);
		 }
	 }
	 
}
}
