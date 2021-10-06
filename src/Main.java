import java.math.BigInteger;
import java.util.Arrays;

public class Main {

    public static boolean isPalindrome(String text) {
        String reversText = new StringBuilder(text.replaceAll("[^a-zA-Z0-9]", "")).reverse().toString();
        return text.replaceAll("[^a-zA-Z0-9]","").equalsIgnoreCase(reversText); // your implementation here
    }

    public static BigInteger factorial(int value) {
        if (value < 0){
            return BigInteger.ZERO;
        }
        BigInteger a = BigInteger.valueOf(value);
        for (int i = value-1; i > 0; i--){
            a = a.multiply(BigInteger.valueOf(i));
        }
        return a.intValue() == 0 ? BigInteger.ONE : a;
    }

    public static BigInteger factorialReq(int value) {
        if (value < 0){
            return BigInteger.ZERO;
        } else if(value == 0){
            return BigInteger.ONE;
        } else {
            BigInteger a = BigInteger.valueOf(value);
             return a = a.multiply(factorialReq(--value));

        }
    }

    public int determineGroup(int age) {
        if ((age >=7) && (age <= 13)){
            return 1;
        } else if (age <= 17) {
            return 2;
        } else if (age <= 65) {
            return 3;
        } else {
            return -1;
        }
    }

    public int[] evenArray(int number) {
        int even = 2;
        int[] array;
        array = new int[number / 2];
        for (int i = 0; i < array.length; i ++){
            array[i] = even;
            even += 2;
        }
        return array;
    }

    public static void printOddNumbers(int[] arr) {
        StringBuilder str = new StringBuilder();
        for (int i : arr){
            if (i % 2 != 0){
                str.append(i).append(",");
            }
        }
        if (str.length() > 0) {
            str.deleteCharAt(str.lastIndexOf(","));
        }
        System.out.println(str.toString());
    }

    public static void main(String[] args) {
        Main may = new Main();
        printOddNumbers(new int[]{});
        //System.out.println(printOddNumbers(new int[]{3,5,20,8,7,3,100}));

    }
}
