package algorithm;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Queue;
public class Number70 {

	public static void main(String[] args) {
		// 70. 그래프의 최단거리 (BFS) 
		// 그래프에서 1번 정점에서 각 정점으로 가는 최소 이동 간선수를 구하여라.
		Scanner stdIn = new Scanner(System.in);
		System.out.print("노드의 수를 입력하세요:");
		int n = stdIn.nextInt();
		System.out.print("간선의 수를 입력하세요:");
		int m= stdIn.nextInt();
		List<LinkedList<Integer>> map = new LinkedList<LinkedList<Integer>>();
		int[] ch = new int[20];
		int[] dis = new int[20];
		int i;
		int o;
		for(int k=0; k<=n; k++) {
			map.add(new LinkedList<Integer>());
		}
		for(int k=1; k<=m; k++) {
			i = stdIn.nextInt();
			o = stdIn.nextInt();
			map.get(i).add(o);
		}
		Queue<Integer> que = new LinkedList<Integer>();
		que.offer(1);
		ch[1]=1;
		while(!que.isEmpty()) {
			int x = que.peek();
			que.poll();
			for(int k = 0; k<map.get(x).size(); k++) {
				if(ch[map.get(x).get(k)]==0) {
					ch[map.get(x).get(k)]=1;
					que.offer(map.get(x).get(k));
					dis[map.get(x).get(k)]=dis[x]+1;
				}
			}
		}
		for(int k=2; k<=n; k++) {
			System.out.println(k+" : "+dis[k]);
		}
	}

}
