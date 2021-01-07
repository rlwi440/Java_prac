package com.collection.map.student;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;
import java.util.Set;

public class StudentProperties {

	public static void main(String[] args) {
		StudentProperties t = new StudentProperties();
		t.start();
	}

	public void start() {
		try {
			List<Student> stdtList = readFile();

			printConsole(stdtList);

			// saveXMLFile(stdtList);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void saveXMLFile(List<Student> stdtList) throws FileNotFoundException, IOException {
		Properties prop = new Properties();
		for (Student s : stdtList) {
			String info = s.getSno() + "," + s.getSname() + "," + s.getKor() + "," + s.getEng() + "," + s.getMath();
			prop.setProperty(String.valueOf(s.getSno()), info);
		}

		// 파일에 쓰기
		prop.storeToXML(new FileOutputStream("student.xml"), "StudentProperties에서 만든 xml파일입니다.");
	}

	public void printConsole(List<Student> stdtList) {
		int korSum = 0, engSum = 0, mathSum = 0;
		System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s\n", "학번", "이름", "국어", "영어", "수학", "총점", "평점");
		System.out.println(
				"----------------------------------------------------------------------------------------------------------------------");
		for (Student s : stdtList) {
			korSum += s.getKor();
			engSum += s.getEng();
			mathSum += s.getMath();
			System.out.printf("%-10d %-10s %-10d %-10d %-10d %-10d %-10.1f\n", s.getSno(), s.getSname(), s.getKor(),
					s.getEng(), s.getMath(), s.getSum(), s.getAvg());
		}
		int size = stdtList.size();
		System.out.println(
				"----------------------------------------------------------------------------------------------------------------------");
		System.out.printf("%-20s %-10d %-10d %-10d", "과목별평균점수", korSum / size, engSum / size, mathSum / size);

	}

	public List<Student> readFile() throws FileNotFoundException, IOException {
		
		List<Student> list = new ArrayList<>();
		
		Properties prop = new Properties();
		prop.load(new FileReader("score.txt"));
//		prop.load(new FileInputStream("score.txt"));//한글깨짐. 사용하지 말것
		
		//prop.list(System.out);
		
		
		//Properties는 map계열이므로, iterator를 지원하지 않는다.
		//Enumeration을 통해 접근할 수 있다.
		Enumeration<?> en = prop.propertyNames();
		while(en.hasMoreElements()){
			String key = (String)en.nextElement();
			String value = prop.getProperty(key);
			String[] info = value.split(",");
			int sno = Integer.parseInt(info[0]);
			String sname = info[1];
			int kor = Integer.parseInt(info[2]);
			int eng = Integer.parseInt(info[3]);
			int math = Integer.parseInt(info[4]);
			Student s = new Student(sno, sname, kor, eng, math);
			list.add(s);
		}

		//keySet이용방식
		Set<String> keySet = prop.stringPropertyNames();
		
		for(String key : keySet) {
			String value = prop.getProperty(key);
			//"1,홍길동,80,90,85"
			String[] arr = value.split(",");
			Student s
				= new Student(
						Integer.parseInt(arr[0]),
						arr[1],
						Integer.parseInt(arr[2]),
						Integer.parseInt(arr[3]),
						Integer.parseInt(arr[4])
					);
			list.add(s);
		}
		return list;
	}

}
