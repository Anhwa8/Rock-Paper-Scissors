import java.util.*;
public class endex {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String user;
		int computer;
		
		System.out.println("����, ����, �� �� �ϳ��� �Է��ϼ���.");
		user = input.nextLine();
		
		computer = (int) (Math.random() * 3);
		
		if(user.equals("����")) {
			if(computer == 0) {
				System.out.println("Computer�� ������ �½��ϴ�.");
				System.out.println("�����ϴ�.");
			}
			
			else if (computer == 1) {
				System.out.println("Computer�� ������ �½��ϴ�.");
				System.out.println("�����ϴ�.");
			}
			
			else if (computer == 2) {
				System.out.println("Computer�� ���� �½��ϴ�.");
				System.out.println("�̰���ϴ�.");
			}
		}
		
		else if(user.equals("����")) {
			if(computer == 0) {
				System.out.println("Computer�� ������ �½��ϴ�.");
				System.out.println("�̰���ϴ�.");
			}
			
			else if (computer == 1) {
				System.out.println("Computer�� ������ �½��ϴ�.");
				System.out.println("�����ϴ�.");
			}
			
			else if (computer == 2) {
				System.out.println("Computer�� ���� �½��ϴ�.");
				System.out.println("�����ϴ�.");
			}
		}
		
		else if(user.equals("��")) {
			if(computer == 0) {
				System.out.println("Computer�� ������ �½��ϴ�.");
				System.out.println("�����ϴ�.");
			}
			
			else if (computer == 1) {
				System.out.println("Computer�� ������ �½��ϴ�.");
				System.out.println("�̰���ϴ�.");
			}
			
			else if (computer == 2) {
				System.out.println("Computer�� ���� �½��ϴ�.");
				System.out.println("�����ϴ�.");
			}
		}
		
		else {
			System.out.println("�߸��Է��߽��ϴ�.");
		}
	}
}