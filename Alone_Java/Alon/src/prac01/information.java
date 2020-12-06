
public class Information {
	/**
	 * 혼자연습하는공간  @author,@date, 
	 * @author 깔끔한청년
	 * @date 2020.12.06
	 * 
	 *
	 **/

	public static void main(String[] args) {
		/**
		 * @param name,number,telephone
		 * @throws Scanner 입력과 출력 
		 * @return 입 출려 코드를 작성
		 */
		Scanner scanner= new Scanner(System.in);
			System.out.println("[필수정보입력]");
			
			System.out.print("1.이름 : ");
			String name = scanner.nextLine();
			System.out.println("2.주민번호 앞 6자리 : ");
			String num = scanner.nextLine();
			System.out.println("전화번호 :");
			String tel = scanner.nextLine();
			
			System.out.println();
			
			System.out.println("[입력한내용]");
			System.out.println("이름 : "+name);
			System.out.println("주민번호 앞 6자리  : "+num);
			System.out.println("전화번호: "+tel);
		}
	}