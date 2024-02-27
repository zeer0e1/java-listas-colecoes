package Desafios.Classes;

public class ContaBancaria {
    private final int numberAccount;
    private double salt;

    public ContaBancaria(int numberAccount,double saldo){
        this.numberAccount = numberAccount;
        this.setSalt(saldo);
    }

    public double getSalt() {
        return salt;
    }

    public void setSalt(double salt) {
        this.salt = salt;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public void sacar(double value){
        if(value > salt){
            System.out.println("This value is more than your money in your account.");
        }else{
            this.salt -= value;
            System.out.println("Value in your account: " + getSalt() );
        }
    }

    public void deposite(double value){
        this.salt += value;
        System.out.println("Value in your account: " + getSalt() );

    }



}
