package Question2;

import java.util.Scanner; 
 
public class BankDemoTest { 
    public static void main (String[] args) throws InsufficientFundsException{ 
        CheckingAccount acc1 = new CheckingAccount(0, 987654321); 
 
        Scanner input = new Scanner(System.in); 
 
        while(true){ 
            try{ 
                System.out.print("Enter an amount to deposit: "); 
                double deposit = input.nextDouble(); 
                double afterDepositBal = acc1.deposit(deposit); 
                System.out.print("Deposit successful. Current balance: $" + afterDepositBal); 
                break; 
            } catch(Exception e){ 
                System.out.print(e.getMessage()); 
            } 
        } 
         
        while(true){ 
            try{ 
                System.out.print("\nEnter an amount to withdraw: "); 
                double withdraw = input.nextDouble(); 
                double afterWithdrawBal = acc1.withdraw(withdraw); 
                System.out.print("The balance after withdraw is: $" + afterWithdrawBal); 
                break; 
            } catch(InsufficientFundsException e){ 
                double balance = acc1.getBalance(); 
                System.out.print("Sorry, but your account is short by: $" + (e.getAmount() - balance)); 
            }  catch(Exception ex){ 
            System.out.print(ex.getMessage()); 
            } 
        } 
 
        input.close(); 
    } 
}