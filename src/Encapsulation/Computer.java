package Encapsulation;

public class Computer {

    private int age;

    public int getAge() {

        return age;
    }

    public int setAge(int age) {
        this.age= age;
        System.out.println("My age is " + age);
        return age;
    }




        // Data Hiding

        private String computerName;
        private String computerBrand;
        private String computerPrice;
        public boolean isAvailable;

        public Computer() {

        }

        // Getter and Setter


        public String getComputerName() {
            return computerName;
        }

        public void setComputerName(String computerName) {
            this.computerName = computerName;
        }

        public String getComputerBrand() {
            return computerBrand;
        }

        public void setComputerBrand(String computerBrand) {
            this.computerBrand = computerBrand;
        }

        public String getComputerPrice() {
            return computerPrice;
        }

        public void setComputerPrice(String computerPrice) {
            this.computerPrice = computerPrice;
        }
    }



