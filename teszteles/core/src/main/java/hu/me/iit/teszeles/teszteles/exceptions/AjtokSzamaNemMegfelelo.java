package hu.me.iit.teszeles.teszteles.exceptions;

public class AjtokSzamaNemMegfelelo extends Exception {

	public AjtokSzamaNemMegfelelo(int ajtokSzama) {
		super(String.valueOf(ajtokSzama));
	}
	
}
