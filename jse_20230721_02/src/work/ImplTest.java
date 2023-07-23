package work;

public class ImplTest {

	public static void main(String[] args) {
		
		// 다형성 
		// 참조 자료형  => 사용 멤버 달라짐
		President work1 = new Clerk();
		work1.orderFromPresident();
		
		// VicePresident work2 = new Clerk();
		Director work2 = new Clerk();
		work2.orderFromVicePresident();

	}
}

