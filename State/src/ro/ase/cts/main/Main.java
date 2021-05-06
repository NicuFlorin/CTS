package ro.ase.cts.main;

import ro.ase.cts.clase.Masa;

public class Main {

	public static void main(String[] args) {
		Masa masa = new Masa(3);
		masa.elibereazaMasa();
		masa.ocupaMasa();
		masa.elibereazaMasa();
		masa.rezervaMasa();
		masa.elibereazaMasa();

	}

}
