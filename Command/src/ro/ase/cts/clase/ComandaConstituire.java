package ro.ase.cts.clase;

public class ComandaConstituire extends Command {

	public ComandaConstituire(ContBancar contBancar, float suma) {
		super(contBancar, suma);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void executa() {
		super.getContBancar().constituire(super.getSuma());

	}

}
