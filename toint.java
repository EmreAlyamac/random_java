import java.util.Scanner;

public class toint {
    public static void main(String[] args) {

        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int len = s.length();
        int number = 0;
        for (int i = 0; i < len; i++) {
            int digit = (s.charAt(len-1-i));
            digit -= 48;
            number += digit * Math.pow(10, i);
            

        }
        System.out.println(number);
    }
}

