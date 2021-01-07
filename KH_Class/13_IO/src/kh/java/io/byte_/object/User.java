package kh.java.io.byte_.object;

import java.io.Serializable;
import java.util.Calendar;
/**
 * 직렬화 할수있는 Serializable		직렬화 할수있는 객체 
 * 객체 입출력 스트림에서 사용되어질 객체는 반드시  Serializable 을구현해야한다.
 * 그렇지않으면 ,NotSerializableException 을발생시킨다.+
 *
 */

public class User implements Serializable {
	/**
	 * 클래스 별 고유번호

	 */
	//implements 상속
private String id;
// 객체 입출력스트림에서 해당값을 전송하지 않는다.
private transient String password;	//transient 보안용 Null을 사용한다.
private String name;
private Calendar regDate;
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User(String id, String password, String name, Calendar regDate) {
	super();
	this.id = id;
	this.password = password;
	this.name = name;
	this.regDate = regDate;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
 
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Calendar getRegDate() {
	return regDate;
}
public void setRegDate(Calendar regDate) {
	this.regDate = regDate;
}
@Override
public String toString() {
	return "User [id=" + id + ", password=" + password + ", name=" + name + ", regDate=" + regDate + "]";
}

}
