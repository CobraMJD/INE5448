package domain;

public class Empresa {

	private String nome;
	private Projeto projeto;
	private Funcionario funcionarios;

	public boolean novaEmpresa(String string) {
		nome = string;
		return true;
	}

	public boolean cadastraProjeto(Projeto proj) {
		projeto = proj;
		return true;
	}

	public String mostraNome() {
		return nome;
	}

	public String mostraNomeProjeto() {
		String nomeProjeto = projeto.nome();
		return nomeProjeto;
	}

	public void cadastraFuncionario(Funcionario func) {
		funcionarios = func;
		
	}

	public Funcionario getFuncionario() {
		// TODO Auto-generated method stub
		return funcionarios;
	}

	public void associaFuncionarioProjeto(Funcionario func, Projeto proj) {
		proj.associaFuncionario(func);
		func.associaProjeto(proj);
		
	}

}
