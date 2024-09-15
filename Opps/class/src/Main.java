import java.time.Period;

/*
* Class : it is a blue print of an object
* Object: It is an instance of an class.
* Objects will consume memory where as classes don't.
* Let us consider a building plan, the plan which is there to create a building is something like class.
* But the actual houses which have been built using that plan are the instance of that plan which are similar to objects in real life.
*
* Class: using class we can combine different set of attributes and metnods with in the same class.
* */
class Address {
    String houseNumber;
    String city;
    String state;
    String country;
    String zipCode;
    void printAddress() {
        System.out.println(this.houseNumber + ","+this.city + ","+this.state + "." +this.zipCode);
    }
}
class Person {
    String name;
    Integer age;
    Address address; // here address is an attribute of Persion class which is a object of a class Address
    void whoIsHe() {
        System.out.println("This is " + this.name + ", i am " + this.age + " old ");
        this.address.printAddress();
    }
    void getAddress() {
        this.address.printAddress();
    }
}
public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(); // here new keyword creates an instance of the given class and return the refernce to that created object or instance.
        // in java every class object takes refernce when we assign it to some variable except primitive data types like string, int, bool , .. etc
        p1.name = "malleswari";
        p1.age = 21;

        Address a1 = new Address();
        a1.houseNumber = "192";
        a1.city = "ongole";
        a1.state = "AP";
        a1.zipCode = "560093";

        p1.address = a1;

        Person p2 = new Person();
        p2.name = "Jayaram";
        p2.age = 22;

        p1.whoIsHe();

        p1.getAddress();

    }
}