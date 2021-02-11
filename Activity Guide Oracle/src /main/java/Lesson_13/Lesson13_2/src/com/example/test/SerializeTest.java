package Lesson_13.Lesson13_2.src.com.example.test;

import Lesson_13.Lesson13_2.src.com.example.domain.Item;
import Lesson_13.Lesson13_2.src.com.example.domain.ShoppingCart;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.text.NumberFormat;

public class SerializeTest {

    public static void main(String[] args) throws FileNotFoundException {
        String directory = "/Users/Chrissie/Desktop/Java II/Java2_Practice/src/main/java/Lesson_13/Lesson13_2/src/com/example/test/SerializeTest.java" ;
        String cartId = null;
        ShoppingCart cart = null;
        System.out.println("Enter the ID of the cart file to create and serialize or q exit.");
        // Wrap the System.in InputStream with a BufferedReader to read
        // each line from the keyboard.
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            cartId = in.readLine();
            if (cartId.equals("q")) {
                System.exit(0);
            }
            cart = new ShoppingCart(new Integer(cartId).intValue());
        } catch (NumberFormatException | IOException e) { // Catch any exceptions.
            System.out.println("Exception: " + e);
            System.exit(-1);
        }
        // Add some items
        cart.addItem(new Item(101, "Duke Plastic Circular Flying Disc", 10.95));
        cart.addItem(new Item(123, "Duke Soccer Pro Soccer ball", 29.95));
        cart.addItem(new Item(45, "Duke \"The Edge\" Tennis Balls - 12-Ball Bag", 17.49));

        // Print some messages about the cart
        System.out.println("Shopping cart " + cartId + " contains " + cart.getCartSize() + " items");
        System.out.println("Shopping cart total: "
                + NumberFormat.getCurrencyInstance().format(cart.getCartTotal()));

        String cartFile = directory + "cart" + cart.getCartID() + ".ser";
        // Your code goes here....
        try (FileOutputStream fos = new FileOutputStream(cartFile); ObjectOutputStream out = new ObjectOutputStream(fos)) {
            out.writeObject(cart);

        } catch (IOException e) {
            e.getMessage();
            e.printStackTrace();
            System.exit(-1);
        }

        System.out.println("Successfully serialized shopping cart with ID: " + cart.getCartID());
    }
}