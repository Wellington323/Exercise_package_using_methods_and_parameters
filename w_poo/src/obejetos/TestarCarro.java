package obejetos;

public class TestarCarro {

	public static void main(String[] args) {

		Carro c1 = new Carro();

		c1.name = "Argo";
		c1.ano = 2018;
		c1.cor = "Azul";
		c1.velo = 60;

		c1.acelerar(10);
		System.out.println("Velocidade: " + c1.velo + " Km/h");

		c1.freiar(15);
		System.out.println("Reduzindo Para: " + c1.velo + " km/h");
		
		
		c1.buzinar();  

	} 

}
