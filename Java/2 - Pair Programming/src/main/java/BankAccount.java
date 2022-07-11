public class BankAccount {
    private String _name;
    private Integer _accountNumber;
    private Float _balance;

    BankAccount(String name, Integer accountNumber, Float balance) {
        this._name = name;
        this._accountNumber = accountNumber;
        this._balance = balance;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String name) {
        this._name = name;
    }

    public Integer get_accountNumber() {
        return _accountNumber;
    }

    public void set_accountNumber(Integer accountNumber) {
        this._accountNumber = accountNumber;
    }

    public Float get_balance() {
        return _balance;
    }

    public void set_balance(Float balance) {
        this._balance = balance;
    }

    public void deposit(Integer accountNumber, Float amount) {
        if (this._accountNumber == accountNumber) {
            this._balance += amount;
        }
    }

    public void withdraw(Integer accountNumber, Float amount) {
        if (this._accountNumber == accountNumber) {
            this._balance -= amount;
        }
    }

}
