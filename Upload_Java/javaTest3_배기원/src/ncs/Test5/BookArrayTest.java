package ncs.Test5;

public class BookArrayTest {
	/**
	 * 3개의 Book 객체를 배열로 생성하여 각각의 정보와 할인된 가격을 출력한다.
	 * @author 깔끔한청년
	 * @Date 2020/01/10
	 */
	public static void main(String[] args) {
		Book bArray[]=new Book[3];
		bArray[0]= new Book("자바의정석","남궁성","도우출판 ",30000,0.1);
		bArray[1]= new Book("열혈강의 자바","구정은","기도출판",29000,0.1);
		bArray[2]= new Book("JAVA8","금영웅","도기출판 ",30000,0.1);
		for(int i=0; i<bArray.length;i++) {
			System.out.println(bArray[i].getTitle()+" ," +bArray[i].getAuthor()+" ,"
					+bArray[i].getPublisher()+" ,"+bArray[i].getPrice()+"원 "+bArray[i].getDiscountRate()+"%할인 ");
			System.out.println("할인된 가격  : "+(int)(bArray[i].getPrice()
					-(bArray[i].getPrice()*bArray[i].getDiscountRate()))+"원");//할인된 가격 :가격 -10%세일 
		}
		

	}

}
