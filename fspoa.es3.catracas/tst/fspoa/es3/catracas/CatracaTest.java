package fspoa.es3.catracas;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class CatracaTest {
	private List<Passagem> ps;

	@Before
	public void preparar() {
//		entrada: (usuario do coordenador, senha do coordenador, data, hora de início, hora de fim) 
//		[bertoni, adsads, 2014-08-21, 9:00, 10:00, ADS]

		ps = Catraca.consultarPresentes("2014-08-21", "9:00", "10:00");
		
//		saída: (nome, curso, foto, data, horário da passagem, direção (E/S))
//		[(Guilherme, ADS, <foto1>, 2014-08-21, 9h15, E)
//		(Adriano, ADS, <foto2>, 2014-08-21, 9h15, E)]
		
	}
	
	@Test
	public void test() {
		assertEquals(2, ps.size());
	}
	
	@Test
	public void test1() {
		Passagem p = ps.get(0);
		assertEquals("Guilherme", p.getNome());
	}
	
	@Test
	public void test2() {
		Passagem p = ps.get(1);
		assertEquals("Adriano", p.getNome());
	}
	
	@Test
	public void test3() {
		Passagem p = ps.get(1);
		assertEquals("ADS", p.getCurso().getNome());
	}
	
	@Test
	public void test4() {
		Passagem p = ps.get(1);
		assertEquals("ADS", p.getCurso().getNome());
	}	
}
