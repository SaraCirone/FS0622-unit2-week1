
public class Sim {
	
	public String numero;
	public int credito = 0;
	public Chiamate[] listaChiamate;
	
	
		public Sim(String numero, int credito) {
			this.numero = numero; 
			this.credito = credito;
			this.listaChiamate = new Chiamate[5];
		}


		public String getNumero() {
			return numero;
		}


		public void setNumero(String numero) {
			this.numero = numero;
		}


		public int getCredito() {
			return credito;
		}


		public void setCredito(int credito) {
			this.credito = credito;
		}


		public Chiamate[] getListaChiamate() {
			return listaChiamate;
		}


		public void setListaChiamate(Chiamate[] listaChiamate) {
			this.listaChiamate = listaChiamate;
		}


	    public void stampaDati() {
	        System.out.println("Numero sim: " + this.numero);
	        System.out.println("Credito residuo: " + this.credito);
	        System.out.println("Lista chiamate del numero " + this.numero);
	        System.out.println(listaChiamate[0].getNomeChiamata() + ", durata " + listaChiamate[0].getDurata() + " min");
	        System.out.println(listaChiamate[1].getNomeChiamata() + ", durata " + listaChiamate[1].getDurata() + " min");
	        System.out.println(listaChiamate[2].getNomeChiamata() + ", durata " + listaChiamate[2].getDurata() + " min");
	    }
		
		

}
