package ro.ase.cts.clase;

public class Portofel implements Strategy {

	private double sumaDisponibila;

	public Portofel(double sumaDisponibila) {
		super();
		this.sumaDisponibila = sumaDisponibila;
	}

	@Override
	public void realizeazaPlata(double suma) {
		if (suma <= sumaDisponibila) {
			System.out.println("A fost realizata plata " + sumaDisponibila + " cash");
			this.sumaDisponibila -= suma;
		} else
			System.out.println("Nu ai bani");

	}

}
