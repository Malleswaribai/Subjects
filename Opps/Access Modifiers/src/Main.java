
class Person {
    private String Password = "xyz";
    String name;
    Integer age;
    protected String xyz; //this is a protected attribute, we can use it only in this class or the inherited class
}
class Student extends Person {
    String school;
    Student(String name, Integer age, String xyz, String school) {
        this.name = name;
        this.age = age;
        this.xyz = xyz;
        this.school = school;
    }
}
public class Main {
    public static void main(String[] args) {
        /*
        * access modifier - these defines capability of using pirticular attribute or methode with in '
        * the class or out side the class
        * type of modifiers are public, private, protected and default.
        * public: It means we can access that attribute or methode from any class.
        * private: Here we can access that attribute or method only with in the class , we can't access then from any other place else
        * default: The attributes which has default modifier which means no modifier can be accessed by any class with in that package
        * protected: We can use these attributes or methods only in that class or else the classes which are derived from the parent class.
        * */

        Student s1 = new Student("Malleswari", 21, "hello", "NIT AP");

        System.out.println(s1.name); // we can print this here because it is a default modifier, 
//        System.out.println(s1.Password); we cann't access this because it is a private modifier and it can't be used out side the class

        System.out.println(s1.xyz);

    }
}