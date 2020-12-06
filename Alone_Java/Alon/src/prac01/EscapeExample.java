package parc02;

public class EscapeExample {
	/**
	 * 혼자연습하는공간  @author,@date, 
	 * @author 깔끔한청년
	 * @date 2020.12.05
	 * 
	 *
	 */

	public static void main(String[] args) {	
		/**./
		 * 사용자의 입력을 받아 그에 맞는 메소드를 불러와 출력하는 메소드 
		 * @param args
		 */
		
		/**
		 * \n 개행 . 스크린 커서 위치를 다음줄의 처음으로 옮기 10 \t 수평탭. 스크린 커서를 다음 탭으로 옮김 \r 캐리지리턴. 스크린커서의
		 * 위치를 현재 줄의 처음으로 옮긴다. 개행하지 않는다. 이 기호 다음에 오는 문자를 덮어 쒸운다. 13 \\ : 역슬래시 문자를 출력할때
		 * 사용. \" : 큰 따옴표를 출력할때 사용 \' : 작은 따옴표를 출력할때 사용
		 */
		System.out.println("번호\t이름\t직업");
		System.out.println("행단위출력\n");
		System.out.println("행단위 출력\n"); 
		System.out.println("나는\"오늘도\"연습을합니다");			//"출력용도 ex) "나는 \"~\"연습을합니다"
		System.out.println("봄\\여름\\가을\\겨울");
	}

}
