package w_poo.Pessoa;

import java.util.Scanner;

public class Testar_pessoa {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
		
	
      Pessoa pessoa1 = new Pessoa();
      
         // pessoa1.idade = 12;    
        pessoa1.setName("Paulo: "); 
        pessoa1.setIdade(18);
        
          System.out.println(pessoa1.getName()); 
          System.out.println(pessoa1.getIdade()); 
	}

} 