package ro.ase.cts.clase;

public class MasaOcupata implements Stare{

	@Override
	public void modificaStare(Masa masa) {
		if(masa.getStareMasa() instanceof MasaOcupata) {
			System.out.println("nu se poate ocupa");
		}
		else {
			masa.setStareMasa(this);
			System.out.println("Masa s-a ocupat");
		}
		
	}

}
