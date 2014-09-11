package fspoa.es3.catracas;

public class Passagem {

	private String nome;
	private Curso curso;

	public Passagem(String nome, Curso curso) {
		super();
		this.nome = nome;
		this.curso = curso;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return String.format("Passagem [nome=%s]", nome);
	}

	public Curso getCurso() {
		return curso;
	}
	
	
}
