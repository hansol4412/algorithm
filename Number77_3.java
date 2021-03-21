package algorithm;
import java.util.Scanner;
public class Number77_3 {
	public static int [] unf = new int[100];
	public static int find(int v) {
		if(unf[v]==v) return v;
		else return unf[v]=find(unf[v]);
	}
	public static void union(int a, int b) {
		a = find(a);
		b = find(b);
		if(a != b) unf[a]=b;
	}
	public static void main(String[] args) {
		// 77_3. ģ���ΰ�
		/* ������ �� �л��� N���̰�, ��� �л��� 1���� N���� ��ȣ�� �ο��Ǿ� �ִ�. 
		 * �������Դ� ���� �� ���� �л��� ģ�������� ��ȣ�� ǥ���� ���ڽ��� �־�����. 
		 * ���� (1,2) (2,3) (3,4)�� ���� ���� �־����� 1�� �л���2�� �л��� ģ���̰�, 2�� �л��� 3�� �л���
		 * ģ���̰�, 3�� �л��� 4���л��� ģ���̴�. �̴� ����Ǿ� 1�� �л��� 4�� �л��� ģ���� �� �� �ִ�
		 * �л��� ģ�����踦 ��Ÿ���� ���� ���� �־����� ���� �� ���� ģ������ �Ǻ���� ���α׷��� �ۼ��Ͻÿ�.
		 * ģ�����谡 ������ YES, �ƴϸ� NO�� ����Ѵ�. */
		// Union & Find �ڷᱸ��
		Scanner stdIn = new Scanner(System.in);
		System.out.print("�л����� �Է��ϼ���:");
		int n = stdIn.nextInt();
		System.out.print("�� ���� ģ������ �Է��ϼ���:");
		int r = stdIn.nextInt();
		for(int i =1; i<=n; i++) {
			unf[i]=i;
		}
		for(int i =1; i<=r; i++) {
			int a = stdIn.nextInt();
			int b = stdIn.nextInt();
			union(a,b);
		}
		System.out.print("ģ�� ���̸� �˰� ���� ��ȣ�� 2�� �Է��ϼ���:");
		int f1 = stdIn.nextInt();
		int f2 = stdIn.nextInt();
		f1=find(f1);
		f2=find(f2);
		if(f1==f2)System.out.println("YES");
		else System.out.println("No");

	}

}
