package designPatterns.creational.builder;

public class BankAccount {
    private int id;
    private String owner;
    private String branch;
    private double balance;
    private double interestRate;

    public int getId() {
        return id;
    }

    public String getOwner() {
        return owner;
    }

    public String getBranch() {
        return branch;
    }

    public double getBalance() {
        return balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public static class Builder{
        private int id;
        private String owner;
        private String branch;
        private double balance;
        private double interestRate;

        public Builder(int id) {
            this.id = id;
        }

        public Builder addOwner(String owner) {
            this.owner = owner;
            return this;
        }

        public Builder addBranch(String branch) {
            this.branch = branch;
            return this;
        }

        public Builder addBalance(double balance) {
            this.balance = balance;
            return  this;
        }

        public Builder addInterestRate(double interestRate) {
            this.interestRate = interestRate;
            return this;
        }

        public BankAccount build() {
            BankAccount bankAccount = new BankAccount();
            bankAccount.id = this.id;
            bankAccount.balance = this.balance;
            bankAccount.branch = this.branch;
            bankAccount.owner = this.owner;
            bankAccount.interestRate = this.interestRate;
            return bankAccount;
        }


    }

    public BankAccount() {

    }
}
