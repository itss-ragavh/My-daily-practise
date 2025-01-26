import java.util.*;
class Zoo {
    private String Zname;
    private String location;
    private List<Animal> animals; // List to hold multiple animals

    public Zoo(String Zname, String location) {
        this.Zname = Zname;
        this.location = location;
        this.animals = new ArrayList<>(); // Initialize the list of animals
    }

    public String getZname() {
        return Zname;
    }

    public String getLocation() {
        return location;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    // Add a new animal to the zoo
    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    // Display the details of the zoo and its animals
    public void ZooDetails() {
		
        System.out.println("\n\tZoo Name: " + Zname);
        System.out.println("\tZoo Location: " + location);
        System.out.println();
        for (Animal animal : animals) {
            System.out.println("\t\t  - Animal Name: " + animal.GetAname());
            System.out.println("\t\t    Animal Count: " + animal.GetCount());
            System.out.println("\t\t    Animal Origin: " + animal.GetOrigin());
            System.out.println();
        }
            System.out.println("=================================================");
    }
}