package ro.ase.cts.clase;

public class FactoryMethodMedic implements FactoryMethodPersonal {

	@Override
	public PersonalSpital getPersonal(String name) {
		// TODO Auto-generated method stub
		return new Medic(name);
	}

}
