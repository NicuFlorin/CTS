package ro.ase.cts.clase;

public class FactoryPersonal {
	public PersonalSpital getPersonal(TipPersonal tipPersonal, String name) throws Exception {
		switch (tipPersonal) {
		case MEDIC:
			return new Medic(name);
		case BRANCARDIER:
			return new Brancardier(name);
		case ASISTENT:
			return new Asistent(name);
		default:
			throw new Exception();
		}

	}

}
