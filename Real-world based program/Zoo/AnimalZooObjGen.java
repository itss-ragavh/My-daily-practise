import java.util.*;
public class AnimalZooObjGen {
    public static void main(String[] args) {
        // Create zoos
        Zoo z1 = new Zoo("Vandalur", "Chennai");
        Zoo z2 = new Zoo("ARIGNAR ANNA ZOOLOGICAL PARK", "Chennai");
        Zoo z3 = new Zoo("Amirthi Zoological Park", "Vellore");
        Zoo z4 = new Zoo("ARIGNAR ANNA ZOOLOGICAL PARK", "Chennai");
        Zoo z5 = new Zoo("Chennai Snake Park", "Chennai");

        // Add animals to Zoo z1
        z1.addAnimal(new Animal("Lion", 15, "Bangladesh"));
        z1.addAnimal(new Animal("Elephant", 8, "India"));

        // Add animals to Zoo z2
        z2.addAnimal(new Animal("Tiger", 10, "Bengal"));
        z2.addAnimal(new Animal("Bear", 5, "America"));

        // Add animals to Zoo z3
        z3.addAnimal(new Animal("Monkey", 50, "China"));
        z3.addAnimal(new Animal("Giraffe", 4, "Africa"));

        // Add animals to Zoo z4
        z4.addAnimal(new Animal("Camel", 10, "Pakistan"));
        z4.addAnimal(new Animal("Kangaroo", 3, "Australia"));

        // Add animals to Zoo z5
        z5.addAnimal(new Animal("Cobra", 2, "Philippines"));
        z5.addAnimal(new Animal("Python", 6, "Africa"));

		System.out.println("\n\t\tList of Animals in Zoo with their details\n\n");
        // Display details of all zoos and their animals
        z1.ZooDetails();
        z2.ZooDetails();
        z3.ZooDetails();
        z4.ZooDetails();
        z5.ZooDetails();
    }
}
