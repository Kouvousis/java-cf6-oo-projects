package gr.aueb.cf.ch13.bankapp.model;

public class JointAccount {
    private int id;
    private String iban;
    private String firstname1;
    private String lastname1;
    private String ssn1;
    private String firstname2;
    private String lastname2;
    private String ssn2;
    private double balance;

    public JointAccount(int id, String iban, String firstname1, String lastname1, String ssn1, String firstname2, String lastname2, String ssn2, double balance) {
        this.id = id;
        this.iban = iban;
        this.firstname1 = firstname1;
        this.lastname1 = lastname1;
        this.ssn1 = ssn1;
        this.firstname2 = firstname2;
        this.lastname2 = lastname2;
        this.ssn2 = ssn2;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getFirstname1() {
        return firstname1;
    }

    public void setFirstname1(String firstname1) {
        this.firstname1 = firstname1;
    }

    public String getLastname1() {
        return lastname1;
    }

    public void setLastname1(String lastname1) {
        this.lastname1 = lastname1;
    }

    public String getSsn1() {
        return ssn1;
    }

    public void setSsn1(String ssn1) {
        this.ssn1 = ssn1;
    }

    public String getFirstname2() {
        return firstname2;
    }

    public void setFirstname2(String firstname2) {
        this.firstname2 = firstname2;
    }

    public String getLastname2() {
        return lastname2;
    }

    public void setLastname2(String lastname2) {
        this.lastname2 = lastname2;
    }

    public String getSsn2() {
        return ssn2;
    }

    public void setSsn2(String ssn2) {
        this.ssn2 = ssn2;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Public API

    /**
     * Prints the current account balance.
     */
    public void getAccountBalance() {
        System.out.println("Your remaining balance is: " + balance);
    }

    /**
     *  Returns the {@link JointAccount} state in String format.
     *
     * @return
     *      The String representation of the state of the {@link JointAccount}.
     */
    public String accountToString() {
        return "(Account ID: " + id + ", IBAN " + iban + ", Holder No 1: " + firstname1 + " " + lastname1 + ", SSN " + ssn1 + ", Holder No 2: " + firstname2 + " " + lastname2 + ", SSN " + ssn2 + ", Current Balance:  " + balance + ")";
    }

    /**
     *  Checks if the SSN's of both the account holders match the SSN's of the {@link JointAccount}.
     *
     * @param ssn1
     *      The SSN of the first account holder.
     * @param ssn2
     *      The SSN of the second account holder.
     * @return
     *      True if the SSN's match False otherwise.
     */
    private boolean isSsnValid(String ssn1, String ssn2) {
        return this.ssn1.equals(ssn1) && this.ssn2.equals(ssn2);
    }
}
