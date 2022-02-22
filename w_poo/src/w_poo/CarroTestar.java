package w_poo;

public class CarroTestar {

	public static void main(String[] args) {
        
		 Carro c1 =  new Carro();
		 
		 c1.name = "Uno";
		 c1.marca = "Fiat";
		 c1.cor = "Verde";
		 c1.velo = 60;
		 c1.ano = 2015;
		 
		c1.acelerar(10); 
		 System.out.println("Velocidade: " + c1.velo + " Km/h"); 
		 
		 c1.freiar(30);
		 System.out.println("Veloccidade: " + c1.velo + " Km/h" );
		 
		 
		
	}

}
