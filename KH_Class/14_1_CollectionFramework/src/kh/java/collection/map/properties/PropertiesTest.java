package kh.java.collection.map.properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

/**
 * Properties
 * K,V를 타입을 Stirng,Stirng으로 제한한map 
 * 
 * -파일 입출력 메소드를 지원 
 * -설정정보를 표현에 최적의 형태 
 * 
 *
 */
public class PropertiesTest {

	public static void main(String[] args) {
		PropertiesTest p =new PropertiesTest();
		p.test1();
		p.test2();

	}
	/**
	 * 입력
	 * FileReader 
	 */

	private void test2() {
		Properties prop =new Properties();
		try {
			//prop.load(new FileReader("userInfo.properties"));
			prop.loadFromXML(new FileInputStream("userInfo.xml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	//	System.out.println(prop);
		//1.요소 가져오기
		String url =prop.getProperty("url");
		String userName =prop.getProperty("userName");
		String userPassWord =prop.getProperty("userPassWord");
		System.out.println(url);
		System.out.println(userName);
		System.out.println(userPassWord);
		//2.전체열람 메소드 
		Enumeration<?> en =prop.propertyNames();
		while(en.hasMoreElements()) {
			String name =(String)en.nextElement();
			String value =prop.getProperty(name);
			System.out.println(name + " =" +value);
			}
	}
	
	/**
	 * 출력 
	 * 
	 */
	private void test1() {
		Properties prop =new Properties();
		prop.setProperty("url", "http://localhost:9090/kh-java");
		prop.setProperty("userName", "rlwiwi");
		prop.setProperty("userPassWord", "12345*&");
		System.out.println(prop);
		//파일에 저장 
		//.properties
		//.xml
		try {
			//파일에 저장 ,xml,properties 
		//	prop.store(new FileWriter("userInfo.properties"),"userInfo.properties");
			prop.storeToXML(new FileOutputStream("userInfo.xml"),"userInfo.xml");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
