package uzemNesne08;
public class CokBicimlilik {
	public static void main(String[] args) { 
		AnaSinif anaSiniftanTureyenNesne = new AnaSinif();
		AnaSiniftanTureyenAltSinif anaSiniftanTureyenAltSinifNesne = new AnaSiniftanTureyenAltSinif();
		AltSiniftanTureyenAltSinif altSiniftanTureyenAltSinifNesne = new AltSiniftanTureyenAltSinif();
		
		AnaSinif nesne;
		nesne = anaSiniftanTureyenNesne;
		nesne.kimCalisti();
		nesne = anaSiniftanTureyenAltSinifNesne;
		nesne.kimCalisti();
		nesne = altSiniftanTureyenAltSinifNesne;
		nesne.kimCalisti();
	}
}
