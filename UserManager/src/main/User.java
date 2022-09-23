package main;

/*
 * 날짜 : 2022/09/23
 * 이름 : 박종협
 * 내용 : 프로그래밍 언어 응용_문제 4. 프로그램 작성
 */
public class User {
	private String uid;
	private String name;
	private String hp;
	private int age;
	
	public String getUid() {
		return uid;
	}
	
	public void setUid(String uid) {
		this.uid = uid;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getHp() {
		return hp;
	}
	
	public void setHp(String hp) {
		this.hp = hp;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return uid+","+name+","+hp+","+age;
	}
}
