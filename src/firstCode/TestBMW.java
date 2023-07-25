package firstCode;

public class TestBMW {
    public static void main(String[] args) {
        BMW jonhyBmw=new BMW();
        jonhyBmw.carInfo("BMW 3","BMW");

        Car fahimBmw=new BMW();
        fahimBmw.carStart();
        fahimBmw.carStop();
        fahimBmw.carBrand="BMW";
        System.out.println(fahimBmw.carBrand);

        Car myCar=new Car();
        myCar.isAvailable=true;
        myCar.carStart();



    }

}
