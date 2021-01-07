package com.collection.list.music.controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import com.collection.list.music.Music;
import com.collection.list.music.MusicMenu;

public class MusicManager {
	private Scanner sc = new Scanner(System.in); // 접근제어자 연습
	private List<Music> list = new ArrayList<>();
//-mList:ArrayList<Music> => 초기화블럭을 사용하여 5곡을 미리 만들어두기
	{
		list.add(new Music("Tatto", "Elo"));
		list.add(new Music("2월", "쏜애플"));
		list.add(new Music("Always Awake (Bonus Track)", "Jazzyfact"));
		list.add(new Music("Rose", "Elo"));
		list.add(new Music("불면증", "Dynamic Duo"));
	}

	// 1. 음악리스트 리턴
	public List<Music> selectList() {
		return list;
	}

	// 2. 마지막에 음악추가 : 사용자로부터 곡명과 가수를 입력받아 리스트에 저장하는 메소드.
	public void addList(Music m) {
		list.add(m);
	}

	// 3. 맨처음에 음악추가 : 리스트 최상위(0번지)에 음악을 추가하는 메소드
	public void addAtZero(Music m) {
		list.add(m);
	}

	// 4. 특정곡을 삭제하는 메소드(제목을 전달받아 검색후, 최초로 검색된 음악을 삭제)
	// 삭제여부를 리턴 equals 사용해 true,false비교
	public boolean removeMusic(String title) {	//for문으로 하기 
		// remove 삭제가 될경우
		for(Music m : list ) {		//for each문 사용 for(파라미터 : 생성자)
			if(m.getTitle().equals(title)) {		//배열은 인덱스
				list.remove(m);
				return true;
			}
		}
		System.out.println("삭제할 곡  이 없습니다");
		return false;
	}

	// 5. 특정곡을 바꾸는 메소드(이전 음악객체, 새 음악객체를 전달해서 교체)
	// 교체 성공여부를 리턴
	public boolean replaceMusic(Music oldMusic, Music newMusic) {
		if (list.indexOf(oldMusic) != -1) {		//이전음악교체 구간  
			int oldidx = list.indexOf(oldMusic);	
			list.set(oldidx, newMusic);
			return true;
		}
		return false;
	}
	// 6. 특정곡이 있는지 검사하는 메소드 : 복수개의 결과가 나올수 있음.
	// (곡명일부로 검색해서 해당곡이 있다면, 곡정보(제목/가수)를 출력하고, 없다면, "검색결과가 없습니다"출력)
	/**
	 * 처음에 if(list.contains(new Music(searchtitle,""))
	 */
	int title =0;
	public List<Music>searchMusicByTitle(String searchtitle){ 
		List<Music>searchMusicByTitle =new ArrayList<Music>();
			for(Music m: list){
				if(m.getTitle().equals(title))
			searchMusicByTitle.add(m);
			return searchMusicByTitle;
		}
		System.out.println("검색결과가 없습니다 ");
		return null;		
	}
	//7. 가수명으로 검색 메소드 : 복수개의 결과가 나올수 있음.
	int singer=0;
	public List<Music> searchMusicBySinger(String searchsinger){
		List<Music>searchMusicBySinger =new ArrayList<Music>();
		for(Music m: list){		//for each 문 연습  for(파라미터  m : 생성자)  생각하기 
			if(m.getSinger().equals(singer)) //if (m.get
			searchMusicBySinger.add(m);
			return searchMusicBySinger;
		}
		System.out.println("검색결과가 없습니다.");
		return null;
	}
//8. 서브메뉴 - 각 정렬 메소드 : Comparable/Comparator 인터페이스를 적절히 활용할 것
	public List <Music> orderby(Comparator<Music> c){
		list.sort(c);  	//sort 정렬 구간 
		return list;
		
	}


	public void searchMusicByTitle(Comparator<Music> reversed) {
		// TODO Auto-generated method stub
		
	}

	public void searchMusicBySinger(Comparator<Music> reversed) {
		// TODO Auto-generated method stub
		
	}
	
}
