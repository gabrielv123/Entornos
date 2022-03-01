package test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import par_impar.par_impar;

class testPar_impar {

	@ParameterizedTest
	@ValueSource(ints = {1050, 1700, 1560, 1222, 1444, 1998 })
	void testParTrue(int numero) {
	    assertTrue (par_impar.par(numero));
	}
	
	@ParameterizedTest
	@ValueSource(ints = {1000, 2000 })
	void testLimiteTrue(int numero) {
	    assertTrue (par_impar.par(numero));
	}
	
	@ParameterizedTest
	@ValueSource(ints = {1, 2, 43, 666, 888, 555555, 93434,999,2001})
	void testImpar_fueraRango(int numero) {
	    assertFalse (par_impar.par(numero));
	}

	@ParameterizedTest
	@ValueSource(ints = {0, -124, -2000, -1000 -5665})
	void testNegativo(int numero) {
	    assertFalse (par_impar.par(numero));
	}
}