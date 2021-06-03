package ro.ase.cts.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ro.ase.cts.clase.Grupa;
import ro.ase.cts.mocks.StudentFake;

public class TestStudentFake {
	@Test
	public void testPromovabilitate() {
		Grupa grupa = new Grupa(1066);
		for(int i=0;i<8;i++) {
			StudentFake studentFake = new StudentFake();
			studentFake.setValoareAreRestante(false);
			grupa.adaugaStudent(studentFake);
		}
		for(int i=0;i<2;i++) {
			StudentFake studentFake = new StudentFake();
			studentFake.setValoareAreRestante(true);
			grupa.adaugaStudent(studentFake);
		}
		
		assertEquals(0.8,grupa.getPromovabilitate(),0.01);
		
	}

}
