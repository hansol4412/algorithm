package algorithm;
import java.util.Scanner;
public class Number37 {

	public static void main(String[] args) {
		// 37. Least Recently Used (카카오 캐시 변형 문제)
		// 캐시메모리는 LRU 알고리즘 즉, 가장 오랫동안 사용하지 않는 것을 제거하는 알고리즘을 사용한다. 
		// Cache Miss : 해야할 작업이 캐시에 없는 상태로 모든 작업이 뒤로 밀리고 새로운 작업이 앞에 추가 된다.
		// Cache Hit : 해야할 작업이 캐시에 있는 상태로 사용해야 하는 작업 앞에 있는 작업은 뒤로 밀리고 사용하는 작업이 맨 앞으로 온다
		// 캐시 크기와 작업수를 입력하고 캐시메모리의 작업 과정을 출력하시오.
		
		
		Scanner stdIn = new Scanner(System.in); 
		System.out.print("캐시메모리의 크기를 입력하세요 :");
		int memory = stdIn.nextInt();
		int[] m = new int[memory];
		System.out.print("작업의 수를 입력하시오.:");
		int work = stdIn.nextInt();
		int[] w = new int[work];
		for(int i=0; i<work; i++) {
			w[i]=stdIn.nextInt();
		}
		 
		for(int i=0; i<work; i++) {
			int pos=-1;
			for(int j=0; j<memory; j++) {
				if(w[i]==m[j]) pos=j;	
			}
			if(pos==-1) {
				for(int t=memory-1; t>=1; t--) m[t]=m[t-1];
				m[0]=w[i];
			}
			else {
				int temp=m[pos];
				for(int t=pos; t>=1; t--) m[t]=m[t-1];
				m[0]=temp;
			}
			
			 for(int q=0; q<memory; q++) {
					System.out.print(m[q]+" ");
				}
			 System.out.println();
		}
				 		 
		
		
		
	}

}
