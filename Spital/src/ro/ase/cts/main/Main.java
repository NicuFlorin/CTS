package ro.ase.cts.main;

import ro.ase.cts.clase.FactoryPersonal;
import ro.ase.cts.clase.Medic;
import ro.ase.cts.clase.PersonalSpital;
import ro.ase.cts.clase.TipPersonal;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      FactoryPersonal factoryPersonal = new FactoryPersonal();
      try {
		PersonalSpital medic =factoryPersonal.getPersonal(TipPersonal.MEDIC,"Gelu");
		PersonalSpital asistent = factoryPersonal.getPersonal(TipPersonal.ASISTENT, "George");
		PersonalSpital brancardier = factoryPersonal.getPersonal(TipPersonal.BRANCARDIER, "Ion");
		
		System.out.println(medic.toString());
		System.out.println(asistent.toString());
		System.out.println(brancardier.toString());
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
