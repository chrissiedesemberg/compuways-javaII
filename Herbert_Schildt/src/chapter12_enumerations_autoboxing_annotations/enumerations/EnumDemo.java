package chapter12_enumerations_autoboxing_annotations.enumerations;

public class EnumDemo {

    public static void main(String[] args) {

        Apple ap;

        ap = Apple.RedDel;

        System.out.println("Value of ap: " + ap);
        System.out.println();

        ap = Apple.GoldenDel;

        if(ap == Apple.GoldenDel)
            System.out.println("ap contains GoldenDel.\n");
            System.out.println("Price of " + ap.name() + " is " + ap.getPrice()+ ".");
            ap.setPrice(30);
            System.out.println("Price of " + ap.name() + " now increased with 10.");
        System.out.println("Price of " + ap.name() + " is " + ap.getPrice()+ ".");

        switch(ap) {
            case Jonathan:
                System.out.println("Jonathan is red");
                break;
            case GoldenDel:
                System.out.println("Golden Delicious is yellow");
                break;
            case RedDel:
                System.out.println("Red Delicious is red");
                break;
            case Winesap:
                System.out.println("Winesal is red");
                break;
            case Cortland:
                System.out.println("Cortland is red");
                break;

        }



    }

}
