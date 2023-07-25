package inheritance;

import Polymorphism.MethodOverLoading;

public class RunnerClass {

    public static void main(String[] args) {

        Son son = new Son();
        son.myPro();
        son.educate();
        son.carStart();


        MethodOverLoading obj= new MethodOverLoading();
        obj.doSum();

    }


}
