package obejetos;

public class Carro { // <-- class

	String name;
	Integer ano;
	String cor;
	Integer velo;

	// metodos // Parametos
	void acelerar(Integer aceleracao) {
		velo += aceleracao;
	}

	void freiar(Integer reduzir) {
		velo -= reduzir;
	}

	void buzinar() {
		System.out.println("Pam!!!Pam!!!");
	}
}    