package testes;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import test.tdd.model.bean.Pessoa;

public class TestesEventos {

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
	public void testnomeIsnotEmpyt() throws Exception {
		Pessoa p = new Pessoa();
		p.setNome("");
		assertEquals(null, p.getNome());
	}

	@Test
	public void testnomeIsNotNumeric() {
		Pessoa p = new Pessoa();
		
		try {
			p.setNome("Pompeu1");
		} catch (Exception e) {
			 e.getMessage();
		}
		assertEquals(null, p.getNome());
	}

	@Test
	public void testNomeIsValid() {
		Pessoa p = new Pessoa();
		try {
			p.setNome("Pompeu");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		assertEquals("Pompeu", p.getNome());
	}

	@Test
	public void textCPFisEmpty() {
		Pessoa p = new Pessoa();
		try {
			p.setCpf("0031192017");
		} catch (Exception e) {
			e.getMessage();
		}
		assertEquals(null, p.getCpf());
	}

	@Test
	public void textCPFisCharacterNotNumber() {
		Pessoa p = new Pessoa();
		try {
			p.setCpf("0031192017AA");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		assertEquals(null, p.getCpf());
	}

	@Test
	public void textVerificaDigitosRepetidosCPF() {
		Pessoa p = new Pessoa();
		try {
			p.setCpf("99999999999");
		} catch (Exception e) {
			e.getMessage();
		}
		assertEquals(null, p.getCpf());
	}

	@Test
	public void textIntervalOfMatricula() {
		Pessoa p = new Pessoa();
		try {
			p.setMatricula(210001);
		} catch (Exception e) {
			e.getMessage();
		}
		assertEquals(null, p.getMatricula());
	}

	@Test
	public void textEmailVasio() {
		Pessoa p = new Pessoa();
		p.setEmail("");
		assertEquals(null, p.getEmail());
	}

	@Test
	public void textEmailInvalidFormat() {
		Pessoa p = new Pessoa();
		p.setEmail("pompeu@net.com.br1");
		assertEquals(null, p.getEmail());
	}

	@Test
	public void textEmailInvalidFormat2() {
		Pessoa p = new Pessoa();
		p.setEmail("pompeu@net.com3.br1");
		assertEquals(null, p.getEmail());
	}

	@Test
	public void textEmailInvalidFormat3() {
		Pessoa p = new Pessoa();
		p.setEmail("pompeu#net.com.br");
		assertEquals(null, p.getEmail());
	}
}
