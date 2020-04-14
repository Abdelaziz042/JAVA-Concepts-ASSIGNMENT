package com.company;
// Youssef Gamal       20180340    #2 (+Queue)       Creating Class Client  and its Derived Class aka Class Commercial Account.
public class CommercialClient extends Client
{ /**
 * Attributes for CommercialClient class
 */
    private String CommercialID;
    /**
     * parameterized constructor to set Commercial client's data
     * @param N String for the Name
     * @param ComID String for the Commercial ID
     * @param Add String for the Address
     * @param P String for the the Phone
     * @param CommAcc Object of type Account for each client
     */
    CommercialClient(String N,String ComID,String Add,String P,Account CommAcc)
    {
        super(N,"00000000",Add,P,CommAcc);
        CommercialID=ComID;
        ClientType="Commercial";
    }
    /**
     * Setter for Commercial ID
     * @param ComID String for Commercial ID
     */
    public void setCommercialID(String ComID) { CommercialID=ComID; }
    /**
     * Getter for Commercial ID
     * @return Commercial ID
     */
    public String getCommercialID(){return CommercialID;}

    /**
     * Override to String to Print all the Commercial client's data
     * @return Commercial Client's data
     */
    @Override
    public String toString() {
        return String.format("- Client Name : " + getName() + "\n" + "- Client NationalID : " + getNationalID() + "\n" + "- CommercialID : " + getCommercialID() + "\n" + "- Client Address : " + getAddress() + "\n" + "- Client Phone : " + getPhone() + "\n" + "- Account Type : " + getClient_account().Account_Type + "\n"+"- Client Type : "+ ClientType);
    }
}
