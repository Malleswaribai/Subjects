class Person {
    String name;
    Integer age;
    String address;
    Person(String givenName) {
        // it is a custom constructor which will take a parameter string and assign it to the name attribute to that object
        // custom constructors will help us to assign the values of the created object while the time of declaration or calling contructor method
        // it will reduce lot of code redundancy.
        this.name = givenName;
    }
    // when ever we create atlease one custom constructor then the default constructor will vanish away then we have to declare default constructor manually
    Person() {
        // this is the default contructor
    }

    Person(String givenName, Integer age) {
        this.name = givenName;
        this.age = age;
    }
    // we use copy constructors to copy the attributes from one object to the another.
    Person(Person p) {
        this.name = p.name;
        this.age = p.age;
    }
}
// when we have not added any custom constructor there will be a default constructor which won't take any parameter init.
// and it will create an instance of that class

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Jayaram"); // it is a default constructor.
        System.out.println(p1.name);
        Person p2 = new Person();
        p2.name = "Malleswari";
        p2.age = 30;

        System.out.println(p2.name);

        Person p3 = new Person("Brahmanji", 18);

        System.out.println(p3.age);

        Person p4 = new Person(p2);

        p4.age = 50;

        System.out.println(p2.age + " " + p4.age);
    }
}