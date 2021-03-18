package ro.ase.cts.program;

import ro.acs.cts.clase.Broker;
import ro.acs.cts.clase.BrokerLazy;

public class Program {

	public static void main(String[] args) {
		Broker broker = Broker.getInstance();
		Broker broker2 = Broker.getInstance();
		System.out.println(broker);
		
		BrokerLazy lazy = BrokerLazy.getInstance("Danut", 5, 5);
		BrokerLazy lazy2 = BrokerLazy.getInstance("Ion", 6, 6);
        System.out.println(lazy);
        System.out.println(lazy2);
	}

}
