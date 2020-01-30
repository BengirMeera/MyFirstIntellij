package project.intel.a1;

 public class Bicycle {
     static int cadence = 0;
     int speed = 0;
     int gear = 1;
     String cycleBrand = "Bax";
     String grade = "A";
     double number = 4.0000000F;

     void changeCadance(int newValue) {
         cadence = newValue;
         System.out.println("This will change cadence");
     }

     void changeGear(int newValue) {
         gear = newValue;
         System.out.println("This will change gear");
     }

     void speedUp(int increment) {
         speed = speed + increment;
         System.out.println("This will speedUp");
     }

     void applyBrakes(int decrement) {
         speed = speed - decrement;
         System.out.println("This will make break");
     }

     void printStates() {
         System.out.println(
                 "cadence:" + cadence +
                         "speed:" + speed +
                         "gear:" + gear);
     }




    public static void main (String []args){
        Bicycle meersBicycle = new Bicycle();
        meersBicycle.changeCadance(20);
        meersBicycle.changeGear( 4);
        meersBicycle.speedUp( 15);
        System.out.println(cadence);

    }


}


