package paket;

import java.util.ArrayList;
import java.util.List;

public class Porudzbina {

	private List<Artikal> sviArtikli = new ArrayList<Artikal>();
	
	public double ukupnaCena() {
		return 1;
	}

	public List<Artikal> getSviArtikli() {
		return sviArtikli;
	}

	public void setSviArtikli(List<Artikal> sviArtikli) {
		this.sviArtikli = sviArtikli;
	}
	
	
	
}
