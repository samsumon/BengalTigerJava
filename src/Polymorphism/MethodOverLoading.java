package Polymorphism;

public class MethodOverLoading {

    public void doSum() {
        System.out.println("This is a no-parameterized method");
    }

    public void doSum(int a) {
        System.out.println("This is a parameterized method which can take one integer");
    }

    public void doSum(int a, int b) {
        System.out.println("This is a parameterized method which can take two integer");
    }

    public void doSum(String a, int b) {
        System.out.println("This is a parameterized method which can take one String and one  integer");
    }

}
