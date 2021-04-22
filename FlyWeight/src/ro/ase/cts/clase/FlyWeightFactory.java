package ro.ase.cts.clase;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightFactory {
	private Map<String, FlyWeight> clienti;
	
	public FlyWeightFactory() {
		super();
		this.clienti = new HashMap<>();
	}

	public FlyWeight getClient(String cheie) {
		FlyWeight flyWeight = clienti.get(cheie);
		if(flyWeight!=null) {
			return flyWeight;
		}
		else {
			flyWeight = new Client("Ion", cheie, "emal@gmail.com");
			clienti.put(cheie, flyWeight);
			return flyWeight;
		}
	  
	}

}
