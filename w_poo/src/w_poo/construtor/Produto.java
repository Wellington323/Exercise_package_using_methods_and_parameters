package w_poo.construtor;

public class Produto {
	String name;
	String marca;
	Integer valor;

	Produto() {

	}

	// CONST | PARAM
	private Produto(String name) { 
		this.name = name;
	}

	Produto(String name, String marca) {
		this.name = name;
		this.marca = marca;
	}

	Produto(String name, String marca, Integer valor) {
		this.name = name;
		this.marca = marca;
		this.valor = valor;

	}

}
