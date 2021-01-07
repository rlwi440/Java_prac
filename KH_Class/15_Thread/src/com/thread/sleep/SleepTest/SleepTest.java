package com.thread.sleep.SleepTest;

/**
 * - 실행용클래스 com.thread.sleep.SleepTest + sendAphorism() : void
 * - 좋아하는 속담, 경구 10개를 문자열배열에 담고, 3초마다 랜덤하게 출력하세요. - 10번 출력후 종료하세요.
 * @author 깔끔한청년
 * @Date 2021.01.06
 */
public class SleepTest {
	public static void main(String[] args) {
	SleepTest s =new SleepTest();
	s.sendAphorism();
}
	public void sendAphorism() {
		String[] s=new String[10];	//10개 객체 생성 
		s[0]=" 늦었을다고 생각할때가 진짜 늦었다  ";
		s[1]="가는말이 고우면 얕본다";
		s[2]="세번 참으면 호구된다";
		s[3]="어려운길은 길이 아니다";
		s[4]="잘생긴놈은 얼굴값하고 못생긴놈은 꼴값한다";
		s[5]="고생끝에 골병난다";
		s[6]="즐길수 없으면 피해라";
		s[7]="일찍 일어나는 새가 피곤하다";
		s[8]="헌신하면 헌신짝이 된다";
		s[9]="포기하면 편하다";
		
		for(int i=0; i<10; i++) {
			int ki =(int)(Math.random()*10);
			System.out.println(s[ki]);  //배열은 인덱스
			try {
				Thread.sleep(3000);  //3초
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
		
	
		
		