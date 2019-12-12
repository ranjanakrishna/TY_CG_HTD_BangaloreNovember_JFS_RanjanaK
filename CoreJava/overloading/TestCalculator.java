package overloading;

public class TestCalculator {

	public static void main(String[] args) {
		Calculator c1= new Calculator();
		int r1=c1.add(10);
		System.out.println(r1);
		
		int r2=c1.add(22,7);
		System.out.println(r2);
		
		double r3=c1.add(20.5);
		System.out.println(r3);
		
		Calculator.mul(23);
		Calculator.mul(22,3);
		Calculator.mul(22.33);
	}

}
