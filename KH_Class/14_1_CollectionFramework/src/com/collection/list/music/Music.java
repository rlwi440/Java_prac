package com.collection.list.music;

import java.util.Comparator;

import com.collection.list.music.controller.MusicTitleAscending;
import com.collection.list.music.controller.SingerTitleAscending;

/**
	2. 실행클래스(메인메소드 포함)
	@com.collection.list.music.run.Run.java	
 */
public class Music {
	private String  title ;
	private String  singer ;
	
	public Music(String title, String string) {
		super();
		this.title = title;
		this.singer = string;
	}
	
	public Music(MusicTitleAscending musicTitleAscending, String singer2) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Music [title=" + title + ", singer=" + singer + "]";
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer; 
	}
	/**
 	@Override
	public int compareTo(Music o) {
		return this.singer.compareTo(o.singer);
		@Override
	public int hashCode() {
		return Objects.hash(singer, title);
	}
	*/

@Override
public boolean equals(Object obj) {
	//주소값이 같다면, 동일한 객체 
	if (this == obj)
		return true;
	//현재객체는 null이고 ,obj는 null
	if (obj == null)
		return false;
	//instanceof와 동일.같은타입인지 비교 
		if (getClass() != obj.getClass())
		return false;
	//형변환을 ClassException 없이 변환할수있다.
	Music other = (Music) obj;
	//참조형 
	//1. null 비교 
	if (singer == null) {
		if (other.singer != null)
			return false;
	} else if (!singer.equals(other.singer))
		return false;
	
	if (title == null) {
		if (other.title != null)
			return false;
	} else if (!title.equals(other.title))
		return false;
	return true;
}

}
