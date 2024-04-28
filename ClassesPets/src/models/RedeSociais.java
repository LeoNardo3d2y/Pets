package models;

public class RedeSociais {

	private String nomeRefe;
	private String link;
	private Doador doador;
	
	public Doador getDoador() {
		return doador;
	}
	public void setDoador(Doador doador) {
		this.doador = doador;
	}
	public String getNomeRefe() {
		return nomeRefe;
	}
	public void setNomeRefe(String nomeRefe) {
		this.nomeRefe = nomeRefe;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
}
