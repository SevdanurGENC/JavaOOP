package uzemNesne07;
public class KalitimOrnegi {
	public static void main(String[] args) {
		double sonuc; 
		
		Kutu_AnaSinif kAnaNesne = new Kutu_AnaSinif(20, 25, 10.70);
		sonuc = kAnaNesne.hacim();
		System.out.println("Hacim Sonucu : " + sonuc);
		
		Kutu_AltSinif kAltNesne = new Kutu_AltSinif(4, 5, 6, 0.123);
		sonuc = kAltNesne.hacim();
		System.out.println("Hacim Sonucu : " + sonuc);
		System.out.println("Agirlik Bilgisi : " + kAltNesne.agirlik);

		Kutu_AltSinif kaltnesne = new Kutu_AltSinif(11, 8, 9, 30.45);
		System.out.println("Hacim Sonucu : " + kaltnesne.hacim());
		System.out.println("Agirlik Sonucu : " + kaltnesne.agirlik);
		System.out.println("Boy Degeri : " + kaltnesne.boy);
	}

}
