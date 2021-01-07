package kh.java.object.array.person;

import java.util.Scanner;

/**
 * 연관관계
 * PersonManager 는 Person 을 field 로 써 참조한다.
 * PersonManager ───────> person
 *
 */
public class PersonManager {
	private Person [] arr =new Person[3];
	Scanner sc= new Scanner(System.in);
	
	
	
	/**
	 * person 정보
	 */
	public void inputPerson() {
		  for(int i = 0; i < arr.length; i++) {
	          System.out.println(" ------" +(i+1)+ "--------");
	          System.out.println("이름 : ");
	            String name = sc.next();
	           System.out.println("나이 : ");
	            int age = sc.nextInt();
	            arr[i] = new Person(name, age);
	        }
	}
	/**
	 * Person 
	 */

	
	public void printPerson() {
		  for(Person x : arr) 
	            x.printPerson();
	    
	}
}

