package ClassAndObject;

public class DefaultPersonMain {
    public static void main(String[] args) {
        DefaultPerson p1 = new DefaultPerson();
//        p1.name = "srinath";
//        p1.age = 23;
//        p1.Gender = "Male";
        System.out.println("Name-" + p1.name);
        System.out.println("Age-" + p1.age);
        System.out.println("Gender-" + p1.Gender);
        //System.out.println(person1);
        DefaultPerson p2 = new DefaultPerson();
            p2.name = "srinath";
            p2.age = 23;
            p2.Gender = "Male";
            System.out.println("Name:" + p2.name);
            System.out.println("Age:" + p2.age);
            System.out.println("Gender:" + p2.Gender);
    }
}

