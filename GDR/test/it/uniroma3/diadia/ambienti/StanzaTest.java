package it.uniroma3.diadia.ambienti;

import static org.junit.Assert.*;
import it.uniroma3.diadia.attrezzi.Attrezzo;

import org.junit.Before;
import org.junit.Test;

public class StanzaTest {
	private Stanza camera;
	private Stanza bagno;
	private Attrezzo computer;

	@Before
	public void setUp() {
		camera = new Stanza("camera");
		bagno = new Stanza("bagno");
		computer = new Attrezzo("computer", 3);
		camera.impostaStanzaAdiacente("nord", bagno);
		bagno.impostaStanzaAdiacente("sud", camera);
		camera.addAttrezzo(computer);
	}

	@Test
	public void testGetStanzaAdiacente() {
		assertEquals(camera, bagno.getStanzaAdiacente("sud"));
	}
	
	@Test
	public void testGetStanzaAdiacenteNonEsistente() {
		assertEquals(null, bagno.getStanzaAdiacente("est"));
	}

	@Test
	public void testGetDirezioni() {
		assertEquals("nord", camera.getDirezioni()[0]);
	}

	@Test
	public void testRemoveAttrezzo_True() {
		assertTrue(camera.removeAttrezzo(computer));
	}

	@Test
	public void testRemoveAttrezzo_False() {
		assertFalse(bagno.removeAttrezzo(computer));
	}

}
