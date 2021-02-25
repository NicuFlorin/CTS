package program;

import clase.Giraffe;
import clase.Zoo;

public class Main {

	public static void main(String[] args) {
		Zoo z = new Zoo();
        Giraffe giraffe = new Giraffe("girafa");
        Giraffe giraffe2 = new Giraffe("girafa 2");
//        
        z.addAnimal(giraffe);
        z.addAnimal(giraffe2);
        z.feedAllAnimals();
		System.out.println("asa");
	}

}
