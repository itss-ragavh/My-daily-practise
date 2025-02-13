# Car and Engine Object Sorting

This project demonstrates how to create and sort a list of `Car` objects based on different attributes like price, brand, and color. It uses custom classes for `Car` and `Engine` to showcase object-oriented principles in Java.

## Project Structure

- **Car Class**: Represents a car with attributes like brand, color, price, engine details, fuel type, and engine type.
- **Engine Class**: Represents an engine with attributes like engine capacity (cc) and engine number.
- **Sorting**: The program sorts a list of `Car` objects by:
  - Price (ascending order)
  - Brand (alphabetically)
  - Color (alphabetically)

## How to Run

1. Clone this repository:
   
       git clone https://github.com/yourusername/Car-Engine-Sorting.git
   
3. Navigate to the project directory:

        cd Car-Engine-Sorting
   
3. Compile and run the CarEngineObjGen.java file:

        javac CarEngineObjGen.java
        java CarEngineObjGen
          
## Classes

1. Engine Class

            class Engine {
            int cc;
            int engineNo;
    
             Engine(int cc, int engineNo) {
                 this.cc = cc;
                 this.engineNo = engineNo;
              }
            }

2.  Car Class

        class Car {
        String brand;
        String color;
        double price;
        Engine e;
        String fuelType;
        String engineType;
    
        Car(String brand, String color, double price, Engine e, String fuelType, String engineType) {
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.e = e;
        this.fuelType = fuelType;
        this.engineType = engineType;
        }
    
        public void CarDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Engine CC: " + e.cc);
        System.out.println("Engine No: " + e.engineNo);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Engine Type: " + engineType);
        System.out.println("-----------------------------------");
        }
        }

3. Main Class (CarEngineObjGen)
   
        public class CarEngineObjGen {
            public static void main(String[] args) {
            ArrayList<Car> cars = new ArrayList<>();
        
        cars.add(new Car("BMW", "Black", 199999, new Engine(3000, 7887), "Petrol", "V6"));
        cars.add(new Car("Audi", "Silver", 290099, new Engine(3000, 7887), "Diesel", "V8"));
        cars.add(new Car("Mercedes", "White", 500000, new Engine(4000, 1234), "Electric", "Electric"));
        cars.add(new Car("BMW", "Red", 250000, new Engine(3500, 5678), "Hybrid", "V6"));
        cars.add(new Car("Tesla", "Blue", 800000, new Engine(0, 9876), "Electric", "Electric"));
        
        System.out.println("Cars sorted by Price (Low to High):");
        Collections.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                return Double.compare(car1.price, car2.price);
            }
        });
        for (Car car : cars) {
            car.CarDetails();
        }

        System.out.println("Cars sorted by Brand:");
        Collections.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                return car1.brand.compareTo(car2.brand);
            }
        });
        for (Car car : cars) {
            car.CarDetails();
        }

        System.out.println("Cars sorted by Color:");
        Collections.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                return car1.color.compareTo(car2.color);
            }
        });
        for (Car car : cars) {
            car.CarDetails();
        }
        }
        }

## Output Example

The program will display cars sorted by:

- Price (Low to High)
- Brand (Alphabetically)
- Color (Alphabetically)



  ## Contact Details

If you have any questions or feedback, feel free to reach out:

- **Email**: harishragavendra2305@gmail.com
- **LinkedIn**: [linkedin.com/in/harishragavendra23](https://www.linkedin.com/in/harishragavendra23)

Thanks for checking out this project!



      
