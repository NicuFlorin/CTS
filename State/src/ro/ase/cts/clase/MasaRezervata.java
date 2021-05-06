package ro.ase.cts.clase;

public class MasaRezervata implements Stare {

	@Override
	public void modificaStare(Masa masa) {
		if(masa.getStareMasa() instanceof MasaLibera)
		{
			System.out.println("Masa "+masa.getNrMasa()+" trece in starea rezervata");
			masa.setStareMasa(this);
		}
		else {
			System.out.println("Masa nu poate fi rezervata");
		}
		
	}

}
