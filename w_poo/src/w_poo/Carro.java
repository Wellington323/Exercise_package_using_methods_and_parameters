package w_poo;

public class Carro {
 // tipo     | //atributos  
	String name;
	String cor;
	String marca;
	Integer ano;
	Integer velo; 
	
	//métodos      //Parametros 
	void acelerar(int aceleracao) {
		velo += aceleracao;
	}
	
	void freiar(int reduzir) {
		velo -= reduzir; 
	}
	
	void buzinar(String buzinar) {
	 
		System.out.println("bibibi ");
	}
	
	
	
	
	
}

