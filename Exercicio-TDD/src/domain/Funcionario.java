package domain;

public class Funcionario {

	private String nome;
	private Projeto projeto;

	public Funcionario(String string) {
		nome = string;
	}

	public String nome() {
		return nome;
	}

	public String mostraProjetoDofuncionario() {
		String nomeProjeto = projeto.nome();
		return nomeProjeto;
	}

	public void associaProjeto(Projeto proj) {
		this.projeto = proj;
		
	}

}
