package runsavingsaccount;
import java.util.Scanner;
public class RunSavingsAccount {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        SavingsAccount savings = new SavingsAccount();
        System.out.print("Enter interest rate: ");
        double rate = enter.nextDouble();
        SavingsAccount.setInterestRate(rate);
        System.out.print("Enter deposit amount: P");
        double initialDeposit = enter.nextDouble();
        savings.deposit(initialDeposit);
        
        System.out.print("Press D to deposit or W to withdraw: ");
        char choose =
        enter.next().toUpperCase().charAt(0);
        if (choose == 'D'){
            System.out.print("Enter amount to deposit: P");
            double amount = enter.nextDouble();
            savings.deposit(amount);
        } else if (choose == 'W'){
            System.out.print("Enter amount to withdraw: P");
            double amount = enter.nextDouble();
            double withdrawn = savings.withdraw(amount);
            if (withdrawn == 0){
                System.out.println("Insufficient balance.");
            } else {
                System.out.println("Invaild option.");
            }
        }
        SavingsAccount.ShowBalance(savings);
        if (savings.getBalance() > 1000){
            savings.addInterest();
            System.out.println("Interest applied");
        SavingsAccount.ShowBalance(savings);
        }
        enter.close();
 }
}