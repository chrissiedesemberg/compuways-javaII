package Lesson_19.Lesson19_1.src.com.example.localization;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.ResourceBundle;

public class DateApplication {
    PrintWriter pw = new PrintWriter(System.out, true);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    Locale ruLocale = new Locale("ru", "RU");
    Locale currentLocale = Locale.US;
    ResourceBundle messages = ResourceBundle.getBundle("Lesson_19\\Lesson19_1\\src\\MessagesBundle.properties", Locale.US);
    //ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle",  currentLocale);

    LocalDateTime today = LocalDateTime.now();
    DateTimeFormatter df;

    public static void main(String[] args){
        DateApplication dateApp = new DateApplication();
        dateApp.run();
    }

    public void run(){
        String line = "";

        while (!(line.equals("q"))){
            this.printMenu();
            try { line = this.br.readLine(); }
            catch (IOException e){
              System.out.println("Error: " + e.getMessage()); }

            switch (line){
                case "1": this.setEnglish(); break;
                case "2": this.setFrench(); break;
                case "3": this.setChinese(); break;
                case "4": this.setRussian(); break;
            }
        }
    }

    public void printMenu(){
      pw.println("=== Date App ===");

      // Full Date
        df = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(currentLocale);
        pw.println(messages.getString("Full date") + " " + today.format(df));
      // Long Date
        df = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).withLocale(currentLocale);
        pw.println(messages.getString("Long date") + " " + today.format(df));
      // Short Date
        df = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(currentLocale);
        pw.println(messages.getString("Short date") + " " + today.format(df));
      // Medium Date/Time
        df = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(currentLocale);
        pw.println(messages.getString("Medium date") + " " + today.format(df));
      // Medium Time
        df = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM).withLocale(currentLocale);
        pw.println(messages.getString("Medium Time") + " " + today.format(df));

        pw.println("\n--- Choose Language Option ---");
        pw.println("1. " + messages.getString("menu1"));
        pw.println("2. " + messages.getString("menu2"));
        pw.println("3. " + messages.getString("menu3"));
        pw.println("4. " + messages.getString("menu4"));
        pw.println("q. " + messages.getString("menuq"));
        System.out.print(messages.getString("menucommand") + " ");
    }

    public void setEnglish(){
        // Set currentLocale
        currentLocale = Locale.US;
        // Set messages
        messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
    }

    public void setFrench(){
        // Set currentLocale
        currentLocale = Locale.FRANCE;
        // Set messages
        messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
    }

    public void setChinese(){
        // Set currentLocale
        currentLocale = Locale.CHINESE;
        // Set messages
        messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
    }

    public void setRussian(){
        // Set currentLocale
        currentLocale = ruLocale;
        // Set messages
        messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
    }
}
