package w_poo;

public class ProdutoTeste {

	public static void main(String[] args) {

		// construtor Padrão:
		Produto p1 = new Produto();
		p1.name = "Caneta Preta ";
		p1.marca = " Bic ";
		p1.valor = 1.50f;

		Produto p2 = new Produto("Caneta Vermelha ", " Faber: "); 
		p2.valor = 1.69f;

		Produto p3 = new Produto("Borracha ", "Mercur ", 1.89f); 

		System.out.println("Nome:" + p1.name + "Marca:" + p1.marca + "Valor:" + p1.valor);
		System.out.println("Nome:" + p2.name + "Marca:" + p2.marca + "Valor:" + p2.valor);
		System.out.println("Nome:" + p3.name + "Marca:" + p3.marca + "Valor:" + p3.valor);
		
	} 

}
