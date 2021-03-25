package ro.ase.cts.clase;

public class Medic extends PersonalSpital {
	public Medic(String name) {
		super(name);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Medic [getName()=");
		builder.append(getName());
		builder.append("]");
		return builder.toString();
	}

	
	
}
