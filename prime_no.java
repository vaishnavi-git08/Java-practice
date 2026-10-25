import java.util.Scanner;
public class prime_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int m = sc.nextInt();

if (m <= 1) {
    System.out.println("not prime");
} else {
    boolean isPrime = true;
    for (int i = 2; i <= Math.sqrt(m); i++) {  //for 2 and 3 it will not enter the loop and isPrime will remain true
        if (m % i == 0) {      // found a factor, so it can't be prime
            isPrime = false;
            break;
        }
    }
    if(isPrime) {
        System.out.println(m + " is prime");
    } else {
        System.out.println(m + " is not prime");
    }
    
}
 


    }
}
