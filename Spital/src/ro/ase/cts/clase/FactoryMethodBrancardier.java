package ro.ase.cts.clase;

public class FactoryMethodBrancardier implements FactoryMethodPersonal {

	@Override
	public PersonalSpital getPersonal(String name) {
		// TODO Auto-generated method stub
		return new Brancardier(name);
	}
	

}
