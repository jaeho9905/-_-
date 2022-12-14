package ts;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Sys_implement sys = new Sys_implement();
		Log_implement log = new Sys_implement();
		Diary_implement diary = new Sys_implement();
		
		sys.setScanner(scanner);
		System.out.println("======== 메뉴 ========\n");
		System.out.println("회원가입: signup\n스케줄: schedule\n종료: exit");
		while(true) {
		System.out.print("메뉴를 입력해주세요: ");
		String menu = scanner.nextLine();
		if(menu.equals("signup")) {
			log.doCommandSignup();
			break;
		}else if(menu.equals("schedule")) {
			diary.doSchedule();
			break;
		}else if(menu.equals("exit")) {
			sys.doCommandExit();
			break;
		}else {
			System.out.println("다시 입력해주세요");
			continue;
		}
		}
		sys.start();

		scanner.close();
	}

}
