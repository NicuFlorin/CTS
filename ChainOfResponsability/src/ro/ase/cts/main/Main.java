package ro.ase.cts.main;

import ro.ase.cts.clase.Cont;
import ro.ase.cts.clase.ContCredit;
import ro.ase.cts.clase.ContCurent;
import ro.ase.cts.clase.ContEconomii;

public class Main {

	public static void main(String[] args) {
		ContEconomii contEconomii = new ContEconomii(2000);
		ContCurent contCurent = new ContCurent(1500);
		ContCredit contCredit = new ContCredit(1000);
		contCurent.setSuccesor(contEconomii);
		contEconomii.setSuccesor(contCredit);
		contCurent.plateste(100);
		contCurent.plateste(1800);
		contCurent.plateste(1000);

	}

}
