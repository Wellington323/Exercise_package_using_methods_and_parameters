package w_poo.Pessoa;

public class Pessoa {
    
	private String name;
	private Integer idade;
	
	
	Pessoa(){ 
		
	}


	public String getName() {
		return name;
	} 


	public void setName(String name) {
		this.name = name;
	}


	public Integer getIdade() {
		return idade;
	}


	public void setIdade(Integer idade) {
		this.idade = idade;
		if(idade>0 && idade>=18) {
			System.out.println(name +" Idade Permitida! ");
		}else {
			System.out.println("Erro! " + name + " Sua idade não é permitida: " + idade );
		}
	}
	
	
}
