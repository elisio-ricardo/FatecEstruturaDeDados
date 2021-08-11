package Lista07;

public class EmbraerP2 {
	
	private int id;
	private String nome;
	private String turma;
	private String semestre;
	
	
	public EmbraerP2(int ra, String nome, String turma) {
		this.id = ra;
		this.nome = nome;
		this.turma = turma;
	}
	
	


	public int getRa() {
		return id;
	}
	public void setRa(int ra) {
		this.id = ra;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTurma() {
		return turma;
	}
	public void setTurma(String turma) {
		this.turma = turma;
	}
	

}


