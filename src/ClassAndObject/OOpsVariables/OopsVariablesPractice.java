package ClassAndObject.OOpsVariables;
class raj {
    int age;
}

public class OopsVariablesPractice {
    //int age;//Instance variable
    public static void main(String[] args) {
        //Local variable
        raj r1 = new raj();
        r1.age = 23;
        String name = "srinath";//Local variable
        System.out.println(r1.age);
        System.out.println(name);
    }
}
