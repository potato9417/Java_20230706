package work;

public class Clerk implements Director {

	@Override
	public void orderFromVicePresident() {
		// TODO Auto-generated method stub
		System.out.println("사원이 부회장님 일을 구현하다");

	}

	@Override
	public void orderFromPresident() {
		// TODO Auto-generated method stub
		Director.super.orderFromPresident();
		// System.out.println("사원이 회장님 일을 구현하다");

	}

}
