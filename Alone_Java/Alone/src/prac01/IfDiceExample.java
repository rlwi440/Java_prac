package prac04;

public class IfDice {
    /**
     * @author 깔끔한청년
     * @date 2020.12.07
     */
	public static void  main(String[]args) {
        /**
         * @param Math.random()
         * @throws  임의의 정수를 뽑고,Math.random()메소드로 활용
         */
		int num = (int) (Math.random()*6)+1;
		
		if(num==1) {
			System.out.println("1번이 나왔습니다");
		}else if (num==2) {
			System.out.println("2번이 나왔습니다");
		}else if (num==3) {
			System.out.println("3번이 나왔습니다");
		}else if(num==4) {
			System.out.println("4번이 나왔습니다");
		}else if(num==5) {
			System.out.println("5번이 나왔습니다");
		}else {
			System.out.println("6번이 나왔습니다");
		}
	}

}
