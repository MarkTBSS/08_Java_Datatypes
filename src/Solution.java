//import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        String mockInput = "4\n" +
            "0\n" +
            "1\n" +
            "-1\n" +
            "18446744073709551616\n";
        Scanner scanner = new Scanner(mockInput);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            String message = "can't be fitted anywhere.";
            String typeMessage = "";
            String t = scanner.next();
            try {
                Long tLongType = Long.parseLong(t);
                if (tLongType >= Byte.MIN_VALUE && tLongType <= Byte.MAX_VALUE) {
                    typeMessage += "* byte\n";
                    message = "can be fitted in:";
                } 
                if (tLongType >= Short.MIN_VALUE && tLongType <= Short.MAX_VALUE) {
                    typeMessage += "* short\n";
                    message = "can be fitted in:";
                } 
                if (tLongType >= Integer.MIN_VALUE && tLongType <= Integer.MAX_VALUE) {
                    typeMessage += "* int\n";
                    message = "can be fitted in:";
                } 
                if (tLongType >= Long.MIN_VALUE && tLongType <= Long.MAX_VALUE) {
                    typeMessage += "* long\n";
                    message = "can be fitted in:";
                } 
            } catch (NumberFormatException e) {
                message = "can't be fitted anywhere.";
                typeMessage = "";
            }
            System.out.printf("%s %s%n%s", t, message, typeMessage);
        }
        scanner.close();
    }
}