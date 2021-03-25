package ro.ase.cts.clase;

public class FactoryMethodAsistent implements FactoryMethodPersonal {

	@Override
	public PersonalSpital getPersonal(String name) {
		// TODO Auto-generated method stub
		return new Asistent(name);
	}

}
