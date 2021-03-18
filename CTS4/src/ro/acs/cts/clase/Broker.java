package ro.acs.cts.clase;

public class Broker {
	private String nume;
	private int vechime;
	private int nrTranzactiiEfectuate;
    private static Broker broker = new Broker("corner", 12, 7);
    
	private Broker(String nume, int vechime, int nrTranzactiiEfectuate) {
		super();
		this.nume = nume;
		this.vechime = vechime;
		this.nrTranzactiiEfectuate = nrTranzactiiEfectuate;
	}
	
	public static synchronized Broker getInstance() {
		return broker;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public int getVechime() {
		return vechime;
	}

	public void setVechime(int vechime) {
		this.vechime = vechime;
	}

	public int getNrTranzactiiEfectuate() {
		return nrTranzactiiEfectuate;
	}

	public void setNrTranzactiiEfectuate(int nrTranzactiiEfectuate) {
		this.nrTranzactiiEfectuate = nrTranzactiiEfectuate;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Broker [nume=");
		builder.append(nume);
		builder.append(", vechime=");
		builder.append(vechime);
		builder.append(", nrTranzactiiEfectuate=");
		builder.append(nrTranzactiiEfectuate);
		builder.append("]");
		return builder.toString();
	}
	
	

}
