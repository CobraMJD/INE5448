package domain;

public class Projeto {

	private static String nome = null;
	private Funcionario func = null;

	public Projeto(String string) {
		nome = string;
	}

	public String nome() {
		// TODO Auto-generated method stub
		return nome;
	}

	public String mostraFuncionarioDoProjeto() {
		String nomeFuncionario = func.nome();
		return nomeFuncionario;
	}

	public void associaFuncionario(Funcionario func2) {
		this.func = func2;
		
	}

}
