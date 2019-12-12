package inheritance;

public class TestA {

	public static void main(String[] args) {
		/*FirstGeneration f1=new FirstGeneration();
		f1.call();
		f1.msg();
		
		SecondGeneration s1=new SecondGeneration();
		s1.call();
		s1.msg();
		s1.radio();
		
		ThirdGeneration t1=new ThirdGeneration();
		t1.call();
		t1.msg();
		t1.camera();
		t1.radio();*/
		
		
		///////
		FirstGeneration fg=new ThirdGeneration();
		fg.call();
		fg.msg();
		
		SecondGeneration sg=new ThirdGeneration();
		sg.call();
		sg.msg();
		sg.radio();
		
		ThirdGeneration tg=new ThirdGeneration();
		tg.call();
		tg.msg();
		tg.radio();
		tg.camera();

	}

}
