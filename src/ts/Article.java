package ts;

import java.util.HashMap;
import java.util.Map;

public class Article {

	public static Map<String, String> join = new HashMap<String, String>();
	public static Map<Integer, Article> usermap = new HashMap<Integer, Article>();

	String user_id;
	int id;
	String resDate;
	String title;
	String body;
	String body1;
	int writer_code;
	
	public Article() {}

	public Article(String user_id, int id, String resDate, String title, String body ) {
		this.user_id = user_id;
		this.id = id;
		this.resDate = resDate;
		this.title = title;
		this.body = body;

	}

}
