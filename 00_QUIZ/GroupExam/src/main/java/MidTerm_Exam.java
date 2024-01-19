public class MidTerm_Exam {
    public static void main(String[] args) {
        Vehicle v[] = new Vehicle[3];
        v[0] = new Cycle();
        v[1] = new Car();
        v[2] = new ElectricCar();
        for(int i = 0; i<v.length; i++){
            System.out.println(v[i].name());
        }
    }
}

class Vehicle {
    public String name(){
        return "vehicle";
    }
}

class Car extends Vehicle{
    @Override
    public void name(){
        System.out.println("car");
    }
}

class ElectricCar extends Car{
    @Override
    public String name(){ return "electric car";}
}

class Cycle extends Vehicle{
    @Override
    public String name(){ return "cycle";}
}
