package ro.ase.cts.main;

import ro.ase.cts.clase.Card;
import ro.ase.cts.clase.Client;
import ro.ase.cts.clase.Portofel;

public class Main {

	public static void main(String[] args) {
		Portofel portofel = new Portofel(800.23);
		Client client1 = new Client("Eu", portofel);
		client1.platesteNota(50);
		client1.setStrategy(new Card());
		client1.platesteNota(200);
		client1.setStrategy(portofel);
		client1.platesteNota(1000);
		
		
		

	}

}
