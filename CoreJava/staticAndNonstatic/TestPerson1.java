package staticAndNonstatic;

public class TestPerson1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person1 p1=new Person1();
		p1.age=23;
		p1.name="John";
		p1.personDetails();
		Person1 p2=new Person1();
		p2.initialize(23,"divya");
		p2.personDetails();
	}

}
