package uzemNesne0101;

public class AnaSinif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ucgen cevre = new Ucgen();
		cevre.setKenar1(10);
		cevre.setKenar2(36);
		cevre.setKenar3(207);
		
		System.out.println("Birinci kenar : " + cevre.getKenar1());
		System.out.println("Ikinci kenar : " + cevre.getKenar2());
		System.out.println("Ucuncu kenar : " + cevre.getKenar3());
		
		System.out.println("Ucgenin cevresi : " + cevre.UcgenCevresi());
		
		
		
	}

}
