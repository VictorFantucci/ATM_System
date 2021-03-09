// Account.java
// Represents a bank account

public class Account 
{
 private int accountNumber; // account number
 private int pin; // PIN for authentication
 private double availableBalance; // funds available for withdrawal
 private double totalBalance; // funds available + pending deposits 
 
 // Account constructor initializes attributes
 public Account(int theAccountNumber, int thePIN, double theAvailableBalance, double theTotalBalance)
 {
     accountNumber = theAccountNumber;
     pin = thePIN;
     availableBalance = theAvailableBalance;
     totalBalance = theTotalBalance;
 }// end Account constructor

 // determines whether the user specified PIN matches the PIN of the account
 public boolean validatePIN(int userPIN)
 {
     if(userPIN == pin)
     {
         return true;
     }
     else
     {
        return false;
     }
 }// end method validatePIN

 // returns available balance
 public double getAvailableBalance()
 {
     return availableBalance;
 }// end method getAvailableBalance

 // returns total balance
 public double getTotalBalance()
 {
     return totalBalance;
 }// end methid getTotalBalance

 // credits an amount to the account
 public void credit(double amount)
 {
     totalBalance += amount; // add to total balance
 }// end method credit

 // debits an amount from the account
 public void debit(double amount)
 {
     availableBalance -= amount; // subtract from available balance
     totalBalance -= amount; // subtract from total balance
 }// end method debit

 // returns account number
 public int getAccountNumber()
 {
     return accountNumber;
 }// end method getAccountNumber
}// end class Account
