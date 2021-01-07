package kh.java.io.byte_.object;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;

public class ObjectIoTest {

	public static void main(String[] args) {
	ObjectIoTest O = new ObjectIoTest();
	O.test1();
	O.test2();
	System.out.println("=====열심히 하자 ====");
	}


	private void test2() {
		File f = new File("object/user.ser");
		try(
				ObjectInputStream ois=
				new ObjectInputStream (
					new BufferedInputStream(new FileInputStream(f)
							)	
					); 
				){
				while(true) {
				System.out.println(ois.readObject());  
				
				}
		}catch(EOFException e) {
			
			System.out.println("파일 읽어오기 완료!!");
		}
				catch (IOException | ClassNotFoundException e) {		//멀티 
					e.printStackTrace();
				}
	}


	private void test1() {
		
		File f = new File("object/user.ser");
		
		try(
			ObjectOutputStream oos = 
				new ObjectOutputStream(
						new BufferedOutputStream(
								new FileOutputStream(f)));
		){
			
			User u1 = new User("rlwi440", "1234", "깔끔이", Calendar.getInstance());
			User u2 = new User("rlwi441", "1234", "신사임당", Calendar.getInstance());
			User u3 = new User("rlwi442", "1234", "세종대왕", Calendar.getInstance());
			
			oos.writeObject(u1);
			oos.writeObject(u2);
			oos.writeObject(u3);
			System.out.println("객체 쓰기 완료 !!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
