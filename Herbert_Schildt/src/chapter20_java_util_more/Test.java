package chapter20_java_util_more;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Test {

    public static void main(String[] args) throws IOException {

//        Date dateCurrent = new Date();
//
//        System.out.println(dateCurrent);
//
//        long msec = dateCurrent.getTime();
//        System.out.println(msec);
//
//
//        String months[] = {
//                "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
//        };
//
//        Calendar calendar = Calendar.getInstance();
//
//        System.out.print("Date: ");
//        System.out.print(months[calendar.get(Calendar.MONTH)]);
//        System.out.print(" " + calendar.get(Calendar.DATE) + " ");
//        System.out.println(calendar.get(Calendar.YEAR));
//
//        System.out.print("Time: ");
//        System.out.print(calendar.get(Calendar.HOUR) + ":");
//        System.out.print(calendar.get(Calendar.MINUTE)+ ":");
//        System.out.println(calendar.get(Calendar.SECOND));
//
//
//        Random r = new Random();
//        double val;
//        double sum = 0;
//        int bell[] = new int[10];
//
//        for (int i=0; i < 100; i++) {
//            val = r.nextGaussian();
//            sum += val;
//            double t = -2;
//
//            for (int x = 0; x<10; x++, t += 0.5){
//                if (val < t) {
//                    bell[x]++;
//                    break;
//                }
//            }
//        }
//
//            System.out.println("Average of values: " + (sum/100));
//
//            for ( int i=0; i < 10; i++){
//                    for( int x=bell[i]; x>0; x--)
//                        System.out.print("*");
//                    System.out.println();
//
//                }
//
//
//        MyTimerTask myTask = new MyTimerTask();
//        Timer myTimer = new Timer();
//
//        myTimer.schedule(myTask, 1000, 500);
//
//        try {
//            System.out.println("Set thread to sleep");
//            Thread.sleep(5000);
//            System.out.println("Sleep over");
//        } catch( InterruptedException ie) {}
//
//        myTimer.cancel();
//
//        System.out.println("\n\n\n\n");
//        Currency c;
//
//        c = Currency.getInstance(Locale.US);
//
//        System.out.println("Symbol: " + c.getSymbol());
//        System.out.println("Default fractional digits: " + c.getDefaultFractionDigits());
//
//        System.out.println();
//        System.out.println();
//
//        Formatter fmt1 = new Formatter();
//        fmt1.format("Formatting %s is easy %d %f", "with Java", 10, 98.6);
//        System.out.println(fmt1);
//        System.out.println();
//        System.out.println();
//
//
//        Formatter fmt2 = new Formatter();
//        Calendar cal = Calendar.getInstance();
//
//        fmt2.format("%tr", cal);
//        System.out.println(fmt2);
//        fmt2.close();
//        System.out.println();
//
//        fmt2 = new Formatter();
//        fmt2.format("%tc", cal);
//        System.out.println(fmt2);
//        fmt2.close();
//        System.out.println();
//
//        fmt2 = new Formatter();
//        fmt2.format("%tl:%tM", cal, cal);
//        System.out.println(fmt2);
//        fmt2.close();
//        System.out.println();
//
//        fmt2 = new Formatter();
//        fmt2.format("%tB,%tb %tm", cal, cal, cal);
//        System.out.println(fmt2);
//        fmt2.close();
//        System.out.println();
//
//        System.out.println();
//        System.out.println();

//        Scanner conin = new Scanner(System.in);
//        int count = 0;
//        double sum = 0.0;
//
//        System.out.println("Enter numbers to average");
//
//        while (conin.hasNext()) {
//          if (conin.hasNextDouble()) {
//              sum += conin.nextDouble();
//              count++;
//          } else {
//              String str = conin.next();
//              if(str.equals("done")) break;
//              else {
//                  System.out.println("Data format error");
//                  return;
//              }
//          }
//        }
//        conin.close();
//        System.out.println("Average is " + sum / count);


        String instr = "Name: Tome Age: 12 ID: 77";

        Scanner conin = new Scanner(instr);

        conin.findInLine("Age:");
        if(conin.hasNext()) {
            System.out.println("Age: " + conin.next());
        }
        else {
            System.out.println("Error!");
        }
        conin.close();




    }


        }




