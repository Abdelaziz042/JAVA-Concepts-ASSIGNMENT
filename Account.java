package com.company;
// Omar Abdelaziz      20180178    #1 (+2D Array)    Creating Class Account and its Derived Class aka Class Special Account.
public class Account
{
    /**
     *  Attributes for the Account class
     */
    private double balance;
    private int account_number;
    public String Account_Type;
    static int NoAccounts=123;

    /**
     *  Default Constructor that initializes account's attributes
     */
    Account() {
        balance=0.0;
        Account_Type="Normal";
        account_number=NoAccounts++;
        //System.out.println("Super,Normal");
    }
    /**
     *set the Balance
     * @param b for the value of balance of account
     */
    public void setBalance(double b)
    {
        balance=b;
    }
    /**
     * get account type
     * @return type of the created account
     */
    public String getAccount_Type(){return Account_Type;}
    /**
     * get the value of balance
     * @return the value of the balance in the account
     */
    public double getBalance(){return balance;}
    /**
     * get the account specific number
     * @return the account's number
     */
    public int getAccount_number(){return account_number;}
    /**
     * method for withdraw from your account.
     * @param value for declaring the amount of money you want to draw from your current account.
     * your current balance must be much bigger than the amount of money you want to draw.
     */
    public void withdraw(double value) {
        if(value> balance)
            System.out.println("Your balance is not sufficient");
        else {
            balance -= value;
            System.out.println("Successful Transaction.");
        }
    }
    /**
     * method for deposit in your account
     * @param value for declaring the amount of money you want to deposit in your account
     * you must add money paper at least bigger than 20 pounds
     */
    public void deposit(double value) {
        if(value < 0.0)
            System.out.println("Your added value is not valid");
        else{ balance+=value;
            System.out.println("Successful Transaction.");
        }
    }
    /**
     *  override (toString) for printing info about the account
     * @return all the  account's information
     */
    @Override
    public String toString() {
        return String.format("- Account Balance : " + getBalance() + " L.E " +  "\n" + "- Account Number : " + getAccount_number());
    }
}
