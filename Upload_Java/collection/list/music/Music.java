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
	
}
