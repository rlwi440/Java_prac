package ncs.Test4;

public class ProductTest {

	public static void main(String[] args) {
		Product p= new Product("갤럭시 s7",563500,3);		//파라미터 생성자 String ,int ,int
		System.out.println(p.information());
		System.out.println("총 구매가격은 : "+(p.getPrice()*p.getQuantity()+"원"));
	}

}
