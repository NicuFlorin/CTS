package ro.ase.cts.main;

import ro.ase.cts.clase.FactoryMethodAsistent;
import ro.ase.cts.clase.FactoryMethodMedic;
import ro.ase.cts.clase.FactoryMethodPersonal;
import ro.ase.cts.clase.FactoryPersonal;
import ro.ase.cts.clase.Medic;
import ro.ase.cts.clase.PersonalSpital;
import ro.ase.cts.clase.TipPersonal;

public class Main {
	
	public static void printeazaPersonalSpital(FactoryMethodPersonal factoryPersonal,String name) {
		PersonalSpital personalSpital = factoryPersonal.getPersonal(name);
		System.out.println(personalSpital.toString());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//simple factory
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
      //factory method
      
      printeazaPersonalSpital(new FactoryMethodMedic(), "Marcel");
      printeazaPersonalSpital(new FactoryMethodAsistent(), "George");
	}

}
