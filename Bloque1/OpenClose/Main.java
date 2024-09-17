public class Main {
    public static void main(String[] args) {
        Account c1 = new Account(100, "Ingrid", "current"); 
        System.out.println(c1.CalculatedInterest());
    }
}

abstract class Account{

    protected double balance; 
    protected static String name;
    protected static String accountType;

    public double getBalance(){
        return balance;
        
    }

}

class CurrentAccount extends Account{
    public CurrentAccount(double balance){
        super();
    }

    @Override
    public double getBalance(){
        return balance * 0.2; 

    }
}

class SavingClass extends Account{
    public void SavingAccount(double balance ){

    }
}
