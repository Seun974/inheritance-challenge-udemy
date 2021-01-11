package se.lexicon.samuel;

//this is like a category of vehicle
public class Car extends Vehicle {
    //put your fields before you add the fields from super
    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;


    private int currentGear;

    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1; //assigned 1 to assume that for every car, default gear is 1
    }

    public void changeCurrentGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.changeCurrentGear(): Changed to " + this.currentGear + " gear.");
    }

    public void changeVelocity(int speed, int direction){
        System.out.println("Car.changeVelocity() : Velocity " + speed + " direction " + direction);
        move(speed, direction);
    }


}
