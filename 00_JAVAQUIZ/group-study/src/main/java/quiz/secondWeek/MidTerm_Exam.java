package quiz.secondWeek;

import quiz.secondWeek.*;

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

