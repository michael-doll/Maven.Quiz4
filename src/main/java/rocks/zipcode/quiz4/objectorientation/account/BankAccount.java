package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 27/12/2018.
 */
public class BankAccount extends Account implements Transactable{
    private Double balance;

    public BankAccount(){}

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public void deposit(Double amountToIncreaseBy) {
        if (amountToIncreaseBy > -1) {
            setBalance(this.balance + amountToIncreaseBy);
        }else{
            throw new IllegalArgumentException();
        }
    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        if(amountToDecreaseBy < 0){
            throw new IllegalArgumentException();
        }
        if(amountToDecreaseBy > this.balance){
            throw new IllegalArgumentException();
        }else{
            setBalance(this.balance - amountToDecreaseBy);
        }
    }

    @Override
    public Double getBalance() {
        return this.balance;
    }
}
