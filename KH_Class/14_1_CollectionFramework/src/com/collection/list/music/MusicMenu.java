package com.collection.list.music;

import java.util.Scanner;
import com.collection.list.music.controller.*;

/**
 * 1.vo클래스 작성 -title:String -singer:String getter/setter, 기본생성자/파라미터있는생성자,
 * toString 오버라이드
 */

public class MusicMenu {
	private MusicManager manager = new MusicManager();
	private Scanner sc = new Scanner(System.in); // 접근제어자 연습

	public void MusicManager() {
		String menu = " ================ Music Playlist Menu ================\r\n" + "    1.목록보기\r\n"
				+ "    2.마지막에 음악추가\r\n" + "    3.맨처음에 음악추가\r\n" + "    4.곡삭제\r\n" + "    5.곡변경\r\n" + "    6.곡명검색\r\n"
				+ "    7.가수검색\r\n" + "    8.목록정렬(곡명오름차순)\r\n" + "    0.종료\r\n"
				+ "    ================================================================\r\n" + "    >> 메뉴선택 : \r\n";
 
		while (true) {
			System.out.println(menu);
			int choice = sc.nextInt(); // Switch 문생성
			sc.nextLine();

			switch (choice) {
			case 1:
				// 1.목록보기
				System.out.println(manager.selectList());
				break;
			case 2:
				System.out.println("======================");
				System.out.println("곡명을 입력하세요 : ");
				System.out.println("======================");
				String title = sc.nextLine();
				System.out.println("======================");
				System.out.println("가수 를 입력하세요 : ");
				System.out.println("======================");
				String Singer = sc.nextLine();
				manager.addList(new Music(title, Singer));
				System.out.println(manager.selectList());
				break;
			case 3:
				System.out.println("======================");
				System.out.println("곡명을 입력하세요 : ");
				System.out.println("======================");
				 title = sc.nextLine();	// String 초기값만 선언해도 가능 메모리낭비
				System.out.println("======================");
				System.out.println("가수 를 입력하세요 : ");
				System.out.println("======================");
				 Singer = sc.nextLine();	//메모리낭비
				manager.addList(new Music(title, Singer));
				System.out.println(manager.selectList());
				break;
			case 4:
				System.out.println("======================");
				System.out.println("삭제할 제목을 입력하세요  : ");	
				System.out.println("======================"); 
				String Deletetitle = sc.nextLine();
				manager.removeMusic(Deletetitle);
				System.out.println("삭제했습니다.");
				System.out.println(manager.selectList());
				break;
			case 5:
				System.out.println("======================");
				System.out.println("교체할제목을 입력하세요  : ");		
				System.out.println("======================");
				String changetitle = sc.nextLine();
				System.out.println("======================");
				System.out.println("교체할가수를 입력하세요  : ");	
				System.out.println("======================");
				String changetsinger = sc.nextLine();
				Music newMusic =new Music(changetitle, changetsinger);
				System.out.println(manager.selectList());
				break;
			case 6:
				System.out.println("======================");
				System.out.println("곡을 검색을합니다 : ");
				System.out.println("======================");
				String searchtitle = sc.nextLine();
				System.out.println(manager.searchMusicByTitle(searchtitle));
				break;
			case 7:
				System.out.println("======================");
				System.out.println("가수명 검색을 합니다 :");
				System.out.println("======================");
				String searchsinger = sc.nextLine();
				System.out.println(manager.searchMusicBySinger(searchsinger));	
				break;
				
			case 8:
				sortMenu();
				break;
				
			case 0: 
				System.out.println("======================");
				System.out.println("종료합니다");
				System.out.println("======================");
				break;
				
			default:
				System.out.println("======================");
				System.out.println("잘못입력했습니다");
				System.out.println("======================");
				break;
			}
		}
	}

	void sortMenu() {
		String menu =" ================== 정렬 메뉴 ===================\r\n" + 
				"	1. 가수명 오름차순\r\n" + 
				"	2. 가수명 내림차순\r\n" + 
				"	3. 곡명 오름차순\r\n" + 
				"	4. 곡명 내림차순\r\n" + 
				"	5. 메인메뉴 돌아가기\r\n" + 
				"	================================================\r\n" + 
				">> 메뉴선택 : \r\n";
		System.out.println(menu);
		int choice = sc.nextInt(); // Switch 문생성
		sc.nextLine();

		switch (choice) {
			case 1 :		
				manager.searchMusicByTitle(new MusicTitleAscending());
				break;
			case 2 :		
				manager.searchMusicByTitle(new MusicTitleAscending().reversed());//reversed 문자열 거꾸로 뒤집기 
				break;
			
			case 3 :		
				manager.searchMusicBySinger(new SingerTitleAscending());
				break;	
			
			case 4 :		
				manager.searchMusicBySinger(new SingerTitleAscending().reversed()); 
				break;	
		}
	}
}

	



