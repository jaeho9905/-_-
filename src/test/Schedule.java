package test;

import java.util.Calendar;
import java.util.Scanner;

public class Schedule {
	void doSchedule() {
		Schedule.getMonthGalendar();     
    }

    public static void getMonthGalendar(){
         Calendar cal = Calendar.getInstance(); // 캘린더 객체 생성
         int thisYear = cal.get(Calendar.YEAR); //현재 년
         int thisMonth = cal.get(Calendar.MONTH)+1; //현재 달
       
         getMonthGalendar(thisYear,thisMonth); // 현재달의 달력을 출력
       
    }
   
    public static void getMonthGalendar(int intYear, int intMmonth){
       
         Calendar cal = Calendar.getInstance();
         
         int thisYear = cal.get(Calendar.YEAR); //현재 년
         int thisMonth = cal.get(Calendar.MONTH)+1; //현재 달
         int today = cal.get(Calendar.DATE); //오늘 일자 저장
         
         boolean booToday = (intYear==thisYear)&&(thisMonth==intMmonth);
       
        cal.set(intYear,intMmonth-1,1); //캘린더객체에 입력받은 년, 달, 그리고 Date을 1로설정
       
        int sDayNum = cal.get(Calendar.DAY_OF_WEEK); // 1일의 요일 얻어오기
        int endDate = cal.getActualMaximum(Calendar.DATE); //달의 마지막일 얻기
        int nowYear = cal.get(Calendar.YEAR);
        int nowMonth = cal.get(Calendar.MONTH);
       
        System.out.println("===================== "+ nowYear+"년  " + (nowMonth+1) + "월 ==================");

        //요일명 출력
        System.out.println(" 일\t 월\t 화\t 수\t 목\t 금\t 토\t");  
        System.out.println("====================================================");
        
        int intDateNum = 1; 
        
        for (int i = 1; intDateNum <= endDate ; i++) {          
            
            if(i<sDayNum) System.out.printf("%3s\t","★"); //i가 요일숫자보다 작으면 공백으로 채우기  
            else{
                if(booToday && intDateNum==today) System.out.printf("[%2d ]\t",intDateNum); //오늘 날짜 표시
                else System.out.printf("%3d\t",intDateNum); //일반 출력
               
                intDateNum++; //출력할 date 증가.
            }            
            if(i%7==0) System.out.println(); 
           
        }//for
        System.out.println();
    }

	Scanner scanner;

	void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}
}