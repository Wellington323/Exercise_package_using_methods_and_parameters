package w_poo.Aluno;

public class TestaALuno {

	public static void main(String[] args) {

		// Set e Get
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
 
		aluno1.setName("\nFernando: ");
		aluno1.setIdade(18);

		// aluno1.idade = 20;

		aluno2.setName("\nLucas: ");
		aluno2.setIdade(15);

		System.out.println(aluno1.getName());
		System.out.println("Idade: " + aluno1.getIdade());

		System.out.println(aluno2.getName());
		System.out.println("Idade: " + aluno2.getIdade());
	}

}
