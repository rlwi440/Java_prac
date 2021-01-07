package com.thread.alphabet.AlphabetTest;

public class UpperAlphbetThread extends Thread {
private char ch ;

public UpperAlphbetThread () { //필드값 생성
 	this.ch=ch;
}


public void run() {		//대문자 출력 구간
	for(char ch ='A'; ch<='Z'; ch++)
		System.out.println(ch);
	}
}
