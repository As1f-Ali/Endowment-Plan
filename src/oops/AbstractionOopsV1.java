package oops;

abstract class AbstractionOopsV1 {

    abstract void eat();

    public static void main(String[] args) {
        Car c = new Car();
        System.out.println(c.fuelType());
        c.start();

        AbstractionOopsV1 obj = new AbstractionOopsV1() {
            @Override
            void eat() {
                System.out.println("Eating...");
            }
        };
        obj.eat();

        Vehicle ob = new Vehicle() {
            @Override
            void start() {
                System.out.println(" ");
            }
        };
        ob.start();
    }
}

abstract class Vehicle{  //Abstract Class
    abstract void start();  //Abstract Method

    String fuelType(){
        return "Generic Fuel";
    }
}

class Car extends Vehicle{

    //Implementation for abstract method start()

    void start(){
        System.out.println("Car Started!");
    }
}