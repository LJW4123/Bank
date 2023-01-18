package bank;

import java.util.Scanner;

public class study005 {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int choice = 0;
		int j=1;
		BankManager branch1 = new BankManager("건국대지점" , 5);
		while(true) {
			System.out.println("1)계좌 개설 2) 입금 3) 출금 4)이체 5) 계좌 확인 6) 종료");
			System.out.print("메뉴를 선택하세요 : ");
			
			choice = scan.nextInt();
			scan.nextLine();
			System.out.println();

			switch (choice) {
			case 1:
				
				branch1.createAccount();
				System.out.println("계좌번호는 "+j);
				j++;
				break;
			case 2:
				branch1.deposit();
				break;
			case 3 : 
				branch1.withdraw();
				break;
			case 4:
				branch1.transfer();
				break;
			case 5 :
				
				System.out.println("계좌번호 입력");
				int i = scan.nextInt();
				System.out.println(branch1.bankAccount[i-1]);
				break;
			case 6:				
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				break;
			}
				
		}	
			
		}
		
	}


