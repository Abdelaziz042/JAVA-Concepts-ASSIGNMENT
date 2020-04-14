// Assignment Members

// Name                ID          Problem           Description

// Mostafa Esmail      20180275    #3 (+Biased)      Integrating the two classes together into ArrayList.
// Omar Abdelaziz      20180178    #1 (+2D Array)    Creating Class Account and its Derived Class aka Class Special Account.
// Youssef Gamal       20180340    #2 (+Queue)       Creating Class Client  and its Derived Class aka Class Commercial Account.

// Date 2020/2/22

package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Bonus Part - 2D Array

        /*
        System.out.println("2D Array Problem");
        Array2D ArrayTwoDimensional= new Array2D(3,3);

        //   [0][0:2]   ,  [1][0:2]  ,  [2][0:2]
       // { {42,23,61}  , {36,94,85} , {15,39,40} }

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.println("ArrayTwoDimensional" + "["+ i + "]"+"["+j+"]" + " : ");
                ArrayTwoDimensional.add(i,j,input.nextInt());
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)
                System.out.println("ArrayTwoDimensional" + "["+ i + "]"+"["+j+"]" + " : " + ArrayTwoDimensional.Fetch(i,j));
        }

        */

        // Bonus Part - Implementing Queue using Class Array - Composition

        /*
        System.out.println("Queue Problem");
        Queue QueueMe = new Queue(4); // QueueMe consists of 4 elements

        // Adding values to the Queue
        QueueMe.Queueing(2);
        QueueMe.Queueing(4);
        QueueMe.Queueing(6);
        QueueMe.Queueing(8);

        //Checking if it's full
        if(QueueMe.IsFull()) System.out.println("QueueMe is Full");
        else System.out.println("QueueMe still has some space.");

        //Checking if it's empty
        if(QueueMe.IsEmpty()) System.out.println("QueueMe is empty");
        else System.out.println("QueueMe is not empty");
        // Trying to add element.

        QueueMe.Queueing(10); // cannot add new element to the queue because it's full.

*/

        // Bonus Part - Group Task

        /*
        System.out.println("1D Array Problem - Group Task");
        Array ArrayOneDimensional = new Array(3);

        for(int i=0; i < ArrayOneDimensional.ArraySize() ; i++ ){
            System.out.println("ArrayOneDimensional"+"["+i+"] : ");
            ArrayOneDimensional.addElement(i,input.nextInt());
        }

        for(int i=0; i < ArrayOneDimensional.ArraySize() ; i++ ){
            System.out.println("ArrayOneDimensional"+"["+i+"] : " + ArrayOneDimensional.elementAt(i));
        }

        ArrayOneDimensional.ensure(4); // extend the array to contain 4 elements instead of 3 .

        ArrayOneDimensional.addElement(3,23);

        for(int i=0; i < ArrayOneDimensional.ArraySize() ; i++ ){
            System.out.println("ArrayOneDimensional"+"["+i+"] : " + ArrayOneDimensional.elementAt(i));
        }
    */

        // Bonus Part - Biased Array

        /*
        System.out.println("Biased Array Problem");

        int bias = 2;
        int size = 4;
        int upperLimit= bias+size;
        Array biased =new Biased_Array(size,bias);

        for(int i=bias;i<upperLimit;i++){
            System.out.println("biased"+"["+i+"] : " );
            biased.addElement(i,input.nextInt());
        }
        for(int i=bias;i<upperLimit;i++)
            System.out.println("biased"+"["+i+"] : "+ biased.elementAt(i));

        biased.addElement(2,25);

        for(int i=bias;i<upperLimit;i++)
            System.out.println("biased"+"["+i+"] : "+ biased.elementAt(i));

        */

        // Main Task  - Bank problem

        String BankName="", BankAddress="", BankPhone="";

        System.out.println("Bank Name : " );
        BankName = input.nextLine();
        System.out.println("Address : " );
        BankAddress = input.nextLine();
        System.out.println("Phone : " );
        BankPhone = input.next();

        Bank BankObject = new Bank(BankName, BankAddress, BankPhone); // Creating a Bank object and passing arguments to the parameterized constructor

        System.out.println("\n\t" + "Welcome in " + BankObject.name_getter() + "\n");

        int menuChoice = 0;
        int Account_Number=0;

        do {
            System.out.println("1. Add a new client");
            System.out.println("2. Show all accounts");
            System.out.println("3. Withdraw");
            System.out.println("4. Deposit");
            System.out.println("5. Display bank information");
            System.out.println("6. Edit bank information");
            System.out.println("7. Delete Client from Bank's Database");
            System.out.println("8. Exit");

            System.out.println("Choice : ");

            menuChoice = input.nextInt();

            input.nextLine();

            switch (menuChoice) {
                case 1: {
                    int typeClientMenu, typeAccountMenu; // Integer Values used to indicate typeClient   either  it's Normal or Commercial
                                                         //                                 typeAccount  either  it's Normal or Special

                    System.out.println("Are you a Normal client or Commercial Client?");
                    do {
                        System.out.println("1. Normal Client \n2. Commercial Client \n3. Return to the main menu\n\nChoice : ");
                        typeClientMenu = input.nextInt();

                        if (typeClientMenu==3) break; // Break from the loop

                    } while (typeClientMenu != 1 && typeClientMenu != 2);
                    input.nextLine();

                    if(typeClientMenu==3) break; // Break from the case

                    System.out.println("Do you want Normal Account or Special Account?");

                    do {
                        System.out.println("1. Normal Account \n2. Special Account \n3. Return to the main menu\n\nChoice :  ");
                        typeAccountMenu = input.nextInt();
                        if (typeAccountMenu==3) break; // Break from the loop

                    } while (typeAccountMenu != 1 && typeAccountMenu != 2);
                    input.nextLine();

                    if (typeAccountMenu==3) break; // Break from the case

                    // workaround to fix some problem occurs when input is skipped after entering an integer value

                    String Name = "", Address = "", Phone = "", NationalID = "", CommercialID = "";

                    System.out.println("Name (or Company Name) : ");
                    Name = input.nextLine();

                    if (typeClientMenu == 1) {
                        System.out.println("National ID : ");
                        NationalID = input.next();
                    }

                    if (typeClientMenu == 2) {
                        System.out.println("Commercial ID: ");
                        CommercialID = input.next();
                    }
                    input.nextLine();

                    System.out.println("Address : ");
                    Address = input.nextLine();
                    System.out.println("Phone Number : ");
                    Phone = input.next();

                    Account ClientAccount = typeAccountMenu == 1 ? new Account() : new Special_Account();
                    Client ClientObject = typeClientMenu == 1 ? new Client(Name, NationalID, Address, Phone, ClientAccount) : new CommercialClient(Name, CommercialID, Address, Phone, ClientAccount);
                    // Creating two objects, One client object and the other is account object to be passed in their Constructors based on the information above.
                    // I used ternary operator as a conditional statement to make the statement look clear and simple     ( if --  then -- formula )

                    BankObject.addData(ClientObject); // adding Client to the BankDatabase

                    System.out.println("A Client has been added to the Bank Database and his Account Number is " + ClientObject.getClient_account().getAccount_number());
                }
                break;
                case 2:
                    System.out.println("Number of Clients in the Bank : " + BankObject.NumberOfClients() + "\n");
                    BankObject.displayData();
                    break;
                case 3:
                    if (BankObject.NumberOfClients() == 0)
                        System.out.println("No accounts exist in the database");
                    else {
                        System.out.println("Account Number : ");
                        Account_Number = input.nextInt();
                        BankObject.ManipulateBalance(Account_Number, 'W');
                    }
                    break;
                case 4:
                    if (BankObject.NumberOfClients() == 0)
                        System.out.println("No accounts exist in the database");
                    else {
                        System.out.println("Account Number : ");
                        Account_Number = input.nextInt();
                        BankObject.ManipulateBalance(Account_Number, 'D');
                    }
                    break;
                case 5:
                    System.out.println(BankObject);
                    System.out.println("\n");
                    break;
                case 6: {
                    int editChoiceMenu = 0;
                    String Edit = "";

                    do {
                        System.out.println("1. Edit Name ");
                        System.out.println("2. Edit Address ");
                        System.out.println("3. Edit Phone ");
                        System.out.println("4. Return to the main menu");
                        System.out.println("\nChoice : ");
                        editChoiceMenu = input.nextInt();

                        if (editChoiceMenu==4) break; // break from the loop
                    } while (editChoiceMenu != 1 && editChoiceMenu != 2 && editChoiceMenu != 3);

                    if (editChoiceMenu==4) break; // break from the case

                    input.nextLine();

                    if (editChoiceMenu == 1) {
                        System.out.println("Old Bank Name : " + BankObject.name_getter());
                        System.out.println("New Bank Name : ");
                        Edit = input.nextLine();

                        BankObject.name_setter(Edit);
                        System.out.println("Bank Name has been changed!");

                    } else if (editChoiceMenu == 2) {
                        System.out.println("Old Bank Address : " + BankObject.address_getter());
                        System.out.println("New Bank Address : ");
                        Edit = input.nextLine();

                        BankObject.address_setter(Edit);
                        System.out.println("Bank Address has been changed!");

                    } else {
                        System.out.println("Old Bank Phone Number : " + BankObject.phone_getter());
                        System.out.println("New Bank Phone Number : ");
                        Edit = input.nextLine();

                        BankObject.phone_setter(Edit);
                        System.out.println("Bank Phone Number has been changed!");
                    }
                }
                    break;
                case 7:
                    if (BankObject.NumberOfClients() == 0)
                        System.out.println("No accounts exist in the database");
                    else {
                        int accountNumber;
                        System.out.println("Account Number : ");
                        accountNumber = input.nextInt();
                        input.nextLine();
                        BankObject.deleteClientFromDatabase(accountNumber);
                    }
                    break;
                case 8:
                    System.out.println("Thanks for using the program.");
                    break;
                default:
                    System.out.println("Wrong Input");
            }
        } while (menuChoice != 8);


    } // End of Main()
} // End of Class Main