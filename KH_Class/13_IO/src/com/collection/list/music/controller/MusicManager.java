package com.collection.list.music.controller;
/**
 * 1. 음악리스트 리턴
	selectList():List<Music>
2. 마지막에 음악추가 : 사용자로부터 곡명과 가수를 입력받아 리스트에 저장하는 메소드. 
 	addList(Music) : void
3. 맨처음에 음악추가 : 리스트 최상위(0번지)에 음악을 추가하는 메소드
 	addAtZero(Music) : void
4. 특정곡을 삭제하는 메소드(제목을 전달받아 검색후, 최초로 검색된 음악을 삭제)
   	삭제여부를 리턴
	removeMusic(String) : boolean
5. 특정곡을 바꾸는 메소드(이전 음악객체, 새 음악객체를 전달해서 교체)
    교체 성공여부를 리턴
 boolean replaceMusic(Music oldMusic, Music newMusic) : boolean
6. 특정곡이 있는지 검사하는 메소드 : 복수개의 결과가 나올수 있음. 
	(곡명일부로 검색해서 해당곡이 있다면, 곡정보(제목/가수)를 출력하고, 없다면, "검색결과가 없습니다"출력)
	searchMusicByTitle(String title) : List<Music>
7. 가수명으로 검색 메소드 : 복수개의 결과가 나올수 있음.
	searchMusicBySinger(String singer) : List<Music>
8. 서브메뉴 - 각 정렬 메소드 : Comparable/Comparator 인터페이스를 적절히 활용할 것
	orderBy(Comparator<Music> c) : List<Musice>
 */
public class MusicManager {
	
}
