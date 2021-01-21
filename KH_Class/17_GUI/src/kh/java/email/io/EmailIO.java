package kh.java.email.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import kh.java.email.model.vo.Email;

/**
 * 직접파일에 접근하는  성격의코드를 작성 
 * 
 *
 */
public class EmailIO {

	File f = new File("emailList.txt");
	
	/**
	 * emailList.txt에 Email객체 추가하기
	 * 
	 * @param email
	 */
	public void insertEmail(Email email) {
		//기존정보 읽어오기 
		List<Email>list =loadEmailList();
		list.add(email);
		System.out.println("list@io.insertEmail = "+list);
		try(
			ObjectOutputStream oos = 
				new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(f)));
		){
			for(Email e: list)
			oos.writeObject(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public List<Email> loadEmailList() {
		List<Email> list = new ArrayList<>();
		
		try(
			ObjectInputStream ois = 
				new ObjectInputStream(new BufferedInputStream(new FileInputStream(f)));
		){
			while(true) {
				Email email = (Email)ois.readObject();
				list.add(email);
			} 
		}catch(FileNotFoundException e) {
			//최초등록시FileNotFoundException  발생 
				
		} catch (EOFException e) {
			//처리코드 없음.
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}

	
}


	