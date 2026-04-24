package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {


Calculadora calc;
@BeforeEach
void configure() {
	
	calc = new Calculadora();
}

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
	
}
