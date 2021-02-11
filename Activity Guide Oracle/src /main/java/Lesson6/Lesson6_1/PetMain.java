package Lesson6.Lesson6_1;

public class PetMain {

    public static void main(String[] args) {
        Animal a;
        //test a spider with a spider reference
        Spider s = new Spider();
        s.eat();
        s.walk();
        //test a spider with an animal reference
        a = new Spider();
        playWithAnimal(a);

        
        //Add additional lines of code to test the Fish and Cat classes that you created.
        //Try using every constructor.
        Animal b;
        //test a Fish with a spider reference
        Fish f = new Fish();
        f.eat();
        f.walk();
        f.setName("Fishy");
        //test a Fish with an animal reference
        b = new Fish();
        playWithAnimal(b);

        //Experiment with using every reference type possible and determine which methods
            //can be called with each type of reference. Use a Pet reference while testing the
            //Fish and Cat classes.
        Animal c;
        //test a Fish with a spider reference
        Cat cat = new Cat();
        cat.eat();
        cat.walk();
        //test a Fish with an animal reference
        c = new Cat();
        playWithAnimal(c);      
            
    }
 //Call the playWithAnimal(Animal a) method from within main, passing in each
                //type of animal.   
//Implement and test the playWithAnimal(Animal a) method.
    public static void playWithAnimal(Animal a) {
        // completed in practice
         //Determine whether the argument implements the Pet interface. If so, cast the
                //reference to a Pet and invoke the play method. If not, print a message of "Danger!
                //Wild Animal".
        if (a instanceof Pet){
            Pet pet = (Pet)(a); 
            pet.play();
         }
        else{
            System.out.println("Danger, Wild Animal!\n\n");}

        
    }
    
}