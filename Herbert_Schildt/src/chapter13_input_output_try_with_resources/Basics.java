package chapter13_input_output_try_with_resources;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Basics {

    public static void main(String[] args) throws IOException {

//        char c;
        String str;

        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
//        System.out.println("Enter characters, 'q' to quit");
        System.out.println("Enter String, 'stop' to quit");

        do {
            str = br.readLine();
//        c = (char) br.read();
            System.out.println(str);

//        } while( c != 'q');
        } while( !str.equals("stop"));
    }

}
