package com.thread.alphabet.AlphabetTest;

public class LowerAlphbetThread extends Thread {
private char ch;
 
public LowerAlphbetThread() {
	this.ch=ch;
}
public void run() {
	for (ch='a'; ch<='z'; ch++)
		System.out.println(ch);
}

}
