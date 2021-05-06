package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerComenzi {
	private List<Command> listaComenzi;

	public ManagerComenzi() {
		super();
		this.listaComenzi = new ArrayList<>();
	}
	public void invoca(Command comanda) {
		listaComenzi.add(comanda);
	}
	public void executaComanda() {
		if(!listaComenzi.isEmpty()) {
			listaComenzi.get(0).executa();
			listaComenzi.remove(0);
		}
	}

}
