package ClassAndObject;

public class MainCar {
    public static void main(String[] args){
        Car nano = new Car();//Object Creation,class loading,object reference
        nano.brand = "TATA";
        System.out.println(nano.hashCode());
        System.out.println(nano);
        nano.model = "Nano";
        nano.year = 2024;
        //Class And Object
        System.out.println("CarBrand:-" +nano.brand);
        System.out.println("Carmodel:-" +nano.model);
        System.out.println("CarYear:-" +nano.year);
    }
}
