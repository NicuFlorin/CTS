package clase;

import java.util.ArrayList;
import java.util.List;



public class Zoo {
	private Zookeeper ingrijitor;
	private List<Animal> animale;
	public Zoo(Zookeeper ingrijitor, List<Animal> animale) {
		super();
		this.ingrijitor = ingrijitor;
		this.animale = animale;
	}
	
	public Zoo() {
		ingrijitor = new Zookeeper("Gigel");
		this.animale = new ArrayList<Animal>();
	}
	
	public void addAnimal(Animal animal) {
		animale.add(animal);
	}
    public void feedAllAnimals() {
    	for(Animal animal:animale) {
    		ingrijitor.feed(animal);
    	}
    }
    

	
}
