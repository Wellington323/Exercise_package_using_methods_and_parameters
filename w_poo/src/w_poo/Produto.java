package w_poo;

public class Produto {

	String name;
	String marca;
	float valor;

	// Construtores
	Produto() {
 
	}

	Produto(String name) {
		this.name = name;

	}

	Produto(String name,String marca) {
		this.marca = marca;
		this.name = name;

	}

	Produto(String name, String marca,float valor) {
		this.valor = valor; 
		this.marca = marca;
		this.name = name;
	}

	

	}

