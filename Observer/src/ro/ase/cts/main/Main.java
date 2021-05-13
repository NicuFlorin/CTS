package ro.ase.cts.main;

import ro.ase.cts.clase.Client;
import ro.ase.cts.clase.ManagerSala;
import ro.ase.cts.clase.Observer;

public class Main {

	public static void main(String[] args) {
		ManagerSala managerSala = new ManagerSala("Gheorghe");
		Observer client1 = new Client("Panama");
		Observer client2 = new Client("Ion");
		Observer client3 = new Client("Camsa");
		managerSala.adaugareAbonat(client1);
		managerSala.adaugareAbonat(client2);
		managerSala.adaugareAbonat(client3);
		
		managerSala.trimiteAnunt("Fotbal");
		managerSala.trimiteAnunt("Volei");
		managerSala.trimiteAnunt("Handbal");
		managerSala.stergereAbonat(client3);
		managerSala.trimiteAnunt("Hanbal");

	}

}
