package web.login;

	public class UserImpl implements User{
		
		private static UserImpl userImpl = new UserImpl();
			
			public static UserImpl getInstance() {
				if(userImpl == null) {
					userImpl = new UserImpl();
				}
				return userImpl;
			}
			
			public static MenuImpl menu = MenuImpl.getInstance();
			
			String userId;
			String userPw;	
			
			private UserImpl() {}
			
			public UserImpl(String userId, String userPw) {
				this.userId = userId;
				this.userPw = userPw;
			}

			public String getUserId() {
				return userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public String getUserPw() {
				return userPw;
			}

			public void setUserPw(String userPw) {
				this.userPw = userPw;
			}
			
			public void init() {
				MovieUser.join.put("aaa", "aaa");
				MovieUser.join.put("bbb", "bbb");
				MovieUser.join.put("ccc", "ccc");
				MovieUser.join.put("ddd", "ddd");
				MovieUser.join.put("eee", "eee");			
				
			}

			
			
			
}
