package w_poo.Aluno;

public class Aluno {

	private String name;
	private Integer Idade; // MODIFICADORES DE ACESSO(Private.Public)

	public String getName() {
		return name;
	}
 
	public void setName(String name) {
		this.name = name;
	}

	public Integer getIdade() {
		return Idade;
	}

	public void setIdade(Integer Idade) {
		this.Idade = Idade;
		if (Idade >= 18 && Idade < 35) {
			System.out.println("Idade permitida para esse conteudo: Acima de 18 anos.");

			System.out.println(name + " Sua idade foi cadastrada com sucesso!: " + Idade);
		} else {
			System.out.println(name + "Erro! Idade invalida:" + name + "Sua idade esta fora do permitido!: " + Idade);

		} 	}

}