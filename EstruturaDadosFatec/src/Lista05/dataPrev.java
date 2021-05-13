package Lista05;

public class dataPrev {
	
	private int id;
	private String nomePrograma;;
	private String areaAplicacao;
	public dataPrev(int id, String nomePrograma, String areaAplicacao) {
		super();
		this.id = id;
		this.nomePrograma = nomePrograma;
		this.areaAplicacao = areaAplicacao;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomePrograma() {
		return nomePrograma;
	}
	public void setNomePrograma(String nomePrograma) {
		this.nomePrograma = nomePrograma;
	}
	public String getAreaAplicacao() {
		return areaAplicacao;
	}
	public void setAreaAplicacao(String areaAplicacao) {
		this.areaAplicacao = areaAplicacao;
	}
	
	

}
