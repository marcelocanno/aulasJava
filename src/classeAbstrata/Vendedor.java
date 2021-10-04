package classeAbstrata;

public class Vendedor extends Funcionario {
	
	private double totalVendas;
	
	public Vendedor(String nome, String clt, double salario, double totalvendas) {
		super(nome, clt, salario);
		this.totalVendas = totalvendas;
		
	}
	
	public void calculaSalario() {
		this.salario = salario + (totalVendas * 0.05);
	}
	public double getTotalVendas() {
		return totalVendas;
	}
	public void setTotalVendas(double totalVendas) {
		this.totalVendas = totalVendas;
	}

	@Override
	public void calcaulaSalario() {
		// TODO Auto-generated method stub
		
	}
	

}
