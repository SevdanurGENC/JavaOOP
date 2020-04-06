package uzemNesne0402;

class Dikdortgen extends Sekil {
	Dikdortgen(double a, double b){
		super(a,b);		
	}
	@Override
	double alan() {
		// TODO Auto-generated method stub
		System.out.println("Dikdortgenin alani : ");
		return kenar1 * kenar2;
	}	
}
