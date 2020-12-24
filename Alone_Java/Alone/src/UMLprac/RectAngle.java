package com.kh.test.shpe.model.vo;
import com.kh.test.shpe.model.vo.Circle;
import com.kh.test.shpe.model.vo.RectAngle;

public class ShapeMaker{
    /**
     * 단계별 코드 조치내용 [완성하여 ]제출 연습 이해완료 
     * @author 깔끔한 청년
     * @Date 2020.12.24 
     */
	public static void main(String[] args) {
		
	Circle [] ki = new Circle[3];
	ki[0]= new Circle(10);
	ki[1]= new Circle(40);
	ki[2]= new Circle(50);
		
	for(Circle s :ki ) {
		s.draw();
	}

	RectAngle[ ]ki1 =new RectAngle [2];
		ki1[0]=new RectAngle(10,20);
		ki1[1]=new RectAngle(50,60);
	
		for(RectAngle s1: ki1) {
			s1.draw();
		}
	}
}
	