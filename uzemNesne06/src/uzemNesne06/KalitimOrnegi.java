package uzemNesne06; 
public class KalitimOrnegi { 
	public static void main(String[] args) { 
		AnaSinif anaSinifNesnesi = new AnaSinif();
		anaSinifNesnesi.sayi1 = 10;
		anaSinifNesnesi.sayi2 = 25;
		System.out.print("Alt Siniftan Gelen Degerler : ");
		anaSinifNesnesi.ilkIkiSayiyiYazdir();
		
		System.out.println();
		AltSinif altSinifNesnesi = new AltSinif();
		altSinifNesnesi.sayi1 = 40;
		altSinifNesnesi.sayi2 = 55;
		altSinifNesnesi.sayi3 = 15;
		altSinifNesnesi.ilkIkiSayiyiYazdir();
		altSinifNesnesi.ucuncuSayiyiYazdir();
		System.out.println();
		System.out.print("Ana Sinif ve Alt siniftaki degerlerin toplami : ");
		altSinifNesnesi.sayilariTopla();
	}
}
