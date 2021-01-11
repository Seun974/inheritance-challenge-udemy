package se.lexicon.samuel;

public class Outlander extends Car{
    private int roadService;
    //At this specific stage, to can replace. like for this outlander class, Outlander is a specific model
    //so replace in the constructor with the correct value and delete from the constructor parenthesis
    //so at this point all that is needed to be passed for this specific car is roadService
    public Outlander(int roadService) {
        super("Outlander", "4WD", 5, 5, 6, false);
        this.roadService = roadService;
    }

    //since car is auto, we need an accelerate method for this car to enable it change gear
    //this can be a method even applied in the car class for other specific vehicles to inherit
    public void accelerate(int rate){
        int newVelocity = getCurrentVelocity() + rate;
        if(newVelocity == 0){
            stop();
          changeCurrentGear(1);
        } else if(newVelocity > 0 && newVelocity<=10){
            changeCurrentGear(1);
        }else if (newVelocity > 10 && newVelocity <= 20){
            changeCurrentGear(2);
        }else if (newVelocity > 20 && newVelocity <= 30) {
            changeCurrentGear(3);
        }else{
            changeCurrentGear(4);
        }

        if(newVelocity > 0){
            changeVelocity(newVelocity, getCurrentDirection());
        }

    }


}
