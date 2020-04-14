package com.company;

import java.util.ArrayList;
import java.util.Scanner;
// Mostafa Esmail      20180275    #3 (+Biased)      Integrating the two classes together into ArrayList.
public class Bank {
    /**
     * Attributes for the Bank class
     */
        private String Name;
        private String Address;
        private String Phone;
        private ArrayList<Account> list_of_accounts  = new ArrayList<Account>();
        private ArrayList<Client> list_of_clients  = new ArrayList<Client>();

    /**
     * Parameterized constructor that initializes Bank's Data
     * @param name String for the Bank Name
     * @param address String for the Bank Address
     * @param phone  the Bank Phone
     */
        Bank(String name , String address , String phone)
        {
            Name = name ;
            Address = address;
            Phone = phone;
        }
    /**
     * set the bank name
     * @param name String
     */
    public void name_setter (String name) { Name = name; }

    /**
     * set the bank address
     * @param add String
     */
    public void address_setter (String add) { Address = add; }

    /**
     * set the bank phone
     * @param phone String
     */
    public void phone_setter(String phone) { Phone = phone;}

    /**
     * Retrieve the name of the bank
     * @return Name
     */

    public String name_getter(){return Name;}

    /**
     * Retrieve the address of the bank
     * @return Address
     */
    public String address_getter(){return Address;}

    /**
     * Retrieve the Phone Number of the bank
     * @return Phone
     */
    public String phone_getter(){return Phone;}

    /**
     * Add a client and its account to the Bank ArrayList
     * @param client1 object from class Client
     */
        public void addData(Client client1)
        {
            list_of_accounts.add(client1.getClient_account());
            list_of_clients.add(client1);
        }
    /**
     * a function that prints the bank's database. Clients and their Accounts
     *
     */
        public void displayData()
        {
            for(int i=0 ; i<list_of_clients.size(); i++)
            {
                System.out.println("\tDetails of Client " + "#"+ (i+1) + " : ");
                System.out.println(list_of_clients.get(i) + "\n");
                System.out.println("\tDetails of Client's #" + (i+1) + " Account : ");
                System.out.println(list_of_accounts.get(i));
                System.out.println("-----------------------------------------");
            }
        }

    /**
     * Manipulate Clients' Balance to withdraw or deposit money
     * @param Account_Number an integer value indicates Client's Account Number.
     * @param type a character indicates Clients' choice.
     */
        public void ManipulateBalance(int Account_Number,char type)
        {
            Scanner input= new Scanner(System.in);
            int current_account = -1;
            double value;
            for(int i=0;i<list_of_accounts.size();i++)
            {
                if(list_of_accounts.get(i).getAccount_number()==Account_Number) {
                    current_account=i;
                    break;
                }
            }

            if(current_account==-1)
                System.out.println("Account Number " + Account_Number + " is not exists in the Bank Database ." );
            else
                {
                    if (type == 'W') {
                        System.out.println("Value : ");
                        value=input.nextDouble();
                        list_of_clients.get(current_account).getClient_account().withdraw(value);
                    }
                    else if (type == 'D') {
                        System.out.println("Value : ");
                        value=input.nextDouble();
                        list_of_clients.get(current_account).getClient_account().deposit(value);
                    }
                }
        }

    /**
     * Number of Clients
     * @return ClientList Capacity
     */
    public int NumberOfClients(){return list_of_clients.size();}

    /**
     * delete a client from the database given his account number
     * @param AccountNumber integer value
     */
    public void deleteClientFromDatabase(int AccountNumber)
    {
        int clientExist= -1;

        for(int clientIndex=0;clientIndex<list_of_clients.size();clientIndex++)
        {
         if(AccountNumber==list_of_accounts.get(clientIndex).getAccount_number())
            {
             list_of_clients.remove(clientIndex);
             list_of_accounts.remove(clientIndex);
             System.out.println("Account "+ AccountNumber + " has been removed from the Database");
             clientExist=1;
             break;
            }
        }
            if(clientExist ==-1) System.out.println("This Account number isn't available");
    }
    /**
     * Override the method toString to Print all details of the bank
     * @return Bank's data
     */
    @Override
    public String toString() {
        return String.format("- Bank : " + name_getter() + "\n" + "- Address : " + address_getter() + "\n" + "- Phone : " + phone_getter());
    }

}
