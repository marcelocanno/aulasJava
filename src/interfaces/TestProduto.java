package interfaces;

public class TestProduto {

	public static void main(String[] args) {
		
		Produto pro = new Produto("notebook", 5,4000);
		pro.calculaImposto();
		pro.calculaFrete();
		System.out.println(pro);
		
	}

}
