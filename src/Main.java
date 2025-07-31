import java.util.Scanner;

public class TotalNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalNumber = 0; 
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter number " + i + ": ");
            
            int enterNumber = scanner.nextInt(); 
            totalNumber += enterNumber;        
        }
        System.out.println("\nTotal Number: " + totalNumber);

        scanner.close();
            
        }
}
