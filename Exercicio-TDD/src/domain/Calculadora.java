package domain;

public class Calculadora {
	private int acumulador;
	
	public Calculadora() {
		acumulador=0;
	}

	public Integer somar(Integer i, Integer j) {
		acumulador = i + j;
		return acumulador;
	}

	public Integer subtrair(Integer i, Integer j) {
		acumulador = i - j;
		return acumulador;
	}

	public Integer somar(Integer i) {
		acumulador = acumulador + i;
		return acumulador;
	}

	public Integer subtrair(Integer i) {
		salvar(-i);
		return acumulador;
	}
	private void salvar(int valor) {
		acumulador += valor;
	}
}
