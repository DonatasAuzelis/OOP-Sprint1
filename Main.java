import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Dessa djur bor på hotellet:

        //Eftersom class Animal implements Food, kan man därför skapa en Animal object och använda metoder i Food interface
        Animal dog1 = new Dog("Sixten", 5);
        Dog dog2 = new Dog("Dogge", 10);

        Animal cat1 = new Cat("Venus", 5);
        Cat cat2 = new Cat("Ove", 3);

        Snake snake1 = new Snake("Hypno", 1);


        //User interface med loop för fel input
        while (true) {

            String input = JOptionPane.showInputDialog(null, "Vilket djur ska få mat?");

            if (input.equalsIgnoreCase(dog1.getName())) {
                System.out.println(dog1.getMeasurement());
                break;
            }
            else if (input.equalsIgnoreCase(dog2.getName())) {
                System.out.println(dog2.getMeasurement());
                break;
            }
            else if (input.equalsIgnoreCase(cat1.getName())) {
                System.out.println(cat1.getMeasurement());
                break;
            }
            else if (input.equalsIgnoreCase(cat2.getName())) {
                System.out.println(cat2.getMeasurement());
                break;
            }
            else if (input.equalsIgnoreCase(snake1.getName())) {
                System.out.println(snake1.getMeasurement());
                break;
            }
            else System.out.println("Okänd namn, försök igen!");

        }


    }




}
