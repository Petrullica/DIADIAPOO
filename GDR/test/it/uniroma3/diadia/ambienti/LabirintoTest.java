package it.uniroma3.diadia.ambienti;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LabirintoTest {
	private Labirinto labirinto;

	@Before
	public void setUp() throws Exception {
		labirinto = new Labirinto();
	}

	@Test
	public void testGetStanzaIniziale_Equals() {
		assertEquals("Atrio", labirinto.getStanzaIniziale().getNome());
	}

	@Test
	public void testGetStanzaIniziale_NotEquals() {
		assertNotEquals("Biblioteca", labirinto.getStanzaIniziale().getNome());
	}

	@Test
	public void testGetStanzaVincente() {
		assertSame("Biblioteca", labirinto.getStanzaVincente().getNome());
	}

}
