package it.uniroma3.diadia.attrezzi;

import static org.junit.Assert.*;
import it.uniroma3.diadia.attrezzi.Attrezzo;

import org.junit.Before;
import org.junit.Test;

public class AttrezzoTest {
	private Attrezzo attrezzo;

	@Before
	public void setUp() {
		attrezzo = new Attrezzo("arco", 8);
	}

	@Test
	public void testGetNome() {
		assertEquals("arco", attrezzo.getNome());
	}

	@Test
	public void testGetPeso() {
		assertEquals(8, attrezzo.getPeso());
	}

	@Test
	public void testToString() {
		assertEquals("arco (8kg)", attrezzo.toString());
	}

}
