package com.io.test4.model.vo;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class BookManager implements Serializable {
	Scanner sc = new Scanner(System.in); // 필드 생성

	public BookManager() {
	}

	public void filesave() {
		File f = new File("tes4/books.dat");
		Book[] book = new Book[5];
		try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(f))) {

			Calendar c1 = new GregorianCalendar(2016, 11, 11);
			Calendar c2 = new GregorianCalendar(2017, 11, 01);
			Calendar c3 = new GregorianCalendar(2018, 11, 11);
			Calendar c4 = new GregorianCalendar(2019, 11, 11);
			Calendar c5 = new GregorianCalendar(2020, 11, 11);

			book[0] = new Book("일취월장", "신영준", 15000, c1, 0.02);
			book[1] = new Book("논어", "이지성", 15000, c2, 0.06);
			book[2] = new Book("자바의정석", "남궁성", 15000, c3, 0.02);
			book[3] = new Book("나는아직어른이되려면 멀었다", "배기원", 15000, c4, 0.02);
			book[4] = new Book("깔끔한청년", "깔끔이", 15000, c5, 0.02);

			for (int i = 0; i < book.length; i++) {
				os.writeObject(book[i]);
			}
			System.out.println("book.dat 에 저장완료");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void fileRead() {
		File f = new File("tes4/books.dat");
		try (ObjectInputStream ois = new ObjectInputStream( // 상속하는 클래스 buffer,File
				new BufferedInputStream(new FileInputStream(f)));

		) {
			Book[] book = new Book[10]; // 10개 객체 생성
			for (int i = 0; i < book.length; i++) {
				System.out.println(ois.readObject());
			}
		} catch (FileNotFoundException e) {
			System.out.println("books.dat읽기완료");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
