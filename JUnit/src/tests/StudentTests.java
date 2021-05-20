package tests;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import ro.ase.cts.clase.Student;

public class StudentTests {

	@Test
	public void testConstructorParametru() {
		String nume = "Gigel";
		Student student = new Student(nume);

		assertEquals("Numele nu a fost initializat",nume, student.getNume());
		
		assertNotNull("Lista de note nu a fost initializata",student.getNote());

	}
	
	@Test
	public void testConstructorFaraParametrii() {
		Student student = new Student();
		assertNotNull("Numele nu a fost initializat",student.getNume());
		assertNotNull("Notele nu au fost initializate",student.getNote());

	}

	@Test
	public void setterNume() {
		String nume = "Gigel";
		Student student = new Student();

		student.setNume(nume);
		assertEquals(nume, student.getNume());	

	}
	
	@Test
	public void testAdaugarNote() {
		Student student = new Student("Marcel");
		int nota =8;
		student.adaugaNota(nota);
		assertEquals(nota, student.getNota(0));

	}
	
	@Test
	public void testDimensiuneLista() {
		Student student = new Student("Marcel");
		int nota =8;
		student.adaugaNota(nota);
		assertEquals(1, student.getNote().size());

	}

}
