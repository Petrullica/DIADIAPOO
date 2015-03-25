package it.uniroma3.diadia.giocatore;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GiocatoreTest {
	private Giocatore giocatore;

	@Before
	public void setUp() throws Exception {
		giocatore = new Giocatore();
	}

	@Test
	public void testSetCfu() {
		giocatore.setCfu(180);
		assertEquals(180, giocatore.getCfu());
	}

	@Test
	public void testAddCfu() {
		giocatore.addCfu(170);
		assertEquals(180, giocatore.getCfu());
	}
}