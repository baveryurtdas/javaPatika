public class Car {
    // Nitelikler
    String type;
    String model;
    String color;
    int speed;
    int speedLimit;


    Car(String type,String model, String color){
        this.type=type;
        this.model=model;
        this.color=color;
        this.speed=0;
        this.speedLimit=180;
    }


    void increaseSpeed(int increment) {
        if (this.speed + increment < this.speedLimit) {
            this.speed += increment;
        }
    }

    void decreaseSpeed(int decrease) {
        if (this.speed-decrease > this.speedLimit) {
            this.speed -= decrease;
        }
    }


    void printInfo(){
        System.out.println("============");
        System.out.println("Model \t: " + this.model);
        System.out.println("Color \t: " + this.color);
        System.out.println("Type \t: " + this.type);
        System.out.println("Speed \t: " + this.speed);
    }

}





