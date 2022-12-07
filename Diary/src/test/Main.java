package test;

import java.util.Scanner;

//게시판 기본사항
//help : 명령어 리스트 (완료)
//list : 일기장 리스트 (완료)
//add : 일기장 추가 (완료)
//detail : 일기장 상세보기 (완료)
//exit 일기장 종료 (완료)
//게시판 추가 요구사항
//delete : 일기장 삭제 (완료-삭제 후 순서 정렬되도록 구현)
//modify : 일기장 수정 (완료)
//signup : 회원가입 (완료-중복체크 구현)
//login : 로그인 (완료)
//logout : 로그아웃 
//로그인 한 회원만 글 작성
//작성자 본인만 삭제/수정
//게시물 페이징
//댓글

public class Main {
   public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);

         Board board = new Board();

         board.setScanner(scanner);

         board.start();

         scanner.close();

      }
   }


   