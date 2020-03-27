package builder;

public class Client {

	public static void main(String[] args) {

		Person p = new Person.PersonBuilder("Joydeep Chowdhury", 894949, "CL 266 Sector 2 Salt Lake Kolkata").setAge(26)
				.setSex("M").build();
		System.out.println(p);
	}
}