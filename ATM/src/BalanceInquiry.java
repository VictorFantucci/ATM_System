// BalanceInquiry.java 
// Represents a balance inquiry ATM transaction

public class BalanceInquiry  extends Transaction
{
 // BalanceInquiry constructor
 public BalanceInquiry(int userAccountNumber, Screen atmScreen, BankDatabase atmBankDatabase)
 {
     super(userAccountNumber, atmScreen, atmBankDatabase);
 }// end BalanceInquiry constructor
 
 // perform the transaction
 @Override
 public void execute()
 {
     //get references to bank database and screen
     BankDatabase bankDatabase = getBankDatabase();
     Screen screen = getScreen();

     // get available balance for the account involved
     double availableBalance = bankDatabase.getAvailableBalance(getAccountNumber());
     
     // get total balance for the account involved
     double totalBalance = bankDatabase.getTotalBalance(getAccountNumber());

     // display the balance information on the screen
     screen.displayMessageLine("\nBalanceInformation:");
     screen.displayMessage(" - Available Balance: ");
     screen.displayDollarAmount(availableBalance);
     screen.displayMessageLine("\nTotal Balance: ");
     screen.displayDollarAmount(totalBalance);
     screen.displayMessageLine("");
 }// end method execute
}// end class BalanceInquiry
