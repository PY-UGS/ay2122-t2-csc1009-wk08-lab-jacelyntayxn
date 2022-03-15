package Question2;

public class CheckingAccount { 
    private double balance; 
    private double number; 
 
    public CheckingAccount(double balance , double number) { 
        this.balance = balance; 
        this.number = number; 
    } 
 
    public double deposit(double amt) throws Exception{ 
        if (amt <= 0){ 
            throw new Exception("Sorry, please deposit a positive value\n"); 
        } 
        else{ 
            balance += amt; 
            return balance; 
        } 
         
    } 
 
    public double withdraw(double amt) throws InsufficientFundsException, Exception{ 
        if (balance < amt){ 
            throw new InsufficientFundsException(amt); 
        } 
        else if(amt <= 0){
            throw new Exception("Cannot withdraw negative amount");
        }
        else {  
            balance -= amt; 
            return balance; 
        } 
         
    } 
 
    public double getBalance() { 
        return balance; 
    } 
 
    public double getNumber() { 
        return number; 
    } 
 
     
}