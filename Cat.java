/**
 * Created by Donatas Auzelis
 * Date: 2020-09-25
 * Time: 09:14
 * Project: OOP_Uppgift_1
 * Copyright: MIT
 */
public class Cat extends Animal implements Food {

    public Cat(String name, int weight) {
        super(name, weight);
    }

    public String getMeasurement() {
        return "Kattfoder: " + weight * 1000 / 150 + "g.";
    }

}
