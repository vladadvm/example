package paket;

public class Sto {

	private int id;
	private Porudzbina porudzbina;
	private boolean daLiJePlacenRacun;
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Porudzbina getPorudzbina() {
		return porudzbina;
	}

	public void setPorudzbina(Porudzbina porudzbina) {
		this.porudzbina = porudzbina;
	}

	public boolean isDaLiJePlacenRacun() {
		return daLiJePlacenRacun;
	}

	public void setDaLiJePlacenRacun(boolean daLiJePlacenRacun) {
		this.daLiJePlacenRacun = daLiJePlacenRacun;
	}

	public Porudzbina novaPorudzbina(Porudzbina porudzbina) throws Exception {
		return porudzbina;
	}
	
	public void prikaziRacun() {
		
	}
	
	public boolean platiRacun() {
		return false;
	}
	
}
