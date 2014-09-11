package fspoa.es3.catracas;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.List;

public class CatracapApp {
	public static void main(String[] args) throws IOException {
		System.out.println("Catracas (c) 2014.");
		
//		entrada: (usuario do coordenador, senha do coordenador, data, hora de in�cio, hora de fim) 
//		[bertoni, adsads, 2014-08-21, 9:00, 10:00, ADS]

		System.out.println("Criando dados de teste...");
		List<Passagem> ps;
		ps = Catraca.consultarPresentes("2014-08-21", "9:00", "10:00");
		System.out.println(ps);
		
//		sa�da: (nome, curso, foto, data, hor�rio da passagem, dire��o (E/S))
//		[(Guilherme, ADS, <foto1>, 2014-08-21, 9h15, E)
//		(Adriano, ADS, <foto2>, 2014-08-21, 9h15, E)]
		
		System.out.println("Dados do primeira passagem pela roleta:");
		System.out.println(ps);
		
		System.in.read();
		
		
	}
}
