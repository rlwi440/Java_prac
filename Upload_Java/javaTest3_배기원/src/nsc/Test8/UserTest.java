package nsc.Test8;

public class UserTest {

	public static void main(String[] args) {
		User [] users =new User[3];
		users[0] =new User("user01", "pass01","김철수",32 ,'M',"010-1234-5678");
		users[1] =new User("user02", "pass02","이영희",25 ,'F',"010-1234-777");
		users[2] =new User("user03", "pass03","황진이",20,'F',"010-9874-5632");
		System.out.println("======================================================");
		for(int i=0; i<users.length; i++) {
			System.out.println(users[i].toString());
			User[] copyUsers = new User[users.length];
			for(int j=0; j<copyUsers.length;j++) {
				copyUsers[j]=(User)users[j].clone();
				//users 가 참조하는 객체들의 복사본을 만든다. - for 문을 이용 할 것
			}
			for(User s:copyUsers) {
				System.out.println(s.toString());
				//copyUsers 의 객체 정보를 모두 출력한다 – for each 문을 이용할 것
			}
			System.out.println("비교결과==================================================");

		}
		for(int k=0; k<users.length;k++) {
			System.out.println(users[k].equals(users[k]));
		}

	}

}
