package ro.ase.cts.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.IStudent;
import ro.ase.cts.mocks.StudentMockUp;

public class TestPromovabilitateStub {
	@Test
	public void testPromovabilitateLimitaSuperioara() {
		Grupa grupa = new Grupa(1083);
		IStudent student = new StudentMockUp();
		grupa.adaugaStudent(student);
		assertEquals(1, grupa.getPromovabilitate(),0.01);
	}

}
