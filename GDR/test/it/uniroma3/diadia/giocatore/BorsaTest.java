package it.uniroma3.diadia.giocatore;

import static org.junit.Assert.*;
import it.uniroma3.diadia.attrezzi.Attrezzo;

import org.junit.Before;
import org.junit.Test;

public class BorsaTest {
	private Borsa borsa;
	private Borsa borsaNonVuota;
	private Attrezzo bottiglia;
	private Attrezzo spazzolino;

	@Before
	public void setUp() throws Exception {
		borsa = new Borsa();
		bottiglia = new Attrezzo("bottiglia", 1);
		borsaNonVuota = new Borsa();
		spazzolino = new Attrezzo("spazzolino", 1);
		borsaNonVuota.addAttrezzo(spazzolino);
	}

	@Test
	public void testGetPesoDaBorsaVuota() {
		assertEquals(0, borsa.getPeso());
	}

	@Test
	public void testIsEmpty_True() {
		assertTrue(new Borsa().isEmpty());
	}

	@Test
	public void testIsEmpty_False() {
		assertFalse(borsaNonVuota.isEmpty());
	}

	@Test
	public void testRemoveAttrezzoDaBorsaVuota() {
		assertNull(borsa.removeAttrezzo("bottiglia"));
	}

	@Test
	public void testRemoveAttrezzoConOggetto() {
		borsa.addAttrezzo(bottiglia);
		assertSame(bottiglia, borsa.removeAttrezzo("bottiglia"));
	}

	@Test
	public void testRemoveAttrezzo() {
		borsaNonVuota.addAttrezzo(bottiglia);
		assertEquals(bottiglia, borsaNonVuota.removeAttrezzo("bottiglia"));		
	}

}
