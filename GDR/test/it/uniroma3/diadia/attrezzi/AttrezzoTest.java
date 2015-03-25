package it.uniroma3.diadia.attrezzi;

import static org.junit.Assert.*;
import it.uniroma3.diadia.attrezzi.Attrezzo;

import org.junit.Before;
import org.junit.Test;

public class AttrezzoTest {
	private Attrezzo attrezzoIniziale;

	@Before
	public void setUp() {
		attrezzoIniziale = new Attrezzo("arco", 8);
	}

	@Test
	public void testGetNome() {
		assertEquals("arco", attrezzoIniziale.getNome());
	}

	@Test
	public void testGetPeso() {
		assertEquals(8, attrezzoIniziale.getPeso());
	}

	@Test
	public void testToString() {
		assertEquals("arco (8kg)", attrezzoIniziale.toString());
	}

}
