package it.uniroma3.diadia;

import it.uniroma3.diadia.Partita;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PartitaTest {
	private Partita partita;

	@Before
	public void setUp() throws Exception {
		partita = new Partita();
	}

	@Test
	public void testGetStanzaCorrente() {
		assertEquals("Atrio", partita.getStanzaCorrente().getNome());
	}

	@Test
	public void testVinta() {
		assertFalse(partita.vinta());
	}

	@Test
	public void testIsFinita() {
		partita.setFinita();
		assertTrue(partita.isFinita());
	}

}
