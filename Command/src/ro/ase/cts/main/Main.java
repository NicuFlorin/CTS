package ro.ase.cts.main;

import ro.ase.cts.clase.ComandaConstituire;
import ro.ase.cts.clase.ComandaDepunere;
import ro.ase.cts.clase.ComandaRetragere;
import ro.ase.cts.clase.ContBancar;
import ro.ase.cts.clase.ManagerComenzi;

public class Main {

	public static void main(String[] args) {
		ContBancar contBancar = new ContBancar("Gheorghe");
		ManagerComenzi managerComenzi = new ManagerComenzi();
		managerComenzi.invoca(new ComandaConstituire(contBancar, 120));
		managerComenzi.invoca(new ComandaDepunere(contBancar, 500));
		managerComenzi.executaComanda();
		managerComenzi.invoca(new ComandaRetragere(contBancar, 800));
		managerComenzi.executaComanda();
		managerComenzi.executaComanda();
		

	}

}
