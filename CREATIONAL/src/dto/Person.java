package dto;

public class Person {

	private String name;
	private int ssn;
	private String address;
	private int age;
	private String sex;

	public Person() {
	}

	public Person(String name, int ssn, String address, int age, String sex) {
		super();
		this.name = name;
		this.ssn = ssn;
		this.address = address;
		this.age = age;
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", ssn=" + ssn + ", address=" + address + ", age=" + age + ", sex=" + sex + "]";
	}

}
