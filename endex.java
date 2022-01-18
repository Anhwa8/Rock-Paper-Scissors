import java.util.*;
public class endex {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String user;
		int computer;
		
		System.out.println("가위, 바위, 보 중 하나를 입력하세요.");
		user = input.nextLine();
		
		computer = (int) (Math.random() * 3);
		
		if(user.equals("가위")) {
			if(computer == 0) {
				System.out.println("Computer가 가위를 냈습니다.");
				System.out.println("비겼습니다.");
			}
			
			else if (computer == 1) {
				System.out.println("Computer가 바위를 냈습니다.");
				System.out.println("졌습니다.");
			}
			
			else if (computer == 2) {
				System.out.println("Computer가 보를 냈습니다.");
				System.out.println("이겼습니다.");
			}
		}
		
		else if(user.equals("바위")) {
			if(computer == 0) {
				System.out.println("Computer가 가위를 냈습니다.");
				System.out.println("이겼습니다.");
			}
			
			else if (computer == 1) {
				System.out.println("Computer가 바위를 냈습니다.");
				System.out.println("비겼습니다.");
			}
			
			else if (computer == 2) {
				System.out.println("Computer가 보를 냈습니다.");
				System.out.println("졌습니다.");
			}
		}
		
		else if(user.equals("보")) {
			if(computer == 0) {
				System.out.println("Computer가 가위를 냈습니다.");
				System.out.println("졌습니다.");
			}
			
			else if (computer == 1) {
				System.out.println("Computer가 바위를 냈습니다.");
				System.out.println("이겼습니다.");
			}
			
			else if (computer == 2) {
				System.out.println("Computer가 보를 냈습니다.");
				System.out.println("비겼습니다.");
			}
		}
		
		else {
			System.out.println("잘못입력했습니다.");
		}
	}
}