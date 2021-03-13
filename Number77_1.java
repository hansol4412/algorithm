package algorithm;
import java.util.Scanner;
public class Number77_1 {
	public static void main(String[] args) {
	// 77_1. ģ���ΰ�
			/* ������ �� �л��� N���̰�, ��� �л��� 1���� N���� ��ȣ�� �ο��Ǿ� �ִ�. 
			 * �������Դ� ���� �� ���� �л��� ģ�������� ��ȣ�� ǥ���� ���ڽ��� �־�����. 
			 * ���� (1,2) (2,3) (3,4)�� ���� ���� �־����� 1�� �л���2�� �л��� ģ���̰�, 2�� �л��� 3�� �л���
			 * ģ���̰�, 3�� �л��� 4���л��� ģ���̴�. �̴� ����Ǿ� 1�� �л��� 4�� �л��� ģ���� �� �� �ִ�
			 * �л��� ģ�����踦 ��Ÿ���� ���� ���� �־����� ���� �� ���� ģ������ �Ǻ���� ���α׷��� �ۼ��Ͻÿ�.
			 * ģ�����谡 ������ YES, �ƴϸ� NO�� ����Ѵ�. */
	// But, ģ�� ���� ��ȣ ����� �Է��ؾ� �Ѵ�.
			Scanner stdIn = new Scanner(System.in);
			System.out.print("�л����� �Է��ϼ���:");
			int n = stdIn.nextInt();
			System.out.print("�� ���� ģ������ �Է��ϼ���:");
			int r = stdIn.nextInt();
			int[] t1 = new int[r+1];
			int[] t2 = new int[r+1];
			for(int i =1; i<=r; i++) {
				int a = stdIn.nextInt();
				int b = stdIn.nextInt();
				t1[i] = a;
				t2[i] = b;
			}
			
			System.out.print("ģ�� ���̸� �˰� ���� ��ȣ�� 2�� �Է��ϼ���:");
			int f1 = stdIn.nextInt();
			int f2 = stdIn.nextInt();
			for(int i=f1; i<=f2; i++) {
				if(t1[i]!=t2[i-1]) {
					System.out.println("NO");
					break;
				}
				if(i==f2) {
					System.out.println("YES");
				}
			}

	}
}