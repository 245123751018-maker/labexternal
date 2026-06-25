import java.util.Scanner;

class ReverseNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n, rev = 0, r;

        System.out.println("Enter a number:");
        n = sc.nextInt();

        while (n > 0) {
            r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }

        System.out.println("Reverse of Number is: " + rev);

        sc.close();
    }
}
