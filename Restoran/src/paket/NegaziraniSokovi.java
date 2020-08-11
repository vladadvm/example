package paket;


public class NegaziraniSokovi extends Pice{

	Razno razno = new Razno();
	
	public NegaziraniSokovi() {
		setNaziv(generirajNaziv()); 
		setCena(generirajCena());
	}
	                          	
	@Override
	public String generirajNaziv() {
		return razno.randomName();
	}

	
}
