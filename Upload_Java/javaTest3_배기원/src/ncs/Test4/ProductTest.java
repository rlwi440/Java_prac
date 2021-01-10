package ncs.Test4;

public class ProductTest {
	/**
	 * Product 클래스를 작성하고, 키보드로 각 필드에 기록할 값을 입력받아 객체 초기화에 사용한다.
		가격과 수량을 계산하여 구매가격을 출력한다.
	 * @author 깔끔한청년
	 * @Date 2020/01/10
	 */

	public static void main(String[] args) {
		Product p= new Product("갤럭시 s7",563500,3);		//파라미터 생성자 String ,int ,int
		System.out.println(p.information());
		System.out.println("총 구매가격은 : "+(p.getPrice()*p.getQuantity()+"원"));
	}

}
