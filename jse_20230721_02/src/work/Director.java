package work;

// 인터페이스는 다중 상속 가능
public interface Director extends President, VicePresident {

	@Override
	default void orderFromVicePresident() {
		// TODO Auto-generated method stub
		
	}

	// 인터페이스도 재정의(구현)가 가능 => default : 재정의(override) 가능하도록 해줌
	@Override
	default void orderFromPresident() {
		// TODO Auto-generated method stub
		System.out.println("부장님이 구현하다");
		
	}

	
	
}
