package fspoa.es3.catracas;

import java.util.ArrayList;
import java.util.List;

public class Catraca {

	public static List<Passagem> consultarPresentes(String data, String horaInicio,
			String horaFim) {
		
		List<Passagem> resultado = new ArrayList<>();
		
		// TODO consultar usuário logado
		Usuario usuario = new Usuario();
		// TODO restringe ao curso do usuário logado
		Curso curso = new Curso("ADS");
		// TODO usuário logado deve ser coordenador
		assert usuario.isCoordenador(curso);
		
		resultado.add(new Passagem("Guilherme", curso));
		resultado.add(new Passagem("Adriano", curso));
		
		return resultado;
	}

}
