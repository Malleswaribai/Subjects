class Car {
    String brand;
    String vehicleNumber;
    String color;
    static Integer wheels = 4;
    Car(String brand, String vehicleNumber , String color) {
        this.brand = brand;
        this.vehicleNumber = vehicleNumber;
        this.color = color;
    }
    public void describeCar() {
        // you can use static attributes or methods anywhere
        System.out.println("This is a car of brand " + this.brand + " and it runs on " + this.wheels);
    }

    public static void NumberofWheels() {
        System.out.println("I have "+ wheels +" wheels");
//        System.out.println("I have "+ this.wheels + " wheels");
        /*
        * The above line will give us error
        * java: non-static variable this cannot be referenced from a static context
        * because this refers to Object from which we are calling that object
        * sometimes the static method or keyword may be called from object it self , where we have this keyword
        * but sometimes these static methods or attributes may also called by the class.
        * SO if it is class then there is this keyword.
        * so to remove the confusion java have disabled usage of this keyword in static context.
        * we can't use non-static attributes or methods with in the static context
        *
        * */
    }
}
/*
* Static key word means that particular attribute or methode will be same of all the instances
* of the class.
* this is the keyword which fetches the current object details
* */
public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("Tata0", "xyz", "red");
//        Car c2 = new Car("Maruthi", "asldkjfsd", "green");
//        Car c3 = new Car("kia", "asldkfdsj", "grey");
//        c1.describeCar();
        Car.wheels = 20;
        Car.NumberofWheels(); // we can use the static attributes or methods with out creating the objects directly by class
//        c2.describeCar();
//        c3.describeCar();

    }
}