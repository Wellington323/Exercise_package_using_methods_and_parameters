package w_poo.construtor;

import java.util.Locale;

public class TestarProduto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Produto p1 = new Produto();
		p1.name = "Tenis.";
		p1.marca = "Puma.";
		p1.valor = 220;

		Produto p2 = new Produto("Tenis. ", " Nike.");
		p2.valor = 350;
		
		Produto p3 = new Produto("Tenis. ", "Adidas. ", 430);
		
		
		
		
		
		System.out.println("Nome: " + p1.name +
				" Marca: " + p1.marca + " Valor: " + p1.valor);
		System.out.println("Nome: " + p2.name +
				" Marca: " + p2.marca + " Valor: " + p2.valor);
		System.out.println("Nome: " + p3.name + 
				" Marca: " + p3.marca + " Valor: " + p3.valor);
	}
 
}
