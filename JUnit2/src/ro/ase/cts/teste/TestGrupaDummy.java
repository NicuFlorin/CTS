package ro.ase.cts.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.IStudent;
import ro.ase.cts.mocks.MockUpStudnt;

public class TestGrupaDummy {
	@Test
	public void testAdaugaStudent() {
		IStudent student = new MockUpStudnt();
		Grupa grupa = new Grupa(1044);
		grupa.adaugaStudent(student);
		assertEquals(1, grupa.getStudenti().size());
	}

}
