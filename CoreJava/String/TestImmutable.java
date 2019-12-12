
public class TestImmutable {
	 public static void main(String[] args) {
		Immutable i1=new Immutable(25,"john");
		System.out.println(i1.hashCode());
		
		i1=new Immutable(25, "mikel");
		System.out.println(i1.hashCode());
		
		int age=i1.getAge();
		System.out.println("age is: "+age);
		String name=i1.getName();
		System.out.println("name is:" +name);
	}
}
