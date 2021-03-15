package chapter13_input_output_try_with_resources;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TinyEdit {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str[] = new String[100];
        System.out.println("Enter lines of text");
        System.out.println("Enter 'stop' to quit");
        for (int i = 0; i < 100; i++) {
            str[i] = br.readLine();
            if(str[i].equals("stop")) {break;}
        }
        System.out.println("Here is what was typed:");
        for(int i = 0; i < 100; i++) {
            if(str[i].equals("stop")) break;
            System.out.println(str[i]);
        }


    }

}
