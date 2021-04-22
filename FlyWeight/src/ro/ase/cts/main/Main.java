package ro.ase.cts.main;

import ro.ase.cts.clase.FlyWeight;
import ro.ase.cts.clase.FlyWeightFactory;
import ro.ase.cts.clase.Rezervare;

public class Main {

	public static void main(String[] args) {
		Rezervare rezervare1 = new Rezervare(5, 3, 10);
		Rezervare rezervare2 = new Rezervare(1, 2, 12);
		Rezervare rezervare3 = new Rezervare(3, 4, 20);
		FlyWeightFactory factory = new FlyWeightFactory();
		
		factory.getClient("07222222").printeazaRezervare(rezervare1);
		factory.getClient("07333333").printeazaRezervare(rezervare2);
		factory.getClient("07222222").printeazaRezervare(rezervare1);

	}

}
