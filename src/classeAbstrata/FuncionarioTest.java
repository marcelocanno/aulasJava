package classeAbstrata;

public class FuncionarioTest {

	public static void main(String[] args) {
		
		
		Gerente gen = new Gerente("Arthur", "2021-987", 3500);
		Vendedor ven = new Vendedor("Geraldo", "2021-876", 1500, 5000);
		ven.calculaSalario();
		gen.calcaulaSalario();
		System.out.println(gen);
		System.out.println(ven);
		
	}

}
