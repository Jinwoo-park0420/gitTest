package gitTest;

public class MemberVO {
private String bno;
private String name;
private String age;

public String getBno() {
	return bno;
}
@Override
public String toString() {
	return "MemberVO [bno=" + bno + ", name=" + name + ", age=" + age + ", getBno()=" + getBno() + ", getName()="
			+ getName() + ", getAge()=" + getAge() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ ", toString()=" + super.toString() + "]";
}
public void setBno(String bno) {
	this.bno = bno;
}
public String getName() {
	return name;
}
@Override
public String toString() {
	return "MemberVO [bno=" + bno + ", name=" + name + ", age=" + age + ", getBno()=" + getBno() + ", getName()="
			+ getName() + ", getAge()=" + getAge() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ ", toString()=" + super.toString() + "]";
}
public void setName(String name) {
	this.name = name;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}

}
