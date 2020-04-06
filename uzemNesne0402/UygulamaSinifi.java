package uzemNesne0402;

public class UygulamaSinifi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dikdortgen d = new Dikdortgen(9, 3);
		Ucgen u = new Ucgen(10, 8);
		
		Sekil ref;
		
		ref = d;
		System.out.println(ref.alan());
		ref = u;
		System.out.println(ref.alan()); 
	}

}
