package polimorfismo;

public class PolimorfismoTest {

	public static void main(String[] args) {
		
		Gerente gen = new Gerente("Marcelo", 5000, 2500);
		Vendedor Ven = new Vendedor("Jorge", 2000, 35000);
		Vendedor ven1 = new Vendedor("Carlos" , 2000, 45000);
		Vendedor ven2 = new Vendedor("João", 2000, 56000);
		RelatorioPagamento relatorio = new RelatorioPagamento();
		
		/*
		relatorio.relatorioPagamentoGerente(gen);
		System.out.println("---------------------------------------------------");
		relatorio.relatorioPagamentoVendedor(Ven);
		System.out.println("---------------------------------------------------");
		relatorio.relatorioPagamentoVendedor(ven1);
		System.out.println("---------------------------------------------------");
		relatorio.relatorioPagamentoVendedor(ven2);
		*/
		
		relatorio.relatorioPagamentoGenerico(gen);
		System.out.println("---------------------------------------------------");
		
		
		
	
		relatorio.relatorioPagamentoGenerico(Ven);
		System.out.println("---------------------------------------------------");
		relatorio.relatorioPagamentoGenerico(ven1);
		System.out.println("---------------------------------------------------");
		relatorio.relatorioPagamentoGenerico(ven2);
		System.out.println("---------------------------------------------------");
	
		
		/*
		Funcionario fun = gen;
		System.out.println("---------------------------------------------------");
		System.out.println(fun.getSalario());
		*/
	}

}
