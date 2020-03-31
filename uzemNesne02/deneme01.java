package uzemNesne02;

public class deneme01 implements arayuz01, arayuz02{

	public void topla(int sayi1, int sayi2) {
		System.out.println("Sayi1 + Sayi2 = " + (sayi1 + sayi2));
	}
	
	public void hacim(int a, int b, int c) {
		System.out.println("Hacim = " + (a*b*c));		
	} 
	 

public static final double fiyat = 16.99;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		deneme01 degisken = new deneme01();
		
		degisken.hacim(3, 5, 7);
		degisken.topla(12, 15);
		degisken.ekranaYaz("Sevdanur GENC");
		
		System.out.println("Fiyat Degeri : " + degisken.fiyat);
		System.out.println("Sayac Degeri : " + degisken.sayac);
		System.out.println("Kulanici Isminiz : " + degisken.isim);
		  
		
	}

	@Override
	public void ekranaYaz(String isim) {
		// TODO Auto-generated method stub
		System.out.println("Isminiz : " + isim);
		
	}

}
