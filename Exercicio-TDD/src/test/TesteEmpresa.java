package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import domain.Empresa;
import domain.Funcionario;
import domain.Projeto;

class TesteEmpresa {
	private Empresa empresa1;
	
	@BeforeEach
	public void configurar() {
		empresa1 = new Empresa();
	}

	@Test
	void novaEmpresa() {
		boolean criou = empresa1.novaEmpresa("Acer");
		assertTrue(criou);
	}
	@Test
	void cadastraProjetoNaEmpresa() throws Exception {
		Projeto proj = new Projeto("Aspire");
		boolean criou = empresa1.cadastraProjeto(proj);
		assertTrue(criou);
	}
	@Test
	void mostraNomedaEmpresa() throws Exception {
		empresa1.novaEmpresa("Acer");
		String nome = empresa1.mostraNome();
		assertEquals(nome, "Acer");
	}
	@Test
	void retornaNomedoProjetoDaEmpresa() throws Exception {
		Projeto proj = new Projeto("Aspire");
		empresa1.cadastraProjeto(proj);
		String nomeProjeto = empresa1.mostraNomeProjeto();
		assertEquals(nomeProjeto, "Aspire");
	}
	@Test
	void cadastraFuncionarioNaEmpresa() throws Exception {
		empresa1.novaEmpresa("Acer");
		Funcionario func = new Funcionario("Jo�o");
		//Novo metodo
		empresa1.cadastraFuncionario(func);
		Funcionario funcDaEmpresa = empresa1.getFuncionario();
		String nomeFuncionarioCadastrado = funcDaEmpresa.nome();
		assertEquals(nomeFuncionarioCadastrado, "Jo�o");
	}
	@Test
	void associaFuncionarioComProjeto() throws Exception {
		empresa1.novaEmpresa("Acer");
		Funcionario func = new Funcionario("Jo�o");
		empresa1.cadastraFuncionario(func);
		Projeto proj = new Projeto("Aspire");
		empresa1.cadastraProjeto(proj);
		//Novos metodos
		empresa1.associaFuncionarioProjeto(func, proj);
		String nomeFuncionarioDoProjeto = proj.mostraFuncionarioDoProjeto();
		String nomeDoProjetoAssociado = func.mostraProjetoDofuncionario();
		assertEquals(nomeFuncionarioDoProjeto, "Jo�o");
		assertEquals(nomeDoProjetoAssociado, "Aspire");
	}

}
