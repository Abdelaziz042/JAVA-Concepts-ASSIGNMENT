package com.company;
// Omar Abdelaziz      20180178    #1 (+2D Array)    Creating Class Account and its Derived Class aka Class Special Account.
class Special_Account extends Account
{
    /**
     * override function withdraw to act differently if the account of type special
     * in special account there is more options like withdraw where the client can draw money form his account even if his balance is 0
     * but the client can draw  with maximum amount of money which is 1000 L.E
     */

    @Override
    public void withdraw(double value) {
        double current_balance=getBalance()-value; // balance after withdrawing money.
        if(current_balance < -1000 )               // check whether  the current balance has exceeded 1000 or not
            System.out.println("\nYOU HAVE EXCEEDED -1000L.E\n");
        else {
            setBalance(current_balance);
            System.out.println("Successful Transaction.");
        }
    }

    /**
     * default counstructor with account balance set to zero
     */
    Special_Account() {
        setBalance(0.0);
        Account_Type="Special";
    }
    /**
     * override (toString) for printing info
     * @return all the special account's information
     */
    @Override
    public String toString() {
        return String.format("- Account Balance : " + getBalance() + " L.E " +  "\n" + "- Account Number : " + getAccount_number());
    }

}
