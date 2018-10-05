package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import domain.*;

class testTDD {
	private Calculadora calculadora;
	
	@BeforeEach
	public void configurar() {
		calculadora = new Calculadora();
	}

	@Test
	public void somarTresMaisCinco() throws Exception{
		Integer resultado = calculadora.somar(3,5);
		assertEquals(8,resultado.intValue() );
	}
	@Test
	void somarNoveMaisNove() {
		Integer resultado = calculadora.somar(9,9);
		assertEquals(18,resultado.intValue() );

	}
	@Test
	void subtrairDoisMenosUm() throws Exception {
		Integer resultado = calculadora.subtrair(2, 1);
		assertEquals(1, resultado.intValue());
	}
	@Test
	void subtrairMenosDoisMenosUm() throws Exception {
		Integer resultado = calculadora.subtrair(-2, 1);
		assertEquals(-3, resultado.intValue());
	}
	@Test
	void somarTresAposSomarTresMaisCinco() throws Exception {
		calculadora.somar(3,5);
		Integer resultado = calculadora.somar(3);
		assertEquals(11, resultado.intValue());
	}
	@Test
	void somarQuatroAposSomarUmMaisDoisMaisTres() throws Exception {
		calculadora.somar(1, 2);
		calculadora.somar(3);
		Integer resultado = calculadora.somar(4);
		assertEquals(10, resultado.intValue());
	}
	@Test
	void subtrairDoisMenosUmMenosDois() throws Exception {
		calculadora.subtrair(2, 1);
		Integer resultado = calculadora.subtrair(2);
		assertEquals(-1, resultado.intValue());
	}

}
