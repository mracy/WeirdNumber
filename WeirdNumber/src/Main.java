import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        String answer = " ";
        if (number % 2 == 1) {
            answer = "weird";
        }else{
            if (number >= 2 && number <= 5) {
                answer = "not weird";
            } else if (number >= 5 && number <= 20) {
                answer = "weird";
            }else {
                answer = "not weird";
            }
        }
        System.out.println(answer);
    }
}