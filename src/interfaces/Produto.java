package interfaces;

public class Produto implements Tributavel, Transportavel{

	private String nome;
	private double peso;
	private double preco;
	private double precoFinal;
	private double valorFrete;
	
	public Produto(String nome, double peso, double preco) {
		super();
		this.nome = nome;
		this.peso = peso;
		this.preco = preco;
	}
	@Override
	public void calculaImposto() {
		precoFinal = this.preco + (this.preco * IMPOSTO);
	}
	@Override
	public void calculaFrete() {
		this.valorFrete = this.preco / peso * 0.1;
	}
	@Override
	public String toString() {
		return "Produto [nome = " + nome + ", peso = " + peso + ", preco = " + preco + ", precoFinal com imposto = " + precoFinal
				+ ", valorFrete = " + valorFrete + "]";
	}
	public double getPrecoFinal() {
		return precoFinal;
	}
	
	public double getValorFrete() {
		return valorFrete;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getPreco() {
		return preco;
	}
	public void setPre�o(double preco) {
		this.preco = preco;
	}
	
	
	
	
}
