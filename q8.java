abstract class MotorBike {
    void brake();  //abstract void brake();
}

class SportsBike{    //class SportsBike extends MotorBike {
    public void brake(){
        System.out.println("SportsBike Brake");
    }
}

class MountainBike extends MotorBike {
    public void brake{    //public void brake(){
        System.out.println("MountainBike Brake");
    }
}

class q8 {
    public static void main(string[] args) {    //public static void main(String[] args) {
        MountainBike m1 = new MountainBike();
        SportsBike s1 = new SportsBike()   //SportsBike s1 = new SportsBike();
        m1.brake();
        s1.brake();
    } 
}

//HARD