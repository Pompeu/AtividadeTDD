package testes;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import test.tdd.model.bean.Validador;

public class TextValidador {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testValidarCPF() {
		assertTrue(Validador.validarCPF("00311920179"));
	}
	@Test
	public void testValidarCPFVasio() {
		assertFalse(Validador.validarCPF(""));
	}
	@Test
	public void testValidarCPFInvalido() {
		assertFalse(Validador.validarCPF("a031192017c"));
	}
	@Test
	public void testValidarCPFTamanho() {
		assertFalse(Validador.validarCPF("00300030030030303"));
	}
	@Test
	public void testValidarNome() {
		assertTrue(Validador.validarNome("Jose Maria Silva Carvalho"));
	}
	@Test
	public void testValidarNomeSemNumero() {
		assertFalse(Validador.validarNome("Jose 1Maria Silva 2Carvalho"));
	}
	@Test
	public void testValidarEmailValido() {
		assertTrue(Validador.validarEmail("jose@maria.com.br"));
	}
	@Test
	public void testValidarEmailInvalidNotPints() {
		assertFalse(Validador.validarEmail("jose@maria"));
	}
	
	@Test
	public void testValidarIntervaloMatriculaMenor() {
		assertFalse(Validador.validarIntervaloNunmeroMatricula(50));
	}
	@Test
	public void testValidarIntervaloMatriculaMaior() {
		assertFalse(Validador.validarIntervaloNunmeroMatricula(210000+1));
	}

}
