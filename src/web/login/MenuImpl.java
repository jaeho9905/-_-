package web.login;

import java.util.Scanner;

public class MenuImpl implements Menu, Code {

	public static UserImpl user = UserImpl.getInstance();

	public static Scanner scan = new Scanner(System.in);
	public String userId;

	private MenuImpl() {
	}

	private static MenuImpl menu = new MenuImpl();

	public static MenuImpl getInstance() {
		if (menu == null) {
			menu = new MenuImpl();
		}
		return menu;
	}

	@Override
	public void init() {

		user.init();
		mainMenu();
	}

	@Override
	public void mainMenu() {
		System.out.println("\n              [  삼  공  시  네  마  ]");
		System.out.println("*  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *");
		System.out.println("           [1] 로그인  [2] 회원가입  [0] 종료");
		System.out.print("\n메뉴를 선택하세요 :");
		String sel = scan.next();
		switch (sel) {
		case ("1"):
			commonMenu(USER_MENU_LOGIN);
			break;

		case ("2"):
			commonMenu(USER_JOIN);
			break;

		case ("0"):
			System.out.println("종료합니다. ");
			System.exit(0);
			break;

		default:
			System.out.println("\n잘못된 입력입니다.\n다시 입력해주세요.");
			commonMenu(MAIN_MENU);
			break;
		}
	}

	@Override
	public void commonMenu(int menuNo) {

		switch (menuNo) {

		case MAIN_MENU:
			mainMenu();
			break;

		case USER_JOIN:
			userJoin();
			break;

		case USER_MENU_LOGIN:
			userLogin();
			break;

		default:
			break;

		}
	}

	@Override
	public void userJoin() {
		System.out.println("\n              [  회  원  가  입  ]");
		System.out.println("*  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *");
		System.out.print("아이디를 입력하세요:");
		String id = scan.next();

		if (!(MovieUser.join.containsKey(id))) {
			// 중복된 아이디가 없을때
			System.out.print("비밀번호를 입력하세요:");
			String pw = scan.next();
			MovieUser.join.put(id, pw); // 회원 정보 추가

		} else {
			System.out.println("중복된 아이디입니다.");
			commonMenu(USER_JOIN);
		}
		System.out.println(" * * 회원가입이 완료되었습니다 * * ");
		commonMenu(MAIN_MENU);
	}

	@Override
	public void userLogin() {
		System.out.println("\n                  [  로  그  인  ]");
		System.out.println("*  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *");
		System.out.print("아이디를 입력하세요:");
		String id = scan.next();
		System.out.print("비밀번호를 입력하세요:");
		String pw = scan.next();

		if (MovieUser.join.containsKey(id) && pw.equals(MovieUser.join.get(id))) {
			this.userId = id;
			user.setUserId(id);
			// 중요
			System.out.println(id + "님 환영합니다.");
			commonMenu(USER_MENU);
		} else {
			System.out.println("아이디 & 비밀번호를 확인해주세요.");
			commonMenu(MAIN_MENU);
		}

	}



}
