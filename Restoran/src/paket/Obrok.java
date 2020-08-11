package paket;

import java.util.ArrayList;
import java.util.List;

public abstract class Obrok extends Artikal{

	private List<Prilozi> listaPriloga = new ArrayList<Prilozi>();
	private double cenaPriloga = getUkupnaCenaPriloga();
	
	
	public List<Prilozi> getListaPriloga() {
		return listaPriloga;
	}
	
	public void setListaPriloga(List<Prilozi> listaPriloga) {
		this.listaPriloga = listaPriloga;
	}
	
	
	
	public double getCenaPriloga() {
		return cenaPriloga;
	}

	public void setCenaPriloga(double cenaPriloga) {
		this.cenaPriloga = cenaPriloga;
	}

	@Override
	public double generirajCena() {
		int min = 300;
		int max = 600;
		 double randomPrice = Math.random() * (max - min + 1) + min; 
	      return randomPrice;
	}
	
	public double getUkupnaCenaPriloga() {
		double cena = 0;
		for(Prilozi p: listaPriloga) {
			cena += p.getCena();
		}
		return cena;
	}
}
