package ro.ase.cts.teste;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;


import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.Student;

public class TestGrupa {
	

	
	@Test
	public void testConstuctor() {
		Grupa grupa = new Grupa(1083);
		assertEquals(1083, grupa.getNrGrupa());
	}

	@Test
	public void testConstuctorLimitaInferioara() {
		Grupa grupa = new Grupa(1000);
		assertEquals(1000, grupa.getNrGrupa());

	}

	@Test
	public void testConstuctorLimitaSuperioara() {
		Grupa grupa = new Grupa(1100);
		assertEquals(1100, grupa.getNrGrupa());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testConstuctorException() {
		Grupa grupa = new Grupa(10);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testConstuctorException2() {
		Grupa grupa = new Grupa(1200);

	}

	@Test(timeout = 500)
	public void testConstuctorPerformance() {
		Grupa grupa = new Grupa(1023);

	}

	@Test
	public void testConstuctorExistance() {
		Grupa grupa = new Grupa(1055);
		assertNotNull(grupa.getStudenti());

	}

	@Test
	public void testPromovablitate() {
		Grupa grupa = new Grupa(1053);

		for (int i = 0; i < 3; i++) {
			Student student = new Student("Marcel");
			student.adaugaNota(3);
			grupa.adaugaStudent(student);
		}
		for (int i = 0; i < 7; i++) {
			Student student = new Student("Ion");
			student.adaugaNota(7);
			grupa.adaugaStudent(student);
		}

		float promovabilitate = 0.7f;
		assertEquals(promovabilitate, grupa.getPromovabilitate(), 0.1);

	}

	@Test
	public void testPromovabilitateBoundary() {
		Grupa grupa = new Grupa(1053);

		for (int i = 0; i < 3; i++) {
			Student student = new Student("Marcel");
			student.adaugaNota(3);
			grupa.adaugaStudent(student);
		}
		float promovabilitate = 0f;
		assertEquals(promovabilitate, grupa.getPromovabilitate(),0.1);
	}
	
	@Test
	public void testPromovabilitateBoundary2() {
		Grupa grupa = new Grupa(1053);

		for (int i = 0; i < 7; i++) {
			Student student = new Student("Ion");
			student.adaugaNota(7);
			grupa.adaugaStudent(student);
		}
		float promovabilitate = 1f;
		assertEquals(promovabilitate, grupa.getPromovabilitate(),0.1);
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testPromovabilitateExceptioon() {
		Grupa grupa = new Grupa(1053);

		
		float promovabilitate = 0f;
		assertEquals(promovabilitate, grupa.getPromovabilitate(),0.1);
	}

	
	
	

}
