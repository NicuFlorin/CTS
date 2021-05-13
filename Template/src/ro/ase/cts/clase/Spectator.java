package ro.ase.cts.clase;

public class Spectator extends TemplateSpectator{

	@Override
	public void seAseazaLaCoada() {
		System.out.println("Se aseaza la coada");
		
	}

	@Override
	public void prezintaBilet() {
		System.out.println("Prezinta bilet");
		
	}

	@Override
	public void controlCorporal() {
		System.out.println("E controlat");
		
	}

	@Override
	public void ocupaLoc() {
		System.out.println("Ocupa loc");
		
	}

}
