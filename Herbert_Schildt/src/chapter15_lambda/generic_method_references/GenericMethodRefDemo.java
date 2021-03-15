package chapter15_lambda.generic_method_references;

public class GenericMethodRefDemo {

    static <T> int myOp(MyFunc<T> f, T[] vals, T v){
        return f.func(vals, v);
    }

    public static void main(String[] args) {
        Integer[] vals = { 1, 2, 3, 4, 2, 3, 4, 5, 5};
        String[] strs = {"one", "two", "three", "four"};

        int count;

        count = myOp(MyArrayOps::<Integer>countMatching, vals, 4);
        System.out.println("vals contains " + count + " 4s");

        count = myOp(MyArrayOps::<String>countMatching, strs, "two");
        System.out.println("strs contains " + count + " Twos");

    }

}
