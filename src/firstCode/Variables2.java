package firstCode;

public class Variables2 {

    final String NAME= "Tasnim";

    String name= "Tasnim";
    public static int age = 20;



    public void makeCar() {
       // Variables2 vr = new Variables2();


        this.name="Rumel";
       String carName= "Tesla";
        System.out.println(name + "'s Car name is " + carName);
        System.out.println("Saikot is "+ age + " years old.");
    }


    public static void main(String[] args) {

       Variables2 vari = new Variables2();

        System.out.println(vari.name);
        System.out.println(vari.age);
        vari.makeCar();
       // System.out.println(vari.carName);

    }


}
