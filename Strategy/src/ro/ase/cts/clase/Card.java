package ro.ase.cts.clase;

public class Card implements Strategy{

	@Override
	public void realizeazaPlata(double suma) {
		System.out.println("A fost facuta plata a "+suma+" lei cu cardul");
		
	}

}
