package ncs.Test6;

public class Calculator {
	double getsum(int data) throws InvalidException {
		double sum =0;
		if(data >1&& data<6)
			for(int i=1; i<=data; i++) {
				sum+=i;
			}else {
				throw new InvalidException("==========입력값에 오류발생=========");
			}
		return sum;
	}

}
