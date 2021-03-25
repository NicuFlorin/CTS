package ro.ase.cts.clase;

public class Brancardier extends PersonalSpital {

	public Brancardier(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Brancardier [getName()=");
		builder.append(getName());
		builder.append("]");
		return builder.toString();
	}
	

}
