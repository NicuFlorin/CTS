package program;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import clase.Giraffe;
import clase.Zoo;

public class Main {

	public static void main(String[] args) {
		Zoo z = new Zoo();
		Giraffe giraffe = new Giraffe("girafa");
		Giraffe giraffe2 = new Giraffe("girafa 2");
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("eu sunt");

			}
		});
		thread.start();

		z.addAnimal(giraffe);
		z.addAnimal(giraffe2);
		z.feedAllAnimals();
	    

	}

}
