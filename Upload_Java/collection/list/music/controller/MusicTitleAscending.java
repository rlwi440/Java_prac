package com.collection.list.music.controller;

import java.util.Comparator;

import com.collection.list.music.Music;

public class MusicTitleAscending  implements Comparator<Music>{
	//제목 오름차순
	//
	@Override
	public int compare(Music o1, Music o2) {
		return o1.getSinger().compareTo(o2.getSinger());
	}

}
