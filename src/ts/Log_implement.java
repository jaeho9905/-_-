package ts;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Log_implement extends Article implements Log_interface {
	Scanner scanner = new Scanner(System.in);
	boolean login_code = false;

	Log_implement() {
		articles = new Article[100];
		articlesLastIndex = -1;
		members = new Member[100];
		membersLastIndex = -1;
	}

	Member[] members;
	Article[] articles;
	int articlesLastIndex;
	int membersLastIndex;

	String getNowDateStr() {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat Date = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
		String dateStr = Date.format(cal.getTime());
		return dateStr;
	}

	@Override
	public void doCommandSignup() {
		System.out.println("======== 회원 가입 ========");
		System.out.printf("회원가입 아이디 : ");
		String id = scanner.next();

		if (!(Article.join.containsKey(id))) {
			System.out.printf("회원가입 비밀번호 : ");
			String pw = scanner.next();
			Article.join.put(id, pw);
			System.out.printf("%s님 회원가입을 축하합니다.\n", id);
		} else {
			System.out.println("중복된 아이디입니다.");
		}

		


	}
	
	@Override
	public void doCommandLogin() {
		if(login_code==false) {
			
		
		System.out.println("========  로그인  ========");
		System.out.printf("아이디 입력 : ");
		String temp_Id = scanner.next();
		
		System.out.printf("비밀번호 입력 : ");
		String temp_Pw = scanner.next();

		if (Article.join.containsKey(temp_Id) && temp_Pw.equals(Article.join.get(temp_Id))) {
			login_code = true;
			this.user_id = temp_Id;
			System.out.printf("%s님 환영합니다.\n", temp_Id);
		} else {
			System.out.println("아이디와 비밀번호를 확인해주세요.");
			return;
		}
		}else {
			System.out.println("로그인 상태입니다.");
		}
	}

	@Override
	public void doCommandLogout() {
		if (login_code == true) {
			System.out.printf("로그아웃 하시겠습니까? (Y / N) ");
			String temp_logout = scanner.next();
			scanner.nextLine();

			if (temp_logout.equals("Y") || temp_logout.equals("y")) {
				login_code = false;
				System.out.println("로그아웃 되었습니다.");
				
			} else if (temp_logout.equals("N") || temp_logout.equals("n")) {
				System.out.println("로그아웃이 취소되었습니다.");
				return;
			}

		} else if (login_code == false) {
			System.out.println("현재 로그인 중이지 않습니다.");
			doCommandLogin();
		}
	}

}