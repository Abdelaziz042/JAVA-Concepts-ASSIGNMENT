package com.company;
// Youssef Gamal       20180340    #2 (+Queue)       Creating Class Client  and its Derived Class aka Class Commercial Account.
public class Client
{
    /**
     * Attributes for Client class
     */

    private String Name;
    private String NationalID;
    private String Address;
    private String Phone;
    private Account ClientAccount;
    protected String ClientType;

    /**
     * parameterized constructor to initialize client's data
     * @param N String for the Name
     * @param NID String for the National ID
     * @param Add String for the Address
     * @param P String for the the Phone
     * @param account an object indicates client's account
     */

    Client(String N, String NID, String Add, String P, Account account)
    {
        Name = N;
        NationalID = NID;
        Address = Add;
        Phone = P;
        this.ClientAccount=account;
        ClientType="Normal";
    }

    /**
     * Setter for Name
     * @param n String for Name
     */
    public void setName(String n) { Name = n; }
    /**
     * Setter for National ID
     * @param NID String for National ID
     */
    public void setNationalID(String NID) { NationalID = NID; }

    /**
     * Setter for Address
     * @param add String for Address
     */
    public void setAddress(String add) { Address = add; }
    /**
     * Setter for Phone
     * @param P String for Phone
     */
    public void setPhone(String P) { Phone = P; }

    public String getName() { return Name; }
    /**
     * Getter for Name
     * @return Name
     */
    public String getNationalID() { return NationalID; }
    /**
     * Getter for National ID
     * @return National ID
     */
    public String getAddress() { return Address; }
    /**
     * Getter for Address
     * @return Address
     */
    public String getPhone() { return Phone; }
    /**
     *
     * @return Client's Account
     */
    public Account getClient_account(){return ClientAccount;}

    /**
     * Override the method toString to Print all the client's data
     * @return Client's data
     */
    @Override
    public String toString() {
        return String.format("- Client Name : " + getName() + "\n" + "- Client NationalID : " + getNationalID() + "\n" + "- Client Address : " + getAddress() + "\n" + "- Client Phone : " + getPhone() + "\n" + "- Account Type : " + getClient_account().Account_Type + "\n"+"- Client Type : "+ ClientType);
    }
}