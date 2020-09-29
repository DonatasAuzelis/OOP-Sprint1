/**
 * Created by Donatas Auzelis
 * Date: 2020-09-25
 * Time: 09:14
 * Project: OOP_Uppgift_1
 * Copyright: MIT
 */
public class Dog extends Animal{

    public Dog(String name, int weight) {
        super(name, weight);
    }

    public String getMeasurement() {
        return "Hundfoder: " + weight * 1000 / 100 + "g.";
    }

}
