package ts;

public interface Diary_interface{
	void doCommandList();
	
	void doCommandAdd();

	void doCommandDelete(int id);

	void doCommandModify(int id);
	public void getMonthGalendar();

	public void getMonthGalendar(int intYear, int intMmonth);
}
