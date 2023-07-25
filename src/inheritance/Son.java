package inheritance;

public class Son extends Father {


    public void myPro(){
        System.out.println(" This is from child class");
    }


    @Override
     public void carStart() {
        System.out.println(" Remote Car start  ");
    }

    
}
