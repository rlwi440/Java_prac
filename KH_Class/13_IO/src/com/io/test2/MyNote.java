package com.io.test2;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.annotation.processing.FilerException;

public class MyNote {
private Scanner sc =new Scanner(System.in);

public void fileSave() {
	//1. "파일에 저장할 내용을 입력하시오"  출력
	System.out.println("파일에 저장할 내용을 입력하시오 ");
	StringBuilder sb =new StringBuilder();
	while(true) {		//반복문 
		String s= sc.nextLine();
		if(s.equals("exit"))
				break;
		sb.append(s);
	}
	System.out.println("저장하시겠습니까 (y/n): ");
	//	5. 입력값이 대소문자 상관없이 'Y' 이면, "저장할 파일명 : " 출력
	if(sc.next().equalsIgnoreCase("y"));//equalsIgnoreCase 대소문자 구분없이 
	BufferedWriter bu= null; 
	try {
	sc.nextLine();
	System.out.println("저장할파일명: ");
	String title =sc.nextLine();
	bu= new BufferedWriter(new FileWriter(title +"txt"));
	System.out.println("txt 파일에 성공적으로 저장하였습니다");
	}catch(IOException e){
		e.printStackTrace();
	}finally{
		try{
			bu.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	} {
		System.out.println("다시 돌아갑니다.");
	}
	public void fileopen() {
		System.out.println("열기할 파일명 :");
		String title =sc.nextLine();
		BufferedReader bf =null ;
		String baeki =null ;
		try {
			bf =new BufferedReader(new FileReader(title+ "txt"));	//파일 입력 스트림 생성
			while((baeki= bf.readLine())!=null ) {
				System.out.println(baeki ); //공부해야할부분
			}
		}catch(FilerException | FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				bf.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		
			
		}
	public void fileAppend() throws IOException  {
		/**
		 * 강사님이 풀어준 방식 아침에 일어나서 풀어보기 
		 */
		
		System.out.print("열기할 파일명 : ");
		String fileName = sc.nextLine();
		
		//파일읽어오기용 스트림생성
		BufferedReader br2 = new BufferedReader(new FileReader("test2/"+fileName));
		String data = "";
		while((data=br2.readLine())!=null)
			System.out.println(data);
		br2.close();
		
		//파일출력스트림생성.
		//파일 append여부 true 파라미터 추가.
		BufferedWriter bw = new BufferedWriter(new FileWriter("test2/"+fileName, true));
		System.out.println("파일에 추가할 내용을 입력하세요. : ");
		StringBuilder sb = new StringBuilder();
		while((data=sc.nextLine())!=null){
			if(!"exit".equals(data))
				sb.append(data+"\n");
			else 
				break;
		}
		System.out.print("저장하시겠습니까?(y/n) : ");
		String willSave = String.valueOf(sc.next().toUpperCase().charAt(0));
		
		//사용자 저장(Y)선택시, 파일쓰기.
		if("Y".equals(willSave)){
			bw.write(sb.toString());
		}	
		System.out.println(fileName+"파일이 성공적으로 변경되었습니다.");
		bw.close();
	}

	public void fileOpen() throws FileNotFoundException, IOException {
		System.out.print("열기할 파일명 : ");
		String fileName = sc.next();
		
		//파일읽어오기용 스트림생성
		BufferedReader br2 = new BufferedReader(new FileReader("test2/"+fileName));
		String data = "";
		while((data=br2.readLine())!=null)
			System.out.println(data+"\n");
		
		//스트림반납
		br2.close();
	}
}
