import java.util.Scanner;

public class Calculator_ToTal_Invest {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double intterest_rate = 1.0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter investment amount: ");
        money = input.nextDouble();
        System.out.println("Enter investment months: ");
        month = input.nextInt();
        System.out.println("Enter annual interest rate in percentage: ");
        intterest_rate = input.nextDouble();

        double total_interest = 0;
        for (int i = 0 ; i < month ; i++){
            total_interest = money * (intterest_rate / 100)/12 * 3;
        }
        System.out.println("Total interest: " + total_interest);
    }
}
