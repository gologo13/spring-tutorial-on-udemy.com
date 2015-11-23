import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Jungle {

	private Animal largest;
	private HashMap<String, String> foods = new HashMap<String, String>();
	private HashMap<String, Animal> animals = new HashMap<String, Animal>();
	
	public Animal getLargest() {
		return largest;
	}
	public void setLargest(Animal largest) {
		this.largest = largest;
	}
	public void setAnimals(HashMap<String, Animal> animals) {
		this.animals = animals;
	}

	public void setFoods(HashMap<String, String> foods) {
		this.foods = foods;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Largest: " + largest);
		sb.append("\n");
		sb.append("Animals:\n");
		
		for (Map.Entry<String, Animal> entry : this.animals.entrySet()) {
			sb.append(entry.getKey() + ": " + entry.getValue() + "\n");
		}
		
		sb.append("Foods:\n");
		for (Map.Entry<String, String> entry : this.foods.entrySet()) {
			sb.append(entry.getKey() + ": " + entry.getValue() + "\n");
		}
		
		return sb.toString();
	}

}
