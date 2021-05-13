package ro.ase.cts.main;

import ro.ase.cts.clase.ManagerMemento;
import ro.ase.cts.clase.MeciJucat;

public class Main {

	public static void main(String[] args) {
		MeciJucat meciJucat = new MeciJucat("Steaua","Craiova",10, 0, 0, 0);
		ManagerMemento managerMemento = new ManagerMemento();
		managerMemento.adaugaMemento(meciJucat.creareMemento());
		
		meciJucat.setNumeGazda("Botosani");
		meciJucat.setNumeOaspeti("Cluj");
		meciJucat.setNrBilete(3333);
		meciJucat.setNrSpectatori(5000);
		
		managerMemento.adaugaMemento(meciJucat.creareMemento());
		System.out.println(meciJucat.toString());
		meciJucat.setMemento(managerMemento.getMemento(0));
		System.out.println(meciJucat);

	}

}
