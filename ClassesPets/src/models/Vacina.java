package models;

public class Vacina {

	private long codVacina;
	private String nome;
	private String tipo;
	private String dataAplicacao;
	private String validade;
	private Pets pets;
	
	public long getCodVacina() {
		return codVacina;
	}
	public void setCodVacina(long codVacina) {
		this.codVacina = codVacina;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDataAplicacao() {
		return dataAplicacao;
	}
	public void setDataAplicacao(String dataAplicacao) {
		this.dataAplicacao = dataAplicacao;
	}
	public String getValidade() {
		return validade;
	}
	public void setValidade(String validade) {
		this.validade = validade;
	}
	public Pets getPets() {
		return pets;
	}
	public void setPets(Pets pets) {
		this.pets = pets;
	}
	
}
