package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {
    private Integer indexNumber;

    ArrayList<BankAccount> bankAccounts = new ArrayList<>();
    public Bank(){}

    //was returning BankAccount
    public void removeBankAccountByIndex(Integer indexNumber) {
        if(containsBankAccount(bankAccounts.get(indexNumber))){
            bankAccounts.remove(bankAccounts.get(indexNumber));
        }
    }

    public void addBankAccount(BankAccount bankAccount) {
        if(!containsBankAccount(bankAccount)){
            bankAccounts.add(bankAccount);
        }
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
        return bankAccounts.contains(bankAccount);
    }
}
