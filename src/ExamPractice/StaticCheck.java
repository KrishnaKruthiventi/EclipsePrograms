package ExamPractice;

public class StaticCheck {
	
	public static int a = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticCheck sc1 = new StaticCheck();
		StaticCheck sc2 = new StaticCheck();
//		sc1.a = 100;
		System.out.println(sc1.a);
		System.out.println(sc2.a);
		System.out.println(a);
		System.out.println(StaticCheck.a);
	}

}
