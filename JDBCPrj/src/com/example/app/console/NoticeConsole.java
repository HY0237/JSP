package com.example.app.console;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.example.app.entity.Notice;
import com.example.app.service.NoticeService;

public class NoticeConsole {
	
	
	private NoticeService service;
	private int page;
	private String searchWord;
	private String searchField;
	
	public NoticeConsole() {
		service = new NoticeService();
		page = 1;
		searchField= "TITLE";
		searchWord ="";
	}

	public void printNoticeList() throws ClassNotFoundException, SQLException {
		
		List<Notice> list = service.getList(page, searchField, searchWord);
		int count = service.getCount();
		int lastPage = count/2;
		lastPage = count%2 == 0?lastPage:lastPage+1;
		
		System.out.println("--------------------------------");
		System.out.printf("       <��������> �� %d �Խñ�\n", count);
		System.out.println("--------------------------------");
		for(Notice n : list) {
			
			System.out.printf("%d. %s / %s / %s\n", n.getId(),
													n.getTitle(),
													n.getWriterid(),
													n.getRegDate());
			
		}
		System.out.println("--------------------------------");
		System.out.printf("         %d/%d pages\n", page, lastPage);
	}

	public int inputNoticeMenu() {
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("1.����ȸ/ 2.����/ 3.����/ 4.�۾���/ 5.�˻�/ 6/���� >");
		String menu_ = scan.nextLine();
		int menu = Integer.parseInt(menu_);
		
		return menu;
	}

	public void movePrevList() {
		if(page == 1) {
			System.out.println("=================");
			System.out.println("[���� �������� �����ϴ�]");
			System.out.println("=================");
			return;
		}
		page--;
		
	}

	public void moveNextList() throws ClassNotFoundException, SQLException {
		
		int count = service.getCount();
		int lastPage = count/2;
		lastPage = count%2 == 0?lastPage:lastPage+1;
		
		if(page == lastPage) {
			System.out.println("=================");
			System.out.println("[���� �������� �����ϴ�]");
			System.out.println("=================");
			return;
		}
		page++;
		
	}

	public void inputSearchWord() {
		Scanner scan = new Scanner(System.in);
		System.out.print("�˻� ����(title/content/writerId)�߿� �ϳ��� �Է��ϼ���>");
		System.out.println(">");
		searchField = scan.nextLine();
		System.out.println("�˻��� >");
		searchWord = scan.nextLine();
		
	}

}
