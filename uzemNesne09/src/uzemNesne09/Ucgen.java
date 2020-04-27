package uzemNesne09; //ALT SINIF : UCGEN
public class Ucgen extends Sekil{
	public Ucgen(double k1, double k2) {
		super(k1, k2);
	}
	double alanHesapla() {
		System.out.println("Ucgenin alani : ");
		return kenar1 * kenar2 / 2;
	}
}
