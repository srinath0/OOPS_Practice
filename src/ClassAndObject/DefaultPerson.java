package ClassAndObject;

public class DefaultPerson {
    String name;
    int age;
    String Gender;

// Default Constuctor--if values not assigned it will be taking the default values
    public DefaultPerson(){
        name = "Unknown";
        age = 24;
        Gender = "Male";
        System.out.println("Default Constructor");
    }


}
