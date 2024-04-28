package models;

public class Pets {

	private long codPet;
	private String nome;
	private String dataNascimento;
	private String raca;
	private String peso;
	private String statusAdoacao;
	private Doador doador;
	private Vacina vacina;
	public Vacina getVacina() {
		return vacina;
	}
	public void setVacina(Vacina vacina) {
		this.vacina = vacina;
	}
	public long getCodPet() {
		return codPet;
	}
	public void setCodPet(long codPet) {
		this.codPet = codPet;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getPeso() {
		return peso;
	}
	public void setPeso(String peso) {
		this.peso = peso;
	}
	public String getStatusAdoacao() {
		return statusAdoacao;
	}
	public void setStatusAdoacao(String statusAdoacao) {
		this.statusAdoacao = statusAdoacao;
	}
	public Doador getDoador() {
		return doador;
	}
	public void setDoador(Doador doador) {
		this.doador = doador;
	}
}
