package chapter14_generics;

public class GenMethDemo {

    static <T extends Comparable<T>, V extends T> boolean isIn(T x, V[] y) {
        for (int i=0; i< y.length; i++){
            if(x.equals(y[i])) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Integer nums[] = {1, 2, 3, 4, 5};

        if(isIn(2, nums)){
            System.out.println("2 is in nums");
        }

        if(isIn(12, nums)){
            System.out.println("12 is in nums");
        }

        if(isIn(1, nums)){
            System.out.println("1 is in nums");
        }

        // Use on STRINGS

        String strs[] = {"one", "two", "three", "four", "five"};

        if(isIn("twelve", strs)){
            System.out.println("twelve is in strs");
        }

        if(isIn("one", strs)){
            System.out.println("one is in strs");
        }

        if(isIn("five", strs)){
            System.out.println("five is in strs");
        }


    }

}
