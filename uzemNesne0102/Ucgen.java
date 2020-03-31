package uzemNesne0102;

public class Ucgen {

	public double kenar1, kenar2, kenar3;
	
	public Ucgen(double k1, double k2, double k3) {
		kenar1 = k1;
		kenar2 = k2;
		kenar3 = k3;		
	}
	
	public double ucgenCevresiHesapla() {
		return kenar1 + kenar2 + kenar3;
	}
	
}
