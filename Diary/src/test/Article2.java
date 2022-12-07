package test;

public interface Article2 {

	void start();
	void doCommandHelp();
	void doCommandList();
	void doCommandAdd();
	void doCommandDetail(int id);
	void doCommandDelete(int id);
	void doCommandModify(int id);
	void doCommandSignup();
	void doCommandLogin();
	void doCommandLogout();
	void doCommandExit();
	void showHelp();

}
