package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class CalculadoraTest {


Calculadora calc;
@BeforeEach
void configure() {
	
	calc = new Calculadora();
}

/*
@Test
void testSomaInteiros() {
		
	//Execução
	int resultadoSoma = calc.somaInteiros(2, 2);

	//verificação
	assertEquals(5, resultadoSoma);
}

@Test
void testDividirInteiros() {
		
	//Execução
	int resultadoDivisao = calc.divideInteiros(10, 5);
	
	//verificação
	assertEquals(2, resultadoDivisao, "resultado incorreto");
}
*/


@ParameterizedTest
@ValueSource(ints = {2, 4, 6, 1000, 3330, 15})
void testTestaPar(int numero) {
	
	assertTrue(calc.testaPar(numero), "O número " + numero + "deveria ser par");
}

@Test
void testTestaDivisaoPorZero() {
	
	ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
		
		calc.divideInteiros(10, 0);
	});
	
	assertEquals("Divisão por zero não permitida", exception.getMessage());
}

@Test
void testDesconto5() {
	
	int desconto = calc.descontoProgressivo(9);
	assertEquals(5, desconto);
}

@Test
void testDesconto10() {
	
	int desconto = calc.descontoProgressivo(19);
	assertEquals(10, desconto);
}

@Test
void testDesconto15() {
	
	int desconto = calc.descontoProgressivo(29);
	assertEquals(15, desconto);
}
	
}
