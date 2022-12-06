package web.login;

import java.util.HashMap;
import java.util.Map;

public class MovieUser {

	public static Map<String, String> join = new HashMap<String, String>();
	// 회원가입

	private String userId; // 회원 id

	private MovieUser() {
	}
	// 생성자는 외부에서 호출못하게 private 으로 지정해야 한다.

	public MovieUser(int seatNo, int price, int count, String userId) {

		this.userId = userId;
	}



	public static void setUserMap(Map<Integer, MovieUser> userMap) {
	}

	public static Map<String, String> getJoin() {
		return join;
	}

	public static void setJoin(Map<String, String> join) {
		MovieUser.join = join;
	}



	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}


}
