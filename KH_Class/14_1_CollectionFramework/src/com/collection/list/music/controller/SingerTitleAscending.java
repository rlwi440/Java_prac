package com.collection.list.music.controller;

import java.util.Comparator;

import com.collection.list.music.Music;

public class SingerTitleAscending implements Comparator<Music>  {
	//가수 오름차순

	@Override
	public int compare(Music o1, Music o2) {
		// TODO Auto-generated method stub
		return o1.getTitle().compareTo(o2.getTitle());
	}
	

}
