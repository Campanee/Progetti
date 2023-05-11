
public class ARANCIA {
	
	private String varieta, origine;
	private double calibro, prezzo; 
	private int vitamina;
	
	public ARANCIA() {
		varieta="Navel";
		origine="Puglia";
		calibro=10;
		prezzo=5;
		vitamina=10;
	}
	
	public void Arancia(String parVarieta, String parOrigine, double parCalibro, double parPrezzo, int parVitamina) {
		varieta=parVarieta;
		origine=parOrigine;
		calibro=parCalibro;
		prezzo=parPrezzo;
		vitamina=parVitamina;
	}
	
	public void modificaPrezzo() {
		if (calibro>80) {
			prezzo=prezzo+prezzo*5/100;
		} else {
			if (calibro<60) {
				prezzo=prezzo-prezzo*10/100;
			}
		}
	}
	
	public double costoRaccolta() {
		double cR;
		cR=prezzo/3;
		return cR;
	}
	
	public int numeroArance() {
		int nA;
		nA=80/vitamina;
		return nA;
	}
	
	public String getVarieta() {
		return varieta;
	}
	
	public String getOrigine() {
		return origine;
	}
	
	public double getCalibro() {
		return calibro;
	}
	
	public double getPrezzo() {
		return prezzo;
	}
	
	public int getVitamina() {
		return vitamina;
	}
	
	public void setVarieta(String parVarieta) {
		varieta=parVarieta;
	}
	
	public void setOrigine(String parOrigine) {
		origine=parOrigine;
	}
	
	public void setCalibro(double parCalibro) {
		calibro=parCalibro;
	}
	
	public void setPrezzo(double parPrezzo) {
		prezzo=parPrezzo;
	}
	
	public void setVitamina(int parVitamina) {
		vitamina=parVitamina;
	}
	
	public String toString() {
		String stringa;
		stringa=varieta+" "+origine+" "+calibro+" "+prezzo+" "+vitamina;
		return stringa;
	}

}
