public class CarrelloUtente {
	
	String nomeProdotto;
	double prezzoProdotto;
	
	public CarrelloUtente(String nomeProdotto, double prezzoProdotto) {
		
		this.nomeProdotto = nomeProdotto;
		this.prezzoProdotto = prezzoProdotto;
	}

	public String getNomeProdotto() {
		return nomeProdotto;
	}

	public void setNomeProdotto(String nomeProdotto) {
		this.nomeProdotto = nomeProdotto;
	}

	public double getPrezzoProdotto() {
		return prezzoProdotto;
	}

	public void setPrezzoProdotto(double prezzoProdotto) {
		this.prezzoProdotto = prezzoProdotto;
	}


}
