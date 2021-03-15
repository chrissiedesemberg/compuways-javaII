package chapter15_lambda.instance_method_references;

public class InstanceMethWithoutObjectRefDemo {

    static <T> int counter(T[] vals, MyFunc<T> f, T v) {
        int count = 0;

        for(int i = 0; i < vals.length; i++) {
            if(f.func(vals[i], v)) count++;
        }
        return count;
    }

    public static void main(String[] args) {

        int count;

        HighTemp[] weekDayHighs = {new HighTemp(30), new HighTemp(24), new HighTemp(28), new HighTemp(26),
                new HighTemp(27), new HighTemp(33), new HighTemp(34), new HighTemp(32), new HighTemp(31),
                new HighTemp(20), new HighTemp(21),new HighTemp(30), new HighTemp(23), new HighTemp(19)};

        count = counter(weekDayHighs, HighTemp::sameTemp, new HighTemp(30));
        System.out.println(count + " days had a high of 30");

        HighTemp[] weekDayHighs2 = {new HighTemp(10), new HighTemp(12), new HighTemp(13), new HighTemp(19),
                new HighTemp(16), new HighTemp(15), new HighTemp(19), new HighTemp(12), new HighTemp(11),
                new HighTemp(12), new HighTemp(11),new HighTemp(12), new HighTemp(10), new HighTemp(12)};

        count = counter(weekDayHighs2, HighTemp::sameTemp, new HighTemp(10));
        System.out.println(count + " days had a high of 10");

        count = counter(weekDayHighs, HighTemp::lessThanTemp, new HighTemp(30));
        System.out.println(count + " days had temperature less than 30");

        count = counter(weekDayHighs2, HighTemp::lessThanTemp, new HighTemp(12));
        System.out.println(count + " days had temperature less than 12");
    }
}
