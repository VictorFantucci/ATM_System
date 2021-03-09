// BankDatabase.javaFiles
// Represents the bank account information database

public class BankDatabase 
{
    private Account[] accounts; // array of Accounts

    // no-argument BankDatabase constructor initializes accounts
    public BankDatabase()
    {
        accounts = new Account[2]; // 2 accounts for testing
        accounts[0] = new Account(12345, 54321, 1000.0, 1200.0);
        accounts[1] = new Account(98765, 56789, 200.0, 200.0);
    }// end no-argument BankDatabase constructor

    //retrive Account object containing specified account number
    private Account getAccount(int accountNumber)
    {
        // loop through accounts searching for matching account number
        for (Account currentAccount : accounts)
        {
            //return the current account if a match is found
            if (currentAccount.getAccountNumber() == accountNumber)
            {
                return currentAccount;
            }
        }// end for loop

        return null; // if no matching account is found, return null
    }// end method getAccount

    // determine whether the user specified account number and PIN matches
    // those of an account in the database
    public boolean authenticateUser(int userAccountNumber, int userPIN)
    {
        // attempt to retrieve the account with the specified account number
        Account userAccount = getAccount(userAccountNumber);

        // if account exists, return result of Account method validatePIN
        if(userAccount != null)
        {
            return userAccount.validatePIN(userPIN);
        }
        else
        {
            return false; // account number not found, so return false
        }
    }// end method authenticateUser

    //return available balance of Account with specified account number
    public double getAvailableBalance(int userAccountNumber)
    {
        return getAccount(userAccountNumber).getAvailableBalance();
    }// end method getAvailableBalance

    // return total balance of Account with specified account number
    public double getTotalBalance(int userAccountNumber)
    {
        return getAccount(userAccountNumber).getTotalBalance();
    }// end method getTotalBalance

    // credit an amount to Account with specified account number
    public void credit(int userAccountNumber, double amount)
    {
        getAccount(userAccountNumber).credit(amount);
    }// end method credit

    //debit an amount to Account with specified account number
    public void debit(int userAccountNumber, double amount)
    {
        getAccount(userAccountNumber).debit(amount);
    }// end method debit
}// end class BankDatabase
