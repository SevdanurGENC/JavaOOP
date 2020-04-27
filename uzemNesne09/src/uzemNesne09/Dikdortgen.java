package uzemNesne09; //ALT SINIF : DIKDORTGEN
public class Dikdortgen extends Sekil{
	Dikdortgen(double k1, double k2){
		super(k1, k2);
	}
	double alanHesapla(){
		System.out.println("Dikdortgenin alani : ");
		return kenar1 * kenar2;
	}	
}
