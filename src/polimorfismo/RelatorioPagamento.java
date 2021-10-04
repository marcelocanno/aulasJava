package polimorfismo;

public class RelatorioPagamento {
	
	/*
	public  void relatorioPagamentoGerente(Gerente gerente) {
	System.out.println("Relatorio pagamento gerente");
	gerente.calcularPagamento();
	System.out.println("nome : " + gerente.getNome());
	System.out.println("salario do mês : " + gerente.getSalario());
	}
	public  void relatorioPagamentoVendedor(Vendedor vendedor) {
		System.out.println("Relatorio pagamento vendedor");
		vendedor.calcularPagamento();
		System.out.println("nome : " + vendedor.getNome());
		System.out.println("salario do mês : " + vendedor.getSalario());
	}
	*/
	
	public  void relatorioPagamentoGenerico(Funcionario funcionario) {
		System.out.println("Relatorio pagamento");
		funcionario.calcularPagamento();
		System.out.println("nome : " + funcionario.getNome());
		System.out.println("salario do mês : " + funcionario.getSalario());
		if(funcionario instanceof Gerente) {
			Gerente gen = (Gerente) funcionario;
			System.out.println("Participação nos lucros :" + gen.getPnl());
		}
		/*
		if(funcionario instanceof Vendedor) {
			Vendedor ven = (Vendedor) funcionario;
			System.out.println("Total de vendas :" + ven.getTotalVendas());
			
		}
		*/
		
		if(funcionario instanceof Vendedor) {
			System.out.println("Total de vendas : " + ((Vendedor) funcionario).getTotalVendas());
			
		}
	}

}
