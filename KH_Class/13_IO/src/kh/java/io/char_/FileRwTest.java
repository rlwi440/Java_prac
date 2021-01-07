package kh.java.io.char_;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileRwTest {

	public static void main(String[] args) {
		FileRwTest f = new FileRwTest();
		f.test1();
		f.test2();
	}
	/**
	 * try...with...resource구문(jdk 1.7)
	 * 
	 * 보조스트림을 이용한 처리
	 */
	private void test2() {
		File f = new File("test.txt");
		File dest = new File("char/test_copy.txt");
		
		try(
			BufferedReader br = new BufferedReader(new FileReader(f));
			BufferedWriter bw = new BufferedWriter(new FileWriter(dest));
		){
			String data = null;
			
			while((data = br.readLine()) != null) {
				System.out.println(data + ":");
				bw.write(data + "\n");
			}
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	/**
	 * 문자기반 스트림 char 2byte
	 */
	private void test1() {
		// 경로상의 실제파일(없을 수 있다)을 가리키는 자바객체
		File f = new File("test.txt");
		FileReader fr = null;

		try {
			fr = new FileReader(f);

			int data = 0;

			while ((data = fr.read()) != -1) {
				System.out.print((char) data + ":");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

}
