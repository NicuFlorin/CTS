package ro.ase.cts.clase;

public class Client implements Observer {
	private String name;
	public Client(String name) {
		this.name=name;
	}
	@Override
	public void receptionareMesaj(String mesaj) {
		System.out.println(name+" ai primit mesaj:"+mesaj);
		
	}
	

}
