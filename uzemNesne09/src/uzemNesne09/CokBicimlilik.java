package uzemNesne09;
public class CokBicimlilik {
	public static void main(String[] args) {
		Sekil refNesnesi;		
		Sekil sekilNesne = new Sekil(10,20);
		refNesnesi = sekilNesne;
		System.out.println(refNesnesi.alanHesapla());
		
		Ucgen ucgenNesne = new Ucgen(40, 25);
		refNesnesi = ucgenNesne;
		System.out.println(refNesnesi.alanHesapla());
		
		Dikdortgen dikdortgenNesne = new Dikdortgen(20, 28);
		refNesnesi = dikdortgenNesne;
		System.out.println(refNesnesi.alanHesapla());
	}
}
