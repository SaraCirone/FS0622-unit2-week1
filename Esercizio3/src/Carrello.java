public class Carrello {

	private CarrelloUtente[] elencoArticoli;
	String codiceClienteAssociato;
	String nomeClienteAssociato; 
	
	
	public Carrello(String codiceClienteAssociato, String nomeClienteAssociato,  int elencoArticoli) {
		
		this.codiceClienteAssociato = codiceClienteAssociato;
		this.nomeClienteAssociato = nomeClienteAssociato;
		this.elencoArticoli = new CarrelloUtente[10];
	}



	
	public CarrelloUtente[] getElencoArticoli() {
		return elencoArticoli;
	}




	public void setElencoArticoli(CarrelloUtente[] elencoArticoli) {
		this.elencoArticoli = elencoArticoli;
	}




	public String getCodiceClienteAssociato() {
		return codiceClienteAssociato;
	}




	public void setCodiceClienteAssociato(String codiceClienteAssociato) {
		this.codiceClienteAssociato = codiceClienteAssociato;
	}




	public String getNomeClienteAssociato() {
		return nomeClienteAssociato;
	}




	public void setNomeClienteAssociato(String nomeClienteAssociato) {
		this.nomeClienteAssociato = nomeClienteAssociato;
	}




	public void stampaCarrello() {
		System.out.println("Codice Cliente Carrello:  " + codiceClienteAssociato);
		System.out.println("Nome Cliente Carrello:  " + nomeClienteAssociato);
		System.out.println("Elenco articoli presenti nel carrello");
		System.out.println("- " + elencoArticoli[0].getNomeProdotto() + ": " + elencoArticoli[0].getPrezzoProdotto() + " €");
		System.out.println("- " + elencoArticoli[1].getNomeProdotto() + ": " + elencoArticoli[1].getPrezzoProdotto() + " €");
		System.out.println("- " + elencoArticoli[2].getNomeProdotto() + ": " + elencoArticoli[2].getPrezzoProdotto() + " €");
	}

}
