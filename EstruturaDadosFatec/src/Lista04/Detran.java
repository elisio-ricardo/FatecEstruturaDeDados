package Lista04;

public class Detran {
	
	
	private String id;
	private String nome;
	private String rg;
	private String telefone;
	private String datadeNascimento;
	
	public Detran(String id, String nome, String rg, String telefone, String dataDeNascimento) {
		this.id = id;
		this.nome = nome;
		this.rg = rg;
		this.telefone = telefone; 
		this.datadeNascimento = dataDeNascimento;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getDatadeNascimento() {
		return datadeNascimento;
	}
	public void setDatadeNascimento(String datadeNascimento) {
		this.datadeNascimento = datadeNascimento;
	}
	
	
	
	
	

}
