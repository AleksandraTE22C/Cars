import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Working with cars");

        //Datatype variableName = create the object

        //Create a car
        Car car1 = new Car("Hudson", "Blue", 200);

        //Create second car
        Car car2 = new Car("Mater", "Brown", 100);

        System.out.println(car1.getName() + " is " + car1.getColor() + " and has a max speed of " + car1.getMaxSpeed());
        System.out.println(car2.getName() + " is " + car2.getColor() + " and has a max speed of " + car2.getMaxSpeed());

        car1.speedUp(115);
        car2.speedUp(200);


        //Car[] myCars = new Car[10]; //this is a static array

        ArrayList<Car> cars = new ArrayList<>();
        //add the cars to the list
        cars.add(car1);
        cars.add(car2);
        cars.add(new Car("Lightning McQueen", "Red", 400));

        Car theCar = cars.get(2);
        System.out.println(theCar.getName() + " is " + theCar.getColor() + " and has a max speed of " + theCar.getMaxSpeed());
    }
}