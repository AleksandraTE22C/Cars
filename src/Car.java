public class Car {
    //attribute
    private String color;
    private int speed = 0; //Initial speed is 0 until further input
    private String name;
    private int maxSpeed;

    //constructor
    public Car(String incomingName, String incomingColor, int incomingMaxSpeed) {
        name = incomingName;
        color = incomingColor;
        maxSpeed = incomingMaxSpeed;
    }

    //methods

    public void speedUp(int change) {
        if (speed + change < maxSpeed) {
            speed = speed + change;
            System.out.println(name + " now has speed of " + speed);
        } else {
            System.out.println("You cannot exceed your max speed");
        }
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
