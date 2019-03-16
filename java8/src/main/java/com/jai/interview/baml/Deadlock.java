package com.jai.interview.baml;

public class Deadlock extends Thread {


    public static void main(String[] args) {

        Deadlock t1 = new Deadlock();
        Deadlock t2 = new Deadlock();
        Deadlock t3 = new Deadlock();
        t1.start();
        t2.start();
        t3.start();

    }

    public void run() {

        transact(new BankAccount(1000.00), new BankAccount(500), 100.00);
    }

    public void transact(BankAccount debit, BankAccount credit, double amount) {

        synchronized (credit) {
            synchronized (debit) {
                debit.setAmount(debit.getAmount() + amount);
                credit.setAmount(credit.getAmount() - amount);
                System.out.println(debit + ", " + credit);
            }
        }

    }
}


class BankAccount {

    private double amount;

    public BankAccount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "amount=" + amount +
                '}';
    }
}